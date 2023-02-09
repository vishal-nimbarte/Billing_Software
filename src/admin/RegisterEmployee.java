/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import dbcon.DBConnection;
import dbcon.DBOperation;
import gettersetter.Register;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import validation.RegValidation;

/**
 *
 * @author Administrator
 */
public class RegisterEmployee extends javax.swing.JFrame {

    /**
     * Creates new form RegisterEmployee
     */
    public RegisterEmployee() {
        initComponents();
        try 
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 51, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(430, 70));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register Employee");
        setPreferredSize(new java.awt.Dimension(930, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 90)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/more-employee.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 90)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 300, 45));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 300, 45));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 300, 45));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton1.setText("Male");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, -1, -1));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 300, 45));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ragister.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, 54));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Name -");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 155, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Enter Email -");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 124, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter Password -");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 142, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mobile Number -");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender -");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 100, -1));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-icon.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 60, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 560, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

        AdminPanel ap = new AdminPanel();
        ap.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        //get the data in the frame
        String name1 = jTextField1.getText();
        String email1 = jTextField2.getText();
        String password1 = jPasswordField1.getText();
        String mobile_number1 = jTextField3.getText();
        String gender1 = "";
        if (jRadioButton1.isSelected()) {
            gender1 = "M";
        } 
        else if (jRadioButton2.isSelected()) {
            gender1 = "F";
        }
        
        String module = "Employee";

        //validation simple process
        
        RegValidation rv = new RegValidation();
        if(!rv.nameValidation(name1))
        {
              JOptionPane.showMessageDialog(rootPane, "Invalide Name..!", "Name Error..!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!rv.emailValidation(email1))
        {
              JOptionPane.showMessageDialog(rootPane, "Invalide Email..!", "Email Error..!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!rv.passwordValidation(password1))
        {
              JOptionPane.showMessageDialog(rootPane, "Invalide Password..!", "Password Error..!", JOptionPane.ERROR_MESSAGE);
        }
        else if(gender1.equals(""))
        {
              JOptionPane.showMessageDialog(rootPane, "Enter Gender..!", "Error..!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!rv.mobileNumberValidation(mobile_number1))
        {
             JOptionPane.showMessageDialog(rootPane, "Invalide Number..!", "Mobile Number Error..!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Register reg = new Register();

            reg.setEmail(email1);
            reg.setName(name1);
            reg.setPassword(password1);
            reg.setGender(gender1);
            reg.setMobile_number(mobile_number1);
            reg.setModule(module);

            boolean register_status = DBOperation.register(reg);

            if (register_status) {
                JOptionPane.showMessageDialog(rootPane, "Register Success..");
                jTextField1.setText("");
                jTextField2.setText("");
                jPasswordField1.setText("");
                jTextField3.setText("");
                buttonGroup1.clearSelection();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Not Register Some Problem Occure..!", "Register Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
//        
//        if (name1.equals("")) {
//            JOptionPane.showMessageDialog(rootPane, "Invalide Name..!", "Name Error..!", JOptionPane.ERROR_MESSAGE);
//        }
//        else if(email1.equals(""))
//        {
//            JOptionPane.showMessageDialog(rootPane,"Invalide Email..!","Email Error..!",JOptionPane.INFORMATION_MESSAGE);
//        }
//        else if(password1.equals(""))
//        {
//            JOptionPane.showMessageDialog(rootPane,"Invalide Password..!","Password Error..!",JOptionPane.INFORMATION_MESSAGE);
//        }
//        else if(mobile_number1.equals(""))
//        {
//            JOptionPane.showMessageDialog(rootPane,"Invalide Mobile Number..!","Mobile Number Error..!",JOptionPane.INFORMATION_MESSAGE);
//        }
//        else if(gender1.equals(""))
//        {
//            JOptionPane.showMessageDialog(rootPane,"Invalide Gender..!"," Error..!",JOptionPane.INFORMATION_MESSAGE);
//        }
//        else
//        {
//            Register reg = new Register();
//
//            reg.setEmail(email1);
//            reg.setName(name1);
//            reg.setPassword(password1);
//            reg.setGender(gender1);
//            reg.setMobile_number(mobile_number1);
//            reg.setModule(module);
//
//            boolean register_status = DBOperation.register(reg);
//
//            if (register_status) {
//                JOptionPane.showMessageDialog(rootPane, "Register Success..");
//                jTextField1.setText("");
//                jTextField2.setText("");
//                jPasswordField1.setText("");
//                jTextField3.setText("");
//                buttonGroup1.clearSelection();
//            } else {
//                JOptionPane.showMessageDialog(rootPane, "Not Register Some Problem Occure..!", "Register Error", JOptionPane.ERROR_MESSAGE);
//            }
//        }
        //connect the database

//        try
//        {
//           //Database Connection
//            
//            Connection con = DBConnection.getConnection();
//            PreparedStatement ps = con.prepareStatement("insert into register values (?,?,?,?,?,?)");
//            
//            ps.setString(1,name1);
//            ps.setString(2,email1);
//            ps.setString(3,password1);
//            ps.setString(4,gender1);
//            ps.setString(5,mobile_number1);
//            ps.setString(6,module);
//            
//            int i = ps.executeUpdate();
//            if(i>0)
//            {
//                JOptionPane.showMessageDialog(rootPane,"Register Success..");
//                jTextField1.setText("");
//                jTextField2.setText("");
//                jPasswordField1.setText("");
//                buttonGroup1.clearSelection();
//            }
//            else
//            {
//                JOptionPane.showMessageDialog(rootPane,"Not Register Some Problem Occure..!","Register Error",JOptionPane.ERROR_MESSAGE);
//            }
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
    }//GEN-LAST:event_jLabel5MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
