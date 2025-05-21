package com.himanth;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;

public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Database Connection Details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/Genome_data";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Chicken65";

    // Display the main form
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // HTML form with multiple actions
//        out.println("<html><body>");
//        out.println("<h2>Employee Management</h2>");
//        out.println("<form action='SearchServlet' method='post'>");
//        out.println("<input type='radio' name='action' value='search' checked> Search Employee by ID<br>");
//        out.println("ID: <input type='text' name='query' /><br><br>");
//        out.println("<input type='radio' name='action' value='insert'> Insert New Employee<br>");
//        out.println("ID: <input type='text' name='id' /><br>");
//        out.println("Name: <input type='text' name='emp_name' /><br>");
//        out.println("Salary: <input type='text' name='salary' /><br><br>");
//        out.println("<input type='radio' name='action' value='update'> Update Employee Salary<br>");
//        out.println("ID: <input type='text' name='id' /><br>");
//        out.println("New Salary: <input type='text' name='salary' /><br><br>");
//        out.println("<input type='radio' name='action' value='delete'> Delete Employee by ID<br>");
//        out.println("ID: <input type='text' name='id' /><br><br>");
//        out.println("<input type='radio' name='action' value='view_all'> View All Employees<br><br>");
//        out.println("<input type='radio' name='action' value='drop'> Drop Employees Table<br><br>");
//        out.println("<input type='submit' value='Submit' />");
//        out.println("</form>");
//        out.println("</body></html>");
    }

    // Handle POST requests
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
    	PrintWriter pw = response.getWriter();
    	
    	

         // Connect to the database
         Connection connection = null; 

         // Perform the appropriate action
         Statement statement = null; 
		String param = request.getParameter("param").trim().length() == 0 ? null : request.getParameter("param").trim();
		String val = request.getParameter("val").trim().length() == 0 ? null : request.getParameter("val").trim().toUpperCase();
		String val1 = request.getParameter("val1").trim().length() == 0 ? null : request.getParameter("val1").trim();
		String val2 = request.getParameter("val2").trim().length() == 0 ? null : request.getParameter("val2").trim();
		String val3 = request.getParameter("val3").trim().length() == 0 ? null : request.getParameter("val3").trim();
		String val4 = request.getParameter("val4").trim().length() == 0 ? null : request.getParameter("val4").trim();
		String val5 = request.getParameter("val5").trim().length() == 0 ? null : request.getParameter("val5").trim();
		String val6 = request.getParameter("val6").trim().length() == 0 ? null : request.getParameter("val6").trim();
		response.setContentType("text/html");
        try {
            // Load JDBC Driver
        	 Class.forName("com.mysql.cj.jdbc.Driver");
        	 connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        	 statement = connection.createStatement();
			if (null != param && (param.equals("DS_NAME") || param.equals("DS_DESC") || param.equals("DS_TYPE"))) {
				pw.println(getPatientCount(param, val, statement));
				val = null;
				param = null;
			} else if (null != val1) {
				pw.println(listType(val1, statement));
				val1 = null;
			}else if (null != val2 && null != val3) {
				pw.println(query3(val2, val3, statement));
				val2 = null; val3 = null;
			}
			else if (null != val4) {
				pw.println(TStats(val4, statement));
				val4 = null;
			} else if (null != val5) {
				pw.println(FStats(val5, statement));
				val5 = null;
			} else if (null != val6) {
				pw.println(otherQuery(val6, statement));
				val6 = null;
			}
			pw.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != statement)
					statement.close();

				if (null != connection)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private String getPatientCount(String param, String val, Statement statement) {
		StringBuilder html = new StringBuilder();
		try {
			System.out.println("connection established successfully...!!");
			String query = "select count(distinct P_ID) from M_DIAGNOSIS md , D_DISEASE dd where md.ds_id = dd.ds_id and trim(upper(" +param +")) = '" +val +"'";
			
			System.out.println(query);
			ResultSet rs = statement.executeQuery(query);
			html.append("<table align = center width=30% border=1>");
			html.append("<tr><td>Count of Patients</td></tr>");
			StringBuilder sb = new StringBuilder();
			int i = 1;
			while (rs.next()) {
				sb.append("<tr><td>").append(rs.getInt(i)).append("</td></tr>");
				i++;
			}
			html.append(sb);
			html.append("</table>");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return html.toString();
	}

	private String listType(String val, Statement statement) {
		StringBuilder html = new StringBuilder();
		try {
			System.out.println("connection established successfully...!!");
			String query = "select distinct DR_TYPE from D_DRUG where DR_ID IN (select DR_ID from FACT_CLINICAL where DS_ID IN (select DS_ID from D_DISEASE where DS_DESC ="
					+ "'" + val + "'))";
			System.out.println(query);
			ResultSet rs = statement.executeQuery(query);
			html.append("<table align = center width=30% border=1>");
			html.append("<tr><td><b>Type of Drugs</b></td></tr>");
			StringBuilder sb = new StringBuilder();
			while (rs.next()) {
				sb.append("<tr><td>").append(rs.getString("DR_TYPE"))
						.append("</td></tr>");
			}
			html.append(sb);
			html.append("</table>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return html.toString();
	}
	private String query3(String val, String val1, Statement statement) {
		StringBuilder html = new StringBuilder();
		try {
			System.out.println("connection established successfully...!!");
			String query = "select EXP from FACT_MICROARRAY where MU_ID ="+val1 +" and S_ID in (select S_ID from FACT_CLINICAL where S_ID is not null and P_ID in (select P_ID from FACT_CLINICAL where DS_ID = (select D_DISEASE.DS_ID from D_DISEASE where DS_NAME ='ALL'))) and PB_ID in (select PB_ID from D_PROBE where U_ID in (select U_ID from FACT_GENE where CL_ID =" +val+"))";
			System.out.println(query);
			ResultSet rs = statement.executeQuery(query);
			html.append("<table align = center width=30% border=1>");
			html.append("<tr><td><b>EXP</b></td></tr>");
			StringBuilder sb = new StringBuilder();
			while (rs.next()) {
				sb.append("<tr><td>").append(rs.getString("EXP")).append("</td></tr>");
			}
			html.append(sb);
			html.append("</table>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return html.toString();
	}
	private String TStats(String val, Statement statement) {
		StringBuilder html = new StringBuilder();
		try {
			System.out.println("connection established successfully...!!");
			String query = "SELECT \n"
					+ "    CASE \n"
					+ "        WHEN md.sympton = 'ALL' THEN 'ALL' \n"
					+ "        ELSE 'OTHERS' \n"
					+ "    END AS symptom_group,\n"
					+ "    vpg.EXP,\n"
					+ "    'STATISTIC' AS statistic_label, \n"
					+ "    'ALL' AS statistic_value\n"
					+ "FROM \n"
					+ "    view_patient_till_go vpg\n"
					+ "JOIN \n"
					+ "    m_diagnosis md \n"
					+ "ON \n"
					+ "    vpg.P_ID = md.P_ID\n"
					+ "WHERE \n"
					+ "    vpg.GO_ID = "+val;
			System.out.println(query);
			ResultSet rs = statement.executeQuery(query);
			html.append("<table align = center width=50% border=1>");
			html.append("<tr colspan=1><td width=100%><b>TSTATS</b></td></tr>");
			html.append("<tr colspan=2><td width=50%><b>T_OBSERVED</b></td><td width=50%><b>TWO_SIDED_P_VALUE</b></td></tr>");
			StringBuilder sb = new StringBuilder();
			sb.append("<tr>");
			while (rs.next()) {
				sb.append("<td width=50%>").append(rs.getString("T_OBSERVED")).append("</td>");
				sb.append("<td width=50%>").append(rs.getString("TWO_SIDED_P_VALUE")).append("</td>");
			}
			sb.append("</tr>");
			html.append(sb);
			html.append("</table>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return html.toString();
	}
	private String FStats(String val, Statement statement) {
		StringBuilder html = new StringBuilder();
		try {
			System.out.println("connection established successfully...!!");
			String query = "select STATS_ONE_WAY_ANOVA(md.SYMPTON, vpg.EXP, 'F_RATIO') f_ratio,"+
					" STATS_ONE_WAY_ANOVA(md.SYMPTON, vpg.EXP, 'SIG') p_value" +
					" from view_patient_till_go vpg, m_diagnosis md"+
					" where vpg.GO_ID="+val+" and vpg.P_ID = md.P_ID and md.SYMPTON in"+
					" ('ALL','AML','Colon tumor','Breast tumor')";

			ResultSet rs = statement.executeQuery(query);
			html.append("<table align = center width=50% border=1>");
			html.append("<tr colspan=1><td width=100%><b>FSTATS</b></td></tr>");
			html.append("<tr colspan=2><td width=50%><b>F_RATIO</b></td><td width=50%><b>P_VALUE</b></td></tr>");
			StringBuilder sb = new StringBuilder();
			sb.append("<tr>");
			while (rs.next()) {
				sb.append("<td width=50%>").append(rs.getString("F_RATIO")).append("</td>");
				sb.append("<td width=50%>").append(rs.getString("P_VALUE")).append("</td>");
			}
			sb.append("</tr>");
			html.append(sb);
			html.append("</table>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return html.toString();
	}
	private String otherQuery(String val, Statement statement) {
		StringBuilder html = new StringBuilder();
		try {
			System.out.println("connection established successfully...!!");
			html.append("<table align = center width=50% border=1>");
			StringBuilder sb = new StringBuilder();
			List<Integer> list = new ArrayList<>();
			List<String> columnNames = new ArrayList<>();
			ResultSet rs = statement.executeQuery(val);
			while(rs.next()) {
				ResultSetMetaData rsmd = rs.getMetaData();
				for(int i = 1; i <= rsmd.getColumnCount(); i++) {
					list.add(rsmd.getColumnType(i));
					columnNames.add(rsmd.getColumnName(i));
				}
				break;
			}
			sb.append("<tr>");
			for(String s : columnNames) {
				sb.append("<td>").append(s).append("</td>");
			}
			sb.append("</tr>");
			rs = statement.executeQuery(val);
			while(rs.next()) {
				sb.append("<tr>");
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i) == Types.VARCHAR) {
						sb.append("<td>").append(rs.getString(columnNames.get(i))).append("</td>");
					} else if(list.get(i) == Types.NUMERIC) {
						sb.append("<td>").append(rs.getLong(columnNames.get(i))).append("</td>");
					} else if(list.get(i) == Types.DATE) {
						sb.append("<td>").append(rs.getDate(columnNames.get(i))).append("</td>");
					}
				}
				sb.append("</tr>");
			}
			html.append(sb);
			html.append("</table>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return html.toString();
	}
}