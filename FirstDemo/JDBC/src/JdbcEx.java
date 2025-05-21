import java.sql.*;
public class JdbcEx {

	public static void main(String[] args) throws SQLException, Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/emp";
		String username = "root";
		String pass = "Chicken65";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,pass);
		
		Statement stmt = con.createStatement();
		//int i = stmt.executeUpdate("insert into employees values(9,'Vivek',20000);");
		PreparedStatement pstmt = con.prepareStatement("insert into employees values(?,?,?)");
		pstmt.setInt(1,6);
		pstmt.setString(2, "Haswanth");
		pstmt.setInt(3, 36000);
		pstmt.executeUpdate();
		ResultSet rs = stmt.executeQuery("select * from employees;");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			
		}
		
		con.close();
	}

}