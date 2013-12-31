/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.magram;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mano
 */
public class Registration extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
        add();
          pattern = Pattern.compile(EMAIL_PATTERN);
    }

    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN = 
        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

  
    /**
     * Validate hex with regular expression
     * 
     * @param hex
     *            hex for validation
     * @return true valid hex, false invalid hex
     */
    public boolean validate(final String hex) {

        matcher = pattern.matcher(hex);
        return matcher.matches();

    }
     public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Informations", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userNameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        showPass = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Signup = new javax.swing.JButton();
        EmailText = new javax.swing.JTextField();
        changePassword = new javax.swing.JPasswordField();
        errorLabel = new javax.swing.JLabel();
        errorUsername = new javax.swing.JLabel();
        errorPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        userNameText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        userNameText.setForeground(new java.awt.Color(0, 0, 0));
        userNameText.setText("Username");
        userNameText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userNameText.setOpaque(false);
        userNameText.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        userNameText.setSelectionColor(new java.awt.Color(0, 0, 0));
        userNameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userNameTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userNameTextFocusLost(evt);
            }
        });
        userNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextActionPerformed(evt);
            }
        });

        passwordText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        passwordText.setForeground(new java.awt.Color(0, 0, 0));
        passwordText.setText("Confirm Password");
        passwordText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        passwordText.setOpaque(false);
        passwordText.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        passwordText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTextFocusLost(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Yrsa SemiBold", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("/home/mano/Pictures/manologo.png")); // NOI18N

        showPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("show password");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Abyssinica SIL", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("You can also signup using Facebook?");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Signup.setBackground(new java.awt.Color(0, 0, 102));
        Signup.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        Signup.setForeground(new java.awt.Color(255, 255, 255));
        Signup.setText("Sign up ");
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });

        EmailText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        EmailText.setForeground(new java.awt.Color(0, 0, 0));
        EmailText.setText("Email");
        EmailText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EmailText.setOpaque(false);
        EmailText.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        EmailText.setSelectionColor(new java.awt.Color(0, 0, 0));
        EmailText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailTextFocusLost(evt);
            }
        });

        changePassword.setBackground(new java.awt.Color(255, 255, 255));
        changePassword.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        changePassword.setForeground(new java.awt.Color(0, 0, 0));
        changePassword.setText("Password");
        changePassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        changePassword.setOpaque(false);
        changePassword.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        changePassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                changePasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                changePasswordFocusLost(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("SansSerif", 2, 10)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(204, 0, 0));

        errorUsername.setFont(new java.awt.Font("SansSerif", 2, 10)); // NOI18N
        errorUsername.setForeground(new java.awt.Color(204, 0, 0));

        errorPassword.setFont(new java.awt.Font("SansSerif", 2, 10)); // NOI18N
        errorPassword.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPass)
                .addGap(151, 151, 151))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 147, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(changePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(errorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(197, 197, 197))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(userNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(EmailText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(errorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addComponent(Signup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(changePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(errorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showPass, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(24, 24, 24)
                .addComponent(Signup)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   public boolean checkUsername(String username)
    {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `loginForm` WHERE `username` =?";
        
        try {
            ps = Registration.getConnection().prepareStatement(query);
            ps.setString(1, username);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkUser = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
         return checkUser;
    }

 public void add(){
         Signup.addActionListener(this); 
    }
    private void userNameTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameTextFocusGained
        if(userNameText.getText().equals("Username"))
        {
            userNameText.setText("");

        }
    }//GEN-LAST:event_userNameTextFocusGained

    private void userNameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameTextFocusLost
        if(userNameText.getText().equals(""))
        {
            userNameText.setText("Username");

        }
    }//GEN-LAST:event_userNameTextFocusLost

    private void passwordTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFocusGained
        if(passwordText.getText().equals("Confirm Password")){
            passwordText.setText("");
        }
    }//GEN-LAST:event_passwordTextFocusGained

    private void passwordTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFocusLost
        if(passwordText.getText().equals("")){
            passwordText.setText("Confirm Password");
        }
    }//GEN-LAST:event_passwordTextFocusLost

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
         showPass.setFocusable(true);
        if(showPass.isSelected())
        {
            passwordText.setEchoChar((char)0);
            changePassword.setEchoChar((char)0);
        }
        else {
            passwordText.setEchoChar('*');
        }
    }//GEN-LAST:event_showPassActionPerformed

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed
       
    }//GEN-LAST:event_SignupActionPerformed

    private void EmailTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailTextFocusGained
        if(EmailText.getText().equals("Email")){
            EmailText.setText("");
        }
    }//GEN-LAST:event_EmailTextFocusGained

    private void EmailTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailTextFocusLost
        if(EmailText.getText().equals("")){
            EmailText.setText("Email");
        }
    }//GEN-LAST:event_EmailTextFocusLost

    private void changePasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_changePasswordFocusGained
          if(changePassword.getText().equals("Password"))  {
              changePassword.setText("");
          }
    }//GEN-LAST:event_changePasswordFocusGained

    private void changePasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_changePasswordFocusLost
       if(changePassword.getText().equals("")){
           changePassword.setText("Password");
           showPass.setEnabled(true);
       }
    }//GEN-LAST:event_changePasswordFocusLost

    private void userNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailText;
    private javax.swing.JButton Signup;
    private javax.swing.JPasswordField changePassword;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel errorPassword;
    private javax.swing.JLabel errorUsername;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JCheckBox showPass;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        Registration emailValidator = new Registration();
  
       if(ae.getSource() == Signup){
           
           String fname = userNameText.getText();
        
        String mail = EmailText.getText();
        String pass = String.valueOf(passwordText.getPassword());
        
        String re_pass = String.valueOf(changePassword.getPassword());
      
          
           if(fname.equals("Username"))
        {
            
            userNameText.setBackground(new java.awt.Color(255,0,0));
             errorUsername.setText("!enter user");
        }
           else if(mail.equals("Email")){
                 EmailText.setBackground(new java.awt.Color(255,0,0));
             errorLabel.setText("!enter email");
            
        }
          
           if(pass.equals(""))
        {
           
            changePassword.setBackground(new java.awt.Color(255,0,0));
            errorPassword.setText("!enter pass");
        }
      
           
          
           else if(!pass.equals(re_pass))
        {
             passwordText.setBackground(new java.awt.Color(255,0,0));
            changePassword.setBackground(new java.awt.Color(255,0,0));
            errorPassword.setText("!enter pass");
            passwordText.setBackground(new java.awt.Color(255,0,0));
           errorPassword.setText("!enter pass");
        }
        
           else if(checkUsername(fname))
        {
             errorUsername.setText("!User Exist");
        }
           else if(!emailValidator.validate(EmailText.getText().trim())) {
       EmailText.setBackground(new java.awt.Color(255,0,0));
        errorLabel.setText("!Invalid Email");
        /*
           Action that you want to take. For ex. make email id field red
           or give message box saying invalid email id.
        */
   }      
        
        else{
        
       
            
        PreparedStatement ps;
        String query = "INSERT INTO `loginForm`(`username`, `password`, `email`) VALUES (?,?,?)";
        
        try {
            ps = Registration.getConnection().prepareStatement(query);
            
            ps.setString(1, fname);
            ps.setString(2, pass);
            ps.setString(3, mail);
            
            
          
            
            if(ps.executeUpdate() > 0)
            {
                
                JOptionPane.showMessageDialog(null, "New User Add");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       }
    }
}