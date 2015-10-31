package Student_Information_System;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class JPanel011 extends JPanel {      //  1번 패널 
    private JButton jButton1, jButton2, jButton3, jButton4;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JTextField addidfield, addnamefield, adddepfield, addnumfield;
    private JLabel addinfo, addid, addname, adddep, addnum;
    
    public JPanel011(){        // 1번째 패널 생성자
        setLayout(null);
        
        jButton1 = new JButton("확인");
        jButton1.setSize(70,20);        
        jButton1.setBounds(500, 350, 100, 40);
        add(jButton1);
        
        jTextArea1 = new JTextArea();

        jScrollPane1 = new JScrollPane(jTextArea1);   // 스크롤 보이게!!
        jScrollPane1.setSize(500,150);
        jScrollPane1.setBounds(250, 40, 400, 300);
        add(jScrollPane1);
        
        addinfo = new JLabel("학생정보를 입력하고 확인버튼을 누르세요.");
        addinfo.setBounds(230, 0, 500, 32);
        add(addinfo);
        
        addid = new JLabel("학번");
        addid.setBounds(25, 40, 80, 40);
        add(addid);
        
        addidfield = new JTextField();
        addidfield.setBounds(111, 44, 120, 32);
        add(addidfield);
        addidfield.setColumns(10);
        
        addname = new JLabel("이름(영어)");
        addname.setBounds(25, 80, 80, 40);
        add(addname);
        
        addnamefield = new JTextField();
        addnamefield.setBounds(111, 84, 120, 32);
        add(addnamefield);
        
        adddep = new JLabel("학과(영어)");
        adddep.setBounds(25, 120, 80, 40);
        add(adddep);
        
        adddepfield = new JTextField();
        adddepfield.setBounds(111, 124, 120, 32);
        add(adddepfield);
        
        addnum = new JLabel("전화번호");
        addnum.setBounds(25, 160, 80, 40);
        add(addnum);
        
        addnumfield = new JTextField();
        addnumfield.setBounds(111, 164, 120, 32);
        add(addnumfield);
    }
}


class JPanel022 extends JPanel{        // 2번째 패널
    private JButton jButton2;
    private JScrollPane jScrollPane2;
    private JTextArea jTextArea2;
    private JTextField delidfield;
    private JLabel delinfo, delid;
    
    public JPanel022() {        // 2번째 패널 생성자
        
        setLayout(null);
       
        jButton2 = new JButton("확인");
        jButton2.setSize(70,20);        
        jButton2.setBounds(500, 350, 100, 40);
        add(jButton2);
        
        jTextArea2 = new JTextArea();

        jScrollPane2 = new JScrollPane(jTextArea2);   // 스크롤 보이게!!
        jScrollPane2.setSize(500,150);
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
        
    }
}


class JPanel033 extends JPanel{        // 3번째 패널
   
    private JButton jButton3;
       private JScrollPane jScrollPane3;
       private JTextArea jTextArea3;
       private JTextField updateidfield;
       private JLabel updateinfo, updateid;
       
    public JPanel033() {    
          
     setLayout(null);
      
      jButton3 = new JButton("확인");
      jButton3.setSize(70,20);        
      jButton3.setBounds(500, 350, 100, 40);
      add(jButton3);
      
      jTextArea3 = new JTextArea();

      jScrollPane3 = new JScrollPane(jTextArea3);   // 스크롤 보이게!!
      jScrollPane3.setSize(500,150);
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
      
  }
}

class JPanel044 extends JPanel{        // 3번째 패널
   
    private JButton jButton4;
       private JScrollPane jScrollPane4;
       private JTextArea jTextArea4;
       private JTextField viewidfield;
       private JLabel viewinfo, viewid;
       
    public JPanel044() {    
          
     setLayout(null);
     
     jButton4 = new JButton("확인");
     jButton4.setSize(70,20);        
     jButton4.setBounds(500, 350, 100, 40);
     add(jButton4);
     
     jTextArea4 = new JTextArea();

     jScrollPane4 = new JScrollPane(jTextArea4);   // 스크롤 보이게!!
     jScrollPane4.setSize(500,150);
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
     
 }
}

public class JPanelTest extends JFrame{
    
    public JPanel011 jpanel01 = null;
    public JPanel022 jpanel02 = null;
    public JPanel033 jpanel03 = null;
    public JPanel044 jpanel04 = null;
    
    public static void main(String[] args) {
        JPanelTest win = new JPanelTest();
        win.setTitle("Student Information System");
        win.jpanel01 = new JPanel011();
        win.jpanel02 = new JPanel022();
        win.jpanel03 = new JPanel033();
        win.jpanel04 = new JPanel044();
        
        JTabbedPane jtab = new JTabbedPane();   //  JTabbedPane  객체 생성
        
        jtab.addTab("ADD", win.jpanel01 );
        jtab.addTab("DELETE", win.jpanel02 );
        jtab.addTab("UPDATE", win.jpanel03 );
        jtab.addTab("VIEW", win.jpanel04 );
        
        win.add(jtab);
        
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        win.setSize(700, 500);
        win.setVisible(true);    
    }
}