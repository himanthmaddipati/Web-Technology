import java.sql.*;
public class Jdbc1 {

	public static void main(String[] args) throws SQLException, Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/emp";
		String username = "root";
		String pass = "Chicken65";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,pass);
		
		Statement stmt = con.createStatement();
		//int i = stmt.executeUpdate("insert into employee values(7,'Vivek',20000);");
		ResultSet rs = stmt.executeQuery("select * from employee;");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			
		}
		
		con.close();
	}

}
