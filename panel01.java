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


public class panel01 extends JPanel implements ActionListener{//ù��° �г� ADD
    
	public JButton jButton1;
    public JScrollPane jScrollPane1;
    public JTextArea jTextArea1;
    public JTextField addidfield, addnamefield, adddepfield, addnumfield;
    public JLabel addinfo, addid, addname, adddep, addnum;

    connectdb cdb = new connectdb();
    
    public panel01(){        // 1��° �г� ������
        setLayout(null);
        
        jButton1 = new JButton("Ȯ��");
        jButton1.setSize(70,20);        
        jButton1.setBounds(500, 350, 100, 40);
        jButton1.addActionListener(this);
        add(jButton1);

        jTextArea1 = new JTextArea();
        jTextArea1.setBounds(250, 40, 400, 300);
        jTextArea1.setEditable(false);
        
        jScrollPane1 = new JScrollPane(jTextArea1);//��ũ�� ���̵���
        //jScrollPane1.setSize(500,150);
        jScrollPane1.setBounds(250, 40, 400, 300);
        add(jScrollPane1);
        
        addinfo = new JLabel("�л������� �Է��ϰ� Ȯ�ι�ư�� ��������.");
        addinfo.setBounds(230, 0, 500, 32);
        add(addinfo);
        
        addid = new JLabel("�й�");
        addid.setBounds(25, 40, 80, 40);
        add(addid);
        
        addidfield = new JTextField();
        addidfield.setBounds(111, 44, 120, 32);
        add(addidfield);
        addidfield.setColumns(10);
        
        addname = new JLabel("�̸�(����)");
        addname.setBounds(25, 80, 80, 40);
        add(addname);
        
        addnamefield = new JTextField();
        addnamefield.setBounds(111, 84, 120, 32);
        add(addnamefield);
        
        adddep = new JLabel("�а�(����)");
        adddep.setBounds(25, 120, 80, 40);
        add(adddep);
        
        adddepfield = new JTextField();
        adddepfield.setBounds(111, 124, 120, 32);
        add(adddepfield);
        
        addnum = new JLabel("��ȭ��ȣ");
        addnum.setBounds(25, 160, 80, 40);
        add(addnum);
        
        addnumfield = new JTextField();
        addnumfield.setBounds(111, 164, 120, 32);
        add(addnumfield);
        
       
        cdb.init();
        clear();
    }

    public void clear(){
    	addidfield.setText("");
	    addnamefield.setText("");
	    adddepfield.setText("");
	    addnumfield.setText("");
    }
    
    public void actionPerformed(ActionEvent e) {
	    ResultSet rs = null;
	    Component c = (Component)e.getSource();
	    
	    try{
	       if(c == jButton1){
	       
	          String nStudentID = addidfield.getText().trim();
	          String nStudentName = addnamefield.getText().trim();
	          String nStudentDep = adddepfield.getText().trim();
	          String nPhoneNum = addnumfield.getText().trim();
	          
	          if(nStudentID == null || nStudentName == null || nStudentDep == null || 
	        		  nPhoneNum == null ||nStudentID.length() == 0 || nStudentName.length() == 0 ||
	        		  nStudentDep.length() == 0 || nPhoneNum.length() == 0)
	             return;
	       
	          cdb.stat.executeUpdate("insert into Studentinfo(StudentID, StudentName, StudentDep, PhoneNum) values('"+nStudentID+"','"+nStudentName+"','"+nStudentDep+"','"+nPhoneNum+"')");   
	          jTextArea1.setText(""); 
	          jTextArea1.append("==========================================================" +"\n");
	          jTextArea1.append("\t        �л������� �߰� �Ǿ����ϴ�."+"\n");
	          jTextArea1.append("==========================================================" +"\n");
	 
	          clear();
         	}
    }catch (SQLException e1) {
   // TODO Auto-generated catch block
   e1.printStackTrace();
   }}

}