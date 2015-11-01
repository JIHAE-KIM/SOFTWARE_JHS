package Student_Information_System;

import javax.swing.*;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class panel03 extends JPanel implements ActionListener{//세번째 패널 UPDATE
	
	 public JButton jButton3;
	 public JScrollPane jScrollPane3;
	 public JTextArea jTextArea3;
	 public JTextField updateidfield, updatenumfield;
	 public JLabel updateinfo, updateid, updatenum;
  
	 connectdb cdb = new connectdb();
	    
	 public panel03() {    
	     setLayout(null);
     
	     jButton3 = new JButton("확인");
	     jButton3.setSize(70,20);        
	     jButton3.setBounds(500, 350, 100, 40);
	     jButton3.addActionListener(this);
	     add(jButton3);
	     
	     jTextArea3 = new JTextArea();
	     jTextArea3.setBounds(250, 40, 400, 300);
	     jTextArea3.setEditable(false);
	
	     jScrollPane3 = new JScrollPane(jTextArea3);   // 스크롤 보이게!!
	     //jScrollPane3.setSize(500,150);
	     jScrollPane3.setBounds(250, 40, 400, 300);
	     add(jScrollPane3);
	     
	     updateinfo = new JLabel("학번을 입력하고 새로운 전화번호를 입력 후 확인버튼을 누르세요.");
	     updateinfo.setBounds(170, 0, 500, 32);
	     add(updateinfo);
	     
	     updateid = new JLabel("학번");
	     updateid.setBounds(25, 40, 80, 40);
	     add(updateid);
	     
	     updateidfield = new JTextField();
	     updateidfield.setBounds(111, 44, 120, 32);
	     add(updateidfield);
	     updateidfield.setColumns(10);
	     
	     updatenum = new JLabel("전화번호");
	     updatenum.setBounds(25, 80, 80, 40);
	     add(updatenum);
	     
	     updatenumfield = new JTextField();
	     updatenumfield.setBounds(111, 84, 120, 32);;
	     add(updatenumfield);
	     updatenumfield.setColumns(10);
	     
	     cdb.init();    
	 }
	 
	 public void clear(){
		 updateidfield.setText("");
		 updatenumfield.setText("");
	 }

	 public void actionPerformed(ActionEvent e) {
		 ResultSet rs = null;
		 Component c = (Component)e.getSource();
		 
		 try{
			 if(c == jButton3){
       
		        String nStudentID = updateidfield.getText().trim();
		        String nPhoneNum = updatenumfield.getText().trim();
		        
                if(nStudentID == null || nPhoneNum == null || nStudentID.length() == 0 || nPhoneNum.length() == 0)
		             return;
		       
                cdb.stat.executeUpdate("update Studentinfo set PhoneNum = '"+nPhoneNum+"' where StudentID= '"+nStudentID+"'");   
	            jTextArea3.setText(""); 
	            jTextArea3.append("==========================================================" +"\n");
	            jTextArea3.append("\t       해당 학생정보가 수정 되었습니다."+"\n");
	            jTextArea3.append("==========================================================" +"\n");
		 
                clear();
	          }
	    }catch (SQLException e1) {
	   // TODO Auto-generated catch block
	   e1.printStackTrace();
	   }}
}