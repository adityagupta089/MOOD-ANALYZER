/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Sign_UP.java
 *
 * Created on 6 Jul, 2016, 11:29:58 AM
 */

package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Aditya Singh Chikara
 */
public class Sign_UP extends javax.swing.JFrame {
String k="";
    /** Creates new form Sign_UP */
    public Sign_UP() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("SIGN UP");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 220, 100);

        jLabel3.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N
        jLabel3.setText("It's free");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 90, 70, 22);

        jButton1.setIcon(new javax.swing.ImageIcon("/Users/adityasinghchikara/NetBeansProjects/mavenproject1/src/main/java/com/mycompany/mavenproject1/signUP.jpg")); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(140, 470, 160, 40);

        jTextField1.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("USER NAME");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(20, 140, 230, 30);

        jTextField2.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.setText("PASSWORD");
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(20, 190, 230, 30);

        jTextField3.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 102, 102));
        jTextField3.setText("CONFIRM PASSWORD");
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(20, 240, 230, 24);

        jTextField4.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(102, 102, 102));
        jTextField4.setText("AGE");
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(20, 290, 230, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jRadioButton1.setText("MALE");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(20, 360, 90, 27);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jRadioButton2.setText("FEMALE");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(150, 360, 110, 27);

        jLabel4.setText("BY CLICKING ON SIGN UP , YOU AGREE TO ACCEPT OUR TERMS AND CONDITIONS");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 420, 410, 20);

        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 330, 300, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/adityasinghchikara/NetBeansProjects/mavenproject1/src/main/java/com/mycompany/mavenproject1/background-2.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 460, 590);

        jMenu1.setText("File");

        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("About");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("About");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
        
    }//GEN-LAST:event_jButton1FocusGained

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        k= jTextField1.getText();
        if (k.equals("USER NAME"))
            k="";
        jTextField1.setText(""+k);
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        k= jTextField2.getText();
        if (k.equalsIgnoreCase("Password"))
            k="";
        jTextField2.setText(""+k);
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
         k= jTextField3.getText();
        if (k.equalsIgnoreCase("Confirm Password"))
            k="";
        jTextField3.setText(""+k);
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if(jTextField3.getText().equals(jTextField2.getText()))
        {
        }
        else
        {
            jTextField3.setText("");
            jLabel5.setText("* Password do not match with confirm password");
            jLabel5.setVisible(true);
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        k= jTextField4.getText();
        if (k.equalsIgnoreCase("Age"))
            k="";
        jTextField4.setText(""+k);
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
       
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i=101,s=1;String Gender="";
        if(jRadioButton1.isSelected())
            Gender="M";
        if(jRadioButton2.isSelected())
            Gender="F";

        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/moodanaly","root","");
            Statement stmt=(Statement)con.createStatement();
            String query="SELECT NAME,PASSWORD FROM customer_details;";
            ResultSet rs=stmt.executeQuery(query);
            int found=0;
            while (rs.next())
            {
                i++;s++;
                String Name=rs.getString("name");
                String password=rs.getString("password");
                if(jTextField1.getText().equals(Name)&&jTextField2.getText().equals(password))
                {
                    found++;break;
                }
            }
            if(found==1)
            {
                jLabel5.setText("* Account Already Exists");
                jTextField1.setText("USER NAME");
                jTextField2.setText("PASSWORD");
                jTextField3.setText("CONFIRM PASSWORD");
                jTextField4.setText("AGE");
                jTextField1.setForeground(new java.awt.Color(102, 102, 102));
                jTextField2.setForeground(new java.awt.Color(102, 102, 102));
                jTextField3.setForeground(new java.awt.Color(102, 102, 102));
                jTextField4.setForeground(new java.awt.Color(102, 102, 102));
            }
            else if(jTextField1.getText().length()<5||
                    jTextField1.getText().length()>20||
                    jTextField2.getText().length()<5||
                    jTextField2.getText().length()>20||
                    jTextField3.getText().length()<5||
                    jTextField3.getText().length()>20)
            {
                jLabel5.setText("* USERNAME AND PASSWORD MUST HAVE 6-20 CHAR");
                jTextField1.setText("USER NAME");
                jTextField2.setText("PASSWORD");
                jTextField3.setText("CONFIRM PASSWORD");
                jTextField1.setForeground(new java.awt.Color(102, 102, 102));
                jTextField2.setForeground(new java.awt.Color(102, 102, 102));
                jTextField3.setForeground(new java.awt.Color(102, 102, 102));
            }
            else if(Integer.parseInt(jTextField4.getText())>=100||
                    Integer.parseInt(jTextField4.getText())<=10)
            {
                jLabel5.setText("* AGE MUST BE BETWEEN 11-99");
                jTextField1.setText("AGE");
            }
            else if(jRadioButton1.isSelected()==false&&jRadioButton2.isSelected()==false)
            {
                jLabel5.setText("* GENDER NOT SELECTED");
            }
            else if(found==0)
            {int a=Integer.parseInt(jTextField4.getText());
                jLabel5.setVisible(false);
                jLabel5.setText("");
                JOptionPane.showMessageDialog(this, "Sign UP Completed Now Sign in to your new Account");
                query="Insert into customer_details values('C"+i+"','"+jTextField1.getText()+"','"+jTextField2.getText()+"','"
                        +a+"','"+Gender+"');";
                stmt.executeUpdate(query);
                jTextField1.setText("USER NAME");
                jTextField2.setText("PASSWORD");
                jTextField3.setText("CONFIRM PASSWORD");
                jTextField4.setText("AGE");
                jTextField1.setForeground(new java.awt.Color(102, 102, 102));
                jTextField2.setForeground(new java.awt.Color(102, 102, 102));
                jTextField3.setForeground(new java.awt.Color(102, 102, 102));
                jTextField4.setForeground(new java.awt.Color(102, 102, 102));
                new Sign_IN().setVisible(true);
                this.setVisible(false);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        try
        {
            int n=Integer.parseInt(jTextField4.getText());
        }
        catch(Exception e)
        {
            jTextField4.setText("");
            jLabel5.setText("* Enter Integer value");
        }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new Main_1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
       
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       new About().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
       jTextField2.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
       jTextField3.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_UP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
