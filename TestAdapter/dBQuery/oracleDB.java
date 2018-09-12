package dBQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.xmlbeans.impl.xb.xsdschema.NamespaceList.Member2.Item;
import org.openqa.selenium.WebDriver;

public class oracleDB {
	
	private Connection con;

	public boolean OracleDB(){
		PreparedStatement st =  null;
		ResultSet rs = null;
		Item item = null;
		int sID = 3;
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    this.con = DriverManager.getConnection("jdbc:mysql://192.168.1.150:3306/testdb", "testuser", "testpass");
		    String sql = "SELECT ID, TITLE, DESCRIPTION FROM TESTTABLE WHERE ID = ?'";
		    st = this.con.prepareStatement(sql);
		    st.setInt(1, sID);
		    rs = st.executeQuery(sql);
		    while (rs.next()) {
		        System.out.println(rs.getInt("ID") + " " + rs.getString("TITLE") + " " + rs.getString("DESCRIPTION"));
		    }
		    return true;
		}
		catch (SQLException sqle) {
		    System.out.println("SQLException: " + sqle.getMessage());
		    System.out.println("SQLState: " + sqle.getSQLState());
		    System.out.println("VendorError: " + sqle.getErrorCode());
		    sqle.printStackTrace();
		}
		catch (Exception e) {
		    System.out.println(e.toString());
		    e.printStackTrace();
		}
		finally {
		    try {
		        if (rs != null)
		            rs.close();
		        if (st != null)
		            st.close();
		        if (this.con != null)
		            this.con.close();
		    }
		    catch (Exception ex) {
		        System.out.println(ex.toString());
		        ex.printStackTrace();
		    }
		}
		return false;
	}

}
