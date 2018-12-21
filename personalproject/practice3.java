package personalproject;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;

public class practice3 extends JFrame{
   private JTextField name = new JTextField(5);
   private JTextField position = new JTextField(5);
   private ArrayList<String> getName = new ArrayList<String>();
   private ArrayList<String> getPos = new ArrayList<String>();
   private ArrayList<String> fw = new ArrayList<String>();
   private ArrayList<String> mf = new ArrayList<String>();
   private ArrayList<String> df = new ArrayList<String>();
   private ArrayList<String> fw_set= new ArrayList<String>();
   private ArrayList<String> mf_set= new ArrayList<String>();
   private ArrayList<String> df_set= new ArrayList<String>();

   public practice3() {
      setTitle("축구 뽑기");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      
      setLayout(null);
      JLabel 이름 = new JLabel("이름 ");
      이름.setLocation(50, 20);
      이름.setSize(50,30);
      c.add(이름);
      
      setLayout(null);
      c.add(new JLabel("이름"));
      name.setLocation(90,20);
      name.setSize(100, 30);
      c.add(name);
      
      setLayout(null);
      JLabel 포지션 = new JLabel("포지션 ");
      포지션.setLocation(250, 20);
      포지션.setSize(50,30);
      c.add(포지션);
      
      setLayout(null);
      c.add(new JLabel("포지션   "));
      position.setLocation(300,20);
      position.setSize(100,30);
      c.add(position);
      
      setLayout(null);
      JLabel fw1 = new JLabel("fw1 ");
      fw1.setLocation(200, 70);
      fw1.setSize(50,30);
      c.add(fw1);
      
      JLabel fw2 = new JLabel("fw2 ");
      fw2.setLocation(250, 70);
      fw2.setSize(50,30);
      c.add(fw2);
      
      JLabel fw3 = new JLabel("fw3 ");
      fw3.setLocation(300, 70);
      fw3.setSize(50,30);
      c.add(fw3);
      
      JLabel mf1 = new JLabel("mf1 ");
      mf1.setLocation(200, 160);
      mf1.setSize(50,30);
      c.add(mf1);
      
      JLabel mf2 = new JLabel("mf2");
      mf2.setLocation(250, 160);
      mf2.setSize(50,30);
      c.add(mf2);
      
      JLabel mf3 = new JLabel("mf3 ");
      mf3.setLocation(300, 160);
      mf3.setSize(50,30);
      c.add(mf3);
      
      JLabel df1 = new JLabel("df1 ");
      df1.setLocation(200, 250);
      df1.setSize(50,30);
      c.add(df1);
      
      JLabel df2 = new JLabel("df2 ");
      df2.setLocation(250, 250);
      df2.setSize(50,30);
      c.add(df2);
      
      JLabel df3 = new JLabel("df3 ");
      df3.setLocation(300, 250);
      df3.setSize(50,30);
      c.add(df3);
      
      JLabel df4 = new JLabel("df4 ");
      df4.setLocation(350, 250);
      df4.setSize(50,30);
      c.add(df4);
      
      
   
      setLayout(null);
      JButton fwSetting=new JButton("공격수 설정");
      fwSetting.setLocation(50,70);
      fwSetting.setSize (100,30);
      c.add(fwSetting);
      
      setLayout(null);
      JButton mfSetting=new JButton("미드필더 설정");
      mfSetting.setLocation(50,160);
      mfSetting.setSize(120, 30);
      c.add(mfSetting);
      
      setLayout(null);
      JButton dfSetting=new JButton("수비수 설정");
      dfSetting.setLocation(50,250);
      dfSetting.setSize(100, 30);
      c.add(dfSetting);
      
      fwSetting.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e) {
            int count = 0;
            String[] get = new String[20];
            for(int i = 0; i<getName.size(); i++) {
              if(getPos.get(i).equals("fw")) {
                 get[count++] = getName.get(i);
               }
            }                                    
            
            int x=(int)(Math.random()*count);
            int y=-1;
            do{
               y=(int)(Math.random()*count); 
               System.out.print("e");
            }while(y==x) ;
            int z=-1;
            do{
               z=(int)(Math.random()*count);
            }while(z==x||z==y);
            
            fw_set.add(0, get[x]);
            fw_set.add(1, get[y]);
            fw_set.add(2, get[z]); 
            
          fw1.setText(fw_set.get(0));
          fw2.setText(fw_set.get(1));
          fw3.setText(fw_set.get(2));
         }
      });
      mfSetting.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e) {
        	 int count = 0;
             String[] get = new String[20];
             for(int i = 0; i<getName.size(); i++) {
               if(getPos.get(i).equals("mf")) {
                  get[count++] = getName.get(i);
                }
             }                                    
             
             int x=(int)(Math.random()*count);
             int y=-1;
             do{
                y=(int)(Math.random()*count); 
                
             }while(y==x) ;
             int z=-1;
             do{
                z=(int)(Math.random()*count);
             }while(z==x||z==y);
             
             mf_set.add(0, get[x]);
             mf_set.add(1, get[y]);
             mf_set.add(2, get[z]); 
             
           mf1.setText(mf_set.get(0));
           mf2.setText(mf_set.get(1));
           mf3.setText(mf_set.get(2));
         }
      });
      dfSetting.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e) {
        	 int count = 0;
             String[] get = new String[20];
             for(int i = 0; i<getName.size(); i++) {
               if(getPos.get(i).equals("df")) {
                  get[count++] = getName.get(i);
                }
             }                                    
             
             int x=(int)(Math.random()*count);
             int y=-1;
             do{
                y=(int)(Math.random()*count); 
             }while(y==x) ;
             int z=-1;
             do{
                z=(int)(Math.random()*count);
             }while(z==x||z==y);
             int w=-1;
             do {
            	 w=(int)(Math.random()*count);
             }while(w==x||w==y||w==z);
            	 
            
             
             df_set.add(0, get[x]);
             df_set.add(1, get[y]);
             df_set.add(2, get[z]); 
             df_set.add(3, get[w]);
             
           df1.setText(df_set.get(0));
           df2.setText(df_set.get(1));
           df3.setText(df_set.get(2));
           df4.setText(df_set.get(3));
         }
      });
      
      name.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e) {
            JTextField t = (JTextField)e.getSource();
            String name = t.getText();
            getName.add(name);
            t.setText("");
            System.out.print(name + "   ");
            
         }
      });
      
      position.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e) {
            JTextField t = (JTextField)e.getSource();
            String position = t.getText();
            getPos.add(position);
            t.setText("");
            System.out.println(position);
         }
      });

      setSize(600, 400);
      setVisible(true);
   }
   
   
   public static void main(String args[]) {
      new practice3();
      
      
   }

}