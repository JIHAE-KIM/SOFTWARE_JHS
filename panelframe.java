package Student_Information_System;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class panelframe extends JFrame{//전체 프레임
	
	public panelframe(){
		
	JTabbedPane tabbedpanel = new JTabbedPane();//JTabbedPane 객체 생성
	
    JPanel jpanel01 = new panel01();
    tabbedpanel.add("ADD", jpanel01);//ADD Tab
    
    JPanel jpanel02 = new panel02();
    tabbedpanel.add("DELETE", jpanel02);//DELETE Tab
    
    JPanel jpanel03 = new panel03();
    tabbedpanel.add("UPDATE", jpanel03);//UPDATE Tab
    
    JPanel jpanel04 = new panel04();
    tabbedpanel.add("VIEW", jpanel04);//VIEW Tab
   
    add(tabbedpanel);
    
    setTitle("Student Information System");
    //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setSize(700, 500);
    setVisible(true);  
    
    addWindowListener(new WindowAdapter() { 
    	public void windowClosing(WindowEvent e) {
    		connectdb cdb = new connectdb();
    		cdb.destroy();//연결종료
    		setVisible(false);
    		System.exit(0); 
    	} });
	}
}

  