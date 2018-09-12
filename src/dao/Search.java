package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

public class Search {

	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public Search() {
		try {
			// Load the driver class and register
			Class.forName("com.mysql.jdbc.Driver");
			
			// Establish the connection
			this.con = DriverManager.getConnection("jdbc:mysql://localhost/test?serverTimezone=UTC", "root", "");
			System.out.println("Connection established");
		} catch(Exception e) {
			System.out.println("Exception : " + e);
		}
	}
	
	public ArrayList<Property> search(int price, String city, int noBedrooms) {
		String response = "";
		try {
			this.pst = this.con.prepareStatement("SELECT * FROM Properties WHERE price_per_week=?");
			
			this.pst.setInt(1, price);
			
			this.rs = this.pst.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
			    for (int i = 1; i <= columnsNumber; i++) {
			        if (i > 1) System.out.print(",  ");
			        String columnValue = rs.getString(i);
			        System.out.print(columnValue + " " + rsmd.getColumnName(i));
			    }
			    System.out.println("");
			}
		} catch(Exception e) {
			System.out.println("Exception : " + e);
		}
	}
}
