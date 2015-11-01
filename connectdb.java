package Student_Information_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connectdb {
    protected Connection conn = null;
    protected Statement stat = null;
	
	public void init() {
		try {
	             //JDBC ����̹��� DriverManager�� ���
	            Class.forName("com.mysql.jdbc.Driver");
	            String url = "jdbc:mysql://localhost:3306/management_students";
	         
	            //�ش� Driver�� ���� Connection ��ü ȹ����
	            conn = DriverManager.getConnection(url, "jsuji", "2990");
	            //Connection ��ü�� ���� Statement ��ü ȹ����
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
