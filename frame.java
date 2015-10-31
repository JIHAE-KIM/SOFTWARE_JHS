<<<<<<< HEAD
=======
﻿
>>>>>>> 1933b600ec5f690ae5e75bdcc899d4757c9b9376
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


//전체 Frame생성
public class frame extends JFrame implements ActionListener {

   private static final long serialVersionUID = 1L;
   private JPanel contentPane, left, bottom;
   private JTextField StudentID, StudentName, StudentDep, PhoneNum;
   private JButton add, update, delete;
   private JTextArea display;
   private JScrollPane scrollP;
   protected Connection conn = null;
   protected Statement stat = null;
   
   frame() {
super("Student Management System");
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 800, 375);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      display = new JTextArea();
      display.setBounds(269, 10, 503, 256);
      //contentPane.add(display);
      display.setEditable(false);
      
      scrollP = new JScrollPane(display);
      scrollP.setBounds(269, 10, 503, 256);
      contentPane.add(scrollP);
      
      makebody();
      makeButton();
      init();
   }
   private void init() {
      try {
          //JDBC 드라이버를 DriverManager에 등록
         Class.forName("com.mysql.jdbc.Driver");
         String url = "jdbc:mysql://localhost:3306/jhs";
      
         //해당 Driver로 부터 Connection 객체 획득함
         conn = DriverManager.getConnection(url, "hyeonlee", "1234");
         //Connection 객체로 부터 Statement 객체 획득함
         stat = conn.createStatement();
      //initialize();
      } catch (Exception e) {
         e.printStackTrace(System.out);
      }
   }

   public void initialize() {
      StudentID.setEditable(false);
      StudentName.setEditable(false);
      StudentDep.setEditable(false);
      PhoneNum.setEditable(false);

      }


   public void clear(){
      StudentID.setText("");
      StudentName.setText("");
      StudentDep.setText("");
      PhoneNum.setText("");
      display.setText("");
   }
   
   
   public void makebody(){
      
      left = new JPanel();
      left.setBounds(12, 10, 245, 319);
      contentPane.add(left);
      left.setLayout(null);
      
      StudentID = new JTextField();
      StudentID.setBounds(95, 10, 147, 28);
      left.add(StudentID);
      StudentID.setColumns(10);
      
      StudentName = new JTextField();
      StudentName.setColumns(10);
      StudentName.setBounds(95, 48, 147, 28);
      left.add(StudentName);
      
      StudentDep = new JTextField();
      StudentDep.setColumns(10);
      StudentDep.setBounds(95, 86, 147, 28);
      left.add(StudentDep);
      
      PhoneNum = new JTextField();
      PhoneNum.setColumns(10);
      PhoneNum.setBounds(95, 124, 147, 28);
      left.add(PhoneNum);
      
      
      JLabel StudentID1 = new JLabel("StudentID");
      StudentID1.setBounds(10, 9, 90, 28);
      left.add(StudentID1);
      
      JLabel StudentName1 = new JLabel("StudentName");
      StudentName1.setBounds(10, 47, 90, 28);
      left.add(StudentName1);
      
      JLabel StudentDep1 = new JLabel("StudentDep");
      StudentDep1.setBounds(10, 87, 90, 28);
      left.add(StudentDep1);
      
      JLabel PhoneNum1 = new JLabel("PhoneNum");
      PhoneNum1.setBounds(10, 123, 90, 28);
      left.add(PhoneNum1);
      


   }
   
   public void makeButton(){
      bottom = new JPanel();
      bottom.setBounds(269, 276, 503, 53);
      contentPane.add(bottom);
      bottom.setLayout(null);
      
      //버튼들 생성되며 연결
      add = new JButton("Add");
      add.addActionListener(this);
      add.setBounds(0, 10, 100, 33);
      bottom.add(add);

      delete = new JButton("Delete");
      delete.addActionListener(this);
      delete.setBounds(112, 10, 100, 33);
      bottom.add(delete);
      
      update = new JButton("Update");
      update.addActionListener(this);
      update.setBounds(224, 10, 100, 33);
      bottom.add(update);
=======
<<<<<<< HEAD

	  update = new JButton("Update");
      update.addActionListener(this);
      update.setBounds(224, 10, 100, 33);
      bottom.add(update);
<<<<<<< HEAD
=======
=======
>>>>>>> f14117a1432e5c94a2cdd0a20f21729d65c60432
>>>>>>> 6bb0a780737de454bc7ef844a0293a03cba3ec8a
>>>>>>> 1933b600ec5f690ae5e75bdcc899d4757c9b9376
      
      
   }
   
   public void actionPerformed(ActionEvent e) {
      ResultSet rs = null;
      Component c = (Component)e.getSource();
      
      try{
         if(c == add){
         
            String nStudentID = StudentID.getText().trim();
            String nStudentName = StudentName.getText().trim();
            String nStudentDep = StudentDep.getText().trim();
            String nPhoneNum = PhoneNum.getText().trim();
      
      
            if(nStudentID == null || nStudentID.length() == 0)
               return;
         
            stat.executeUpdate("insert into Studentinfo(StudentID, StudentName, StudentDep, PhoneNum) values('"+nStudentID+"','"+nStudentName+"','"+nStudentDep+"','"+nPhoneNum+"')");   
            display.setText(""); 
            display.append("====================================================" +"\n");
            display.append("  \t 내용이 삽입되었습니다. \n");
            display.append("====================================================" +"\n");
   
            //stat.close();
            //conn.close();
            
            
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 1933b600ec5f690ae5e75bdcc899d4757c9b9376
         }else if(c == delete){
            String nStudentID = StudentID.getText().trim();
            if(nStudentID == null || nStudentID.length() ==0)
               return;
            stat.executeUpdate("delete from Studentinfo where StudentID ='"+nStudentID+"'");
            display.setText(""); 
            display.append("====================================================" +"\n");
<<<<<<< HEAD
            display.append(" \t 내용이 삭제되었습니다. ");
            display.append("====================================================" +"\n");
         
            
=======
            display.append(" \t 내용이 삭제되었습니다. \n");
            display.append("====================================================" +"\n");
         
            
=======
<<<<<<< HEAD
>>>>>>> 6bb0a780737de454bc7ef844a0293a03cba3ec8a
>>>>>>> 1933b600ec5f690ae5e75bdcc899d4757c9b9376
         }else if(c ==update){
            String nStudentID = StudentID.getText().trim();
            String nStudentName = StudentName.getText().trim();
            String nStudentDep = StudentDep.getText().trim();
            String nPhoneNum = PhoneNum.getText().trim();
   
               
            if(nStudentID == null || nStudentID.length() == 0)
                  return;
            
            stat.executeUpdate("update Studentinfo set PhoneNum = '"+nPhoneNum+"' where StudentID= '"+nStudentID+"'");
            display.setText(""); 
            display.append("====================================================" +"\n");
            display.append(" \t 내용이 수정되었습니다.\n ");
            display.append("====================================================" +"\n");
        
         }else if(c == total){
            rs = stat.executeQuery("select* from Studentinfo order by StudentID");
            display.setText(""); 
            display.append("====================================================" +"\n");
            display.append(" StudentID \t StudentName \t StudentDep \t PhoneNum  \n");
            display.append("===================================================="+"\n");
            while(rs.next()){
               String StudentID = rs.getString(1);
               String StudentName = rs.getString(2);
               String StudentDep = rs.getString(3);
               String PhoneNum = rs.getString(4);
         
<<<<<<< HEAD
               
               display.append(StudentID+ "\t" +StudentName+ "\t" +StudentDep+  "\t" +PhoneNum+ "\n");
               System.out.println(StudentID+ "\t" +StudentName+ "\t" +StudentDep+  "\t" +PhoneNum+ "\n");
            }
=======
<<<<<<< HEAD
=======
=======
>>>>>>> f14117a1432e5c94a2cdd0a20f21729d65c60432
>>>>>>> 6bb0a780737de454bc7ef844a0293a03cba3ec8a
>>>>>>> 1933b600ec5f690ae5e75bdcc899d4757c9b9376
         }
      }catch (SQLException e1) {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      }}
}