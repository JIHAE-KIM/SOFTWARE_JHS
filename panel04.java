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

public class panel04 extends JPanel implements ActionListener{//네번째 패널 VIEW
	
	public JButton jButton4;
	public JScrollPane jScrollPane4;
	public JTextArea jTextArea4;
    public JTextField viewidfield;
    public JLabel viewinfo, viewid;
	protected Connection conn = null;
    protected Statement stat = null;
	    
    connectdb cdb = new connectdb();
	    
    public panel04() {    
	    setLayout(null);
  
	  jButton4 = new JButton("확인");
	  jButton4.setSize(70,20);        
	  jButton4.setBounds(500, 350, 100, 40);
	  jButton4.addActionListener(this);
	  add(jButton4);
	  
	  jTextArea4 = new JTextArea();
	  jTextArea4.setBounds(250, 40, 400, 300);
	  jTextArea4.setEditable(false);
	  
	  jScrollPane4 = new JScrollPane(jTextArea4);// 스크롤 보이게!!
	  //jScrollPane2.setSize(500,150);
	  jScrollPane4.setBounds(250, 40, 400, 300);
	  add(jScrollPane4);
	
	  viewinfo = new JLabel("학번을 입력하고 확인버튼을 눌러 해당학생 정보를 확인하세요.");
	  viewinfo.setBounds(170, 0, 500, 32);
	  add(viewinfo);
	  
	  viewid = new JLabel("학번");
	  viewid.setBounds(25, 40, 80, 40);
	  add(viewid);
	  
	  viewidfield = new JTextField();
	  viewidfield.setBounds(111, 44, 120, 32);
	  add(viewidfield);
	  viewidfield.setColumns(10);
	  
	  cdb.init();
	  
	}

	public void clear(){
	    viewidfield.setText("");
	 }
	
	public void actionPerformed(ActionEvent e) {
	    ResultSet rs = null;
	    Component c = (Component)e.getSource();
	    
	    try{
	       if(c == jButton4){
	       
	          String nStudentID = viewidfield.getText().trim();
	   
	          if(nStudentID == null || nStudentID.length() == 0)
	             return;
	       
	          rs = cdb.stat.executeQuery("select * from Studentinfo where StudentID= "+nStudentID);   
	          jTextArea4.setText("");
	          jTextArea4.append("==========================================================" +"\n");
	          jTextArea4.append("           학 번 \t         이 름 \t        학 과 \t      전 화 번 호  \n");
	          jTextArea4.append("==========================================================" +"\n");
	 
	          while(rs.next()){
	              String StudentID = rs.getString(1);
	              String StudentName = rs.getString(2);
	              String StudentDep = rs.getString(3);
	              String PhoneNum = rs.getString(4);
	        
	              jTextArea4.append("     "+StudentID+ "\t    " +StudentName+ "\t  " +StudentDep+  "\t  " +PhoneNum+ "\n");
	              System.out.println("     "+StudentID+ "\t     " +StudentName+ "\t  " +StudentDep+  "\t  " +PhoneNum+ "\n");
	          }
	          clear();
	        }
	    }catch (SQLException e1) {
	   // TODO Auto-generated catch block
	   e1.printStackTrace();
	   }}
}
