package Student_Information_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connectdb {
    protected Connection conn = null;
    protected Statement stat = null;
	
	public void init() {
		try {
	             //JDBC µÂ∂Û¿Ãπˆ∏¶ DriverManagerø° µÓ∑œ
	            Class.forName("com.mysql.jdbc.Driver");
	            String url = "jdbc:mysql://localhost:3306/management_students";
	         
	            //«ÿ¥Á Driver∑Œ ∫Œ≈Õ Connection ∞¥√º »πµÊ«‘
	            conn = DriverManager.getConnection(url, "jsuji", "2990");
	            //Connection ∞¥√º∑Œ ∫Œ≈Õ Statement ∞¥√º »πµÊ«‘
	            stat = conn.createStatement();
	         //initialize();
	         } catch (Exception e) {
	            e.printStackTrace(System.out);
	         }
	     }
	
		public void destroy() {
			try {
				if(stat != null) {
					stat.close(); } 
				if(conn != null) {
					conn.close(); } 
				} catch(Exception ex) { 
				} 
			}
}
