package Student_Information_System;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class panel02 extends JPanel implements ActionListener{//두번째 패널 DELETE
	
	 public JButton jButton2;
	 public JScrollPane jScrollPane2;
	 public JTextArea jTextArea2;
	 public JTextField delidfield;
	 public JLabel delinfo, delid;
	 
	 connectdb cdb = new connectdb();
	 
	 public panel02() {        // 2번째 패널 생성자
		 setLayout(null);
     
	     jButton2 = new JButton("확인");
	     jButton2.setSize(70,20);        
	     jButton2.setBounds(500, 350, 100, 40);
	     jButton2.addActionListener(this);
	     add(jButton2);
	     
	     jTextArea2 = new JTextArea();
	     jTextArea2.setBounds(250, 40, 400, 300);
	     jTextArea2.setEditable(false);
	     
	     jScrollPane2 = new JScrollPane(jTextArea2);   // 스크롤 보이게!!
	     //jScrollPane2.setSize(500,150);
	     jScrollPane2.setBounds(250, 40, 400, 300);
	     add(jScrollPane2);
	     
	     delinfo = new JLabel("학번을 입력하고 확인버튼을 누르세요.");
	     delinfo.setBounds(230, 0, 500, 32);
	     add(delinfo);
	     
	     delid = new JLabel("학번");
	     delid.setBounds(25, 40, 80, 40);
	     add(delid);
	     
	     delidfield = new JTextField();
	     delidfield.setBounds(111, 44, 120, 32);
	     add(delidfield);
	     delidfield.setColumns(10);
	     
	     cdb.init();
	 }
	 
	public void clear(){
	    delidfield.setText("");
	 }
	
	public void actionPerformed(ActionEvent e) {
	    ResultSet rs = null;
	    Component c = (Component)e.getSource();
	    
	    try{
	       if(c == jButton2){
	       
	          String nStudentID = delidfield.getText().trim();
	   
	          if(nStudentID == null || nStudentID.length() == 0)
	             return;
	       
	          cdb.stat.executeUpdate("delete from Studentinfo where StudentID ='"+nStudentID+"'");   
	          jTextArea2.setText(""); 
	          jTextArea2.append("==========================================================" +"\n");
	          jTextArea2.append("\t       해당 학생정보가 삭제 되었습니다."+"\n");
	          jTextArea2.append("==========================================================" +"\n");
	 
	          clear();
	        }
	    }catch (SQLException e1) {
	   // TODO Auto-generated catch block
	   e1.printStackTrace();
	   }}
}
