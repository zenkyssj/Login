
package com.app;

public class Account extends javax.swing.JPanel {

    
    public Account() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        micuenta = new javax.swing.JLabel();
        username = new com.views.RoundedBorder();
        usernameLabel = new javax.swing.JLabel();
        email = new com.views.RoundedBorder();
        emailLabel = new javax.swing.JLabel();
        pass = new com.views.RoundedBorder();
        passLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        changePass = new javax.swing.JLabel();
        passActualLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        passNewLabel = new javax.swing.JLabel();
        passActualTxt = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        passRepetirLabel = new javax.swing.JLabel();
        passRepetirTxt = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        changeBtn = new com.views.RoundedBorder();
        jLabel1 = new javax.swing.JLabel();
        passNewTxt1 = new javax.swing.JPasswordField();

        setPreferredSize(new java.awt.Dimension(670, 300));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(670, 300));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 640, 10));

        micuenta.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        micuenta.setText("Mi Cuenta");
        bg.add(micuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        username.setBackground(new java.awt.Color(0, 102, 155));
        username.setRoundBottomLeft(10);
        username.setRoundBottomRight(10);
        username.setRoundTopLeft(10);
        username.setRoundTopRight(10);

        usernameLabel.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usernameLabel.setText("     Nombre de usuario: {user}");

        javax.swing.GroupLayout usernameLayout = new javax.swing.GroupLayout(username);
        username.setLayout(usernameLayout);
        usernameLayout.setHorizontalGroup(
            usernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );
        usernameLayout.setVerticalGroup(
            usernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        bg.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        email.setBackground(new java.awt.Color(0, 102, 155));
        email.setRoundBottomLeft(10);
        email.setRoundBottomRight(10);
        email.setRoundTopLeft(10);
        email.setRoundTopRight(10);

        emailLabel.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("     Correo : {email}");

        javax.swing.GroupLayout emailLayout = new javax.swing.GroupLayout(email);
        email.setLayout(emailLayout);
        emailLayout.setHorizontalGroup(
            emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        emailLayout.setVerticalGroup(
            emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 278, -1));

        pass.setBackground(new java.awt.Color(0, 102, 155));
        pass.setRoundBottomLeft(10);
        pass.setRoundBottomRight(10);
        pass.setRoundTopLeft(10);
        pass.setRoundTopRight(10);

        passLabel.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("     Contraseña: ");

        javax.swing.GroupLayout passLayout = new javax.swing.GroupLayout(pass);
        pass.setLayout(passLayout);
        passLayout.setHorizontalGroup(
            passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        passLayout.setVerticalGroup(
            passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        bg.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 278, -1));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 640, 10));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 20, 180));

        changePass.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        changePass.setText("Cambiar contraseña");
        bg.add(changePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        passActualLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passActualLabel.setText("Contraseña actual");
        bg.add(passActualLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 220, 10));

        passNewLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passNewLabel.setText("Contraseña nueva");
        bg.add(passNewLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        passActualTxt.setBackground(new java.awt.Color(255, 255, 255));
        passActualTxt.setForeground(new java.awt.Color(204, 204, 204));
        passActualTxt.setText("******");
        passActualTxt.setBorder(null);
        passActualTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passActualTxtMousePressed(evt);
            }
        });
        passActualTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActualTxtActionPerformed(evt);
            }
        });
        bg.add(passActualTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 220, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 220, 10));

        passRepetirLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passRepetirLabel.setText("Repetir contraseña");
        bg.add(passRepetirLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        passRepetirTxt.setBackground(new java.awt.Color(255, 255, 255));
        passRepetirTxt.setForeground(new java.awt.Color(204, 204, 204));
        passRepetirTxt.setText("******");
        passRepetirTxt.setBorder(null);
        passRepetirTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passRepetirTxtMousePressed(evt);
            }
        });
        passRepetirTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passRepetirTxtActionPerformed(evt);
            }
        });
        bg.add(passRepetirTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 220, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 220, 10));

        changeBtn.setBackground(new java.awt.Color(102, 153, 255));
        changeBtn.setRoundBottomLeft(10);
        changeBtn.setRoundBottomRight(10);
        changeBtn.setRoundTopLeft(10);
        changeBtn.setRoundTopRight(10);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAMBIAR");

        javax.swing.GroupLayout changeBtnLayout = new javax.swing.GroupLayout(changeBtn);
        changeBtn.setLayout(changeBtnLayout);
        changeBtnLayout.setHorizontalGroup(
            changeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        changeBtnLayout.setVerticalGroup(
            changeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(changeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, 30));

        passNewTxt1.setEditable(false);
        passNewTxt1.setBackground(new java.awt.Color(255, 255, 255));
        passNewTxt1.setForeground(new java.awt.Color(204, 204, 204));
        passNewTxt1.setText("******");
        passNewTxt1.setBorder(null);
        passNewTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passNewTxt1MousePressed(evt);
            }
        });
        passNewTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passNewTxt1ActionPerformed(evt);
            }
        });
        bg.add(passNewTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 220, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passActualTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passActualTxtMousePressed
       

    }//GEN-LAST:event_passActualTxtMousePressed

    private void passActualTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActualTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActualTxtActionPerformed

    private void passRepetirTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passRepetirTxtMousePressed
       

    }//GEN-LAST:event_passRepetirTxtMousePressed

    private void passRepetirTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passRepetirTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passRepetirTxtActionPerformed

    private void passNewTxt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passNewTxt1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passNewTxt1MousePressed

    private void passNewTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passNewTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passNewTxt1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private com.views.RoundedBorder changeBtn;
    private javax.swing.JLabel changePass;
    private com.views.RoundedBorder email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel micuenta;
    private com.views.RoundedBorder pass;
    private javax.swing.JLabel passActualLabel;
    private javax.swing.JPasswordField passActualTxt;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel passNewLabel;
    private javax.swing.JPasswordField passNewTxt1;
    private javax.swing.JLabel passRepetirLabel;
    private javax.swing.JPasswordField passRepetirTxt;
    private com.views.RoundedBorder username;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
