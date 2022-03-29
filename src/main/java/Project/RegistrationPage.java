/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lucas
 */
public class RegistrationPage extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationPage
     */
    public RegistrationPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoLabel = new javax.swing.JLabel();
        tfFirstName = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        passwordLabel2 = new javax.swing.JLabel();
        passwordAssistLabel = new javax.swing.JLabel();
        jpPassword = new javax.swing.JPasswordField();
        jpPasswordConfirm = new javax.swing.JPasswordField();
        lastNameLabel = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoLabel.setText("(LOGO HERE)");

        firstNameLabel.setText("First name");

        emailLabel.setText("Email");

        passwordLabel.setText("Password");

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        errorLabel.setText("error message label");

        passwordLabel2.setText("Confirm Password");

        passwordAssistLabel.setText("jlabel");

        jpPassword.setText("jPasswordField1");
        jpPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpPasswordFocusLost(evt);
            }
        });

        jpPasswordConfirm.setText("jPasswordField2");
        jpPasswordConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpPasswordConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpPasswordConfirmFocusLost(evt);
            }
        });

        lastNameLabel.setText("Last name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel)
                            .addComponent(emailLabel)
                            .addComponent(passwordLabel2)
                            .addComponent(lastNameLabel)
                            .addComponent(firstNameLabel))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(errorLabel)
                                .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addComponent(passwordAssistLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpPassword)
                                .addComponent(jpPasswordConfirm)
                                .addComponent(tfLastName))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(registerButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(logoLabel)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(logoLabel)
                .addGap(79, 79, 79)
                .addComponent(errorLabel)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordAssistLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordLabel2)
                    .addComponent(jpPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(registerButton)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        registerUser();
    }//GEN-LAST:event_registerButtonActionPerformed

    private void jpPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPasswordFocusGained
        // shows label that guides the user on passsword requirements //todo make the label's default state invisible
        passwordAssistLabel.setText("Passowrd length must: be between 8-12 char, \n contain one upper case letter and special char");
        passwordAssistLabel.setVisible(true);
    }//GEN-LAST:event_jpPasswordFocusGained

    private void jpPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPasswordFocusLost
        // hides label that guides the user on passsword requirements
        passwordAssistLabel.setVisible(false);
    }//GEN-LAST:event_jpPasswordFocusLost

    private void jpPasswordConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPasswordConfirmFocusGained
        // shows label that guides the user on passsword requirements
        passwordAssistLabel.setText("Passowrd length must: be between 8-12 char, \n contain one upper case letter and special char");
        passwordAssistLabel.setVisible(true);
    }//GEN-LAST:event_jpPasswordConfirmFocusGained

    private void jpPasswordConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPasswordConfirmFocusLost
        // hides label that guides the user on passsword requirements
        passwordAssistLabel.setVisible(false);
    }//GEN-LAST:event_jpPasswordConfirmFocusLost

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
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationPage().setVisible(true);
            }
        });
    }
    
    //check if field is empty
    //get length of the password field <8 >12 poblem,   // 50 length for full name
    //check for injection
    //check format
    
    //check if email aleady in database   
    //add salt to password
    //add encryption to password
    //finalise registration
    
    //look on internet for test strategy template
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JPasswordField jpPassword;
    private javax.swing.JPasswordField jpPasswordConfirm;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel passwordAssistLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    // End of variables declaration//GEN-END:variables
    
    private void registerUser() {
        //extract information from fields
        String firstName = tfFirstName.getText();
        String lastName = tfLastName.getText();
        String email = tfEmail.getText();
        String password = String.valueOf(jpPassword.getPassword());
        String passwordConfirm = String.valueOf(jpPasswordConfirm.getPassword());
        
        // Check if any of the fields are empty and if yes, display an error messages accordingly
        if(!checkIfFieldsAreEmpty(firstName, lastName, email, password, passwordConfirm)){
            //exit function if any of the fields has a mistake
            return;
        }
        
        // check length of the fields
        if (!checkLength(firstName, lastName, email, password, passwordConfirm)){
            //exit function if any of the fields has a mistake
            return;
        }
        
        //verify password meets standards
        if(!checkPassword(password)){
            //exit function since password doesn't meet specs
            return;
        }
        
        //confirm passwords match
        if (!password.equals(passwordConfirm)) {
            String errorMessage = "Error!";
            errorMessage += "\n" + "Passwords don't match";
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.red);
            
            //Exit the function to avoid a registration error
            return;
        }
        
        
        //verify email
        
        
        //check for injections
        

        //add salt to password
        
        
        //add encryption to password
        
        
        //register user to database
        
    
    //look on internet for test strategy template
    }
    

    private boolean checkIfFieldsAreEmpty(String firstName, String lastName, String email, String password, String passwordConfirm) {
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || passwordConfirm.isEmpty()) {
            String errorMessage = "Error!";
            if (firstName.isEmpty()){
                errorMessage += "\n" + "Please fill the first name field";
            }
            if (lastName.isEmpty()){
                errorMessage += "\n" + "Please fill the last name field";
            }
            if (email.isEmpty()){
                errorMessage += "\n" + "Please fill the email field";
            }
            if (password.isEmpty()){
                errorMessage += "\n" + "Please fill the password field";
            }
            if (passwordConfirm.isEmpty()){
                errorMessage += "\n" + "Please fill the password confirmation field";
            }
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.red);
            
            //Exit the function to avoid a registration error
            return false;
        }
        else{
            return true;
        }
    }
    
    // get length of the fields
    private boolean checkLength(String firstName, String lastName, String email, String password, String passwordConfirm) {
        boolean result = true;
        String errorMessage = "Error!";
        int maxFirstNameLength = 15;
        int maxSurnameNameLength = 30;
        int maxEmailLength = 254;
        int minPasswordLength = 8;
        int maxPasswordLength = 12;
        
        if (firstName.length() > maxFirstNameLength){
            errorMessage += "\n" + "The first name entered is too long";
            result = false;
        }
        if (lastName.length() > maxSurnameNameLength){
            errorMessage += "\n" + "The last name entered is too long";
            result = false;
        }
        if (email.length() > maxEmailLength){
            errorMessage += "\n" + "The email field is too long";
            result = false;
        }
        
        if (password.length() > maxPasswordLength){
            errorMessage += "\n" + "The password field is too long";
            result = false;
        }
        else if (password.length() < minPasswordLength){
            errorMessage += "\n" + "The password field is too short";
            result = false;
        }
        
        if (passwordConfirm.length() > maxPasswordLength){
            errorMessage += "\n" + "The password confirmation field is too long";
            result = false;
        }
        else if (passwordConfirm.length() < minPasswordLength){
            errorMessage += "\n" + "The password confirmation field is too short";
            result = false;
        }
        errorLabel.setText(errorMessage);
        errorLabel.setForeground(Color.red);
        return result;
    }

    //check if password follows specs
    private boolean checkPassword(String password) {
        boolean result = true;
        String errorMessage = "Error!";
        
        Pattern letters = Pattern.compile("[a-zA-z]");
        Pattern digits = Pattern.compile("[0-9]");
        Pattern specialChars = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");

        Matcher hasLetter = letters.matcher(password);
        Matcher hasDigit = digits.matcher(password);
        Matcher hasSpecial = specialChars.matcher(password);
        if(!hasLetter.find()){
           errorMessage += "\n" + "The password doesn't contain an Uppercase char";
           result = false;
        }
        if(hasDigit.find()){
            errorMessage += "\n" + "The doesn't contain a number";
            result = false;
        }
        if(hasSpecial.find()){
            errorMessage += "\n" + "The password doesn't contain a special char";
            result = false;
        }
        if (!result){
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.red);
        }
        return result;
    }
}
