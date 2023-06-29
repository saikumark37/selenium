package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database_Examples {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "kvsk1998");
		Statement st = con.createStatement();
		System.out.println("connected......");

		ResultSet rs = st.executeQuery("SELECT * FROM EMP");

		while (rs.next()) {

			System.out.println("E_ID ::" + rs.getInt(1));
			System.out.println("E_Name ::" + rs.getString(2));
			System.out.println("E_Branch ::" + rs.getString(3));
			System.out.println("E_Address::" + rs.getString(4));

		}

	}
}
