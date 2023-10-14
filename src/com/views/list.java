
package com.views;

import com.app.DAOListasImpl;
import com.app.DAOUsersImpl;
import com.interfaces.DAOListas;
import com.interfaces.DAOUsers;
import com.models.Listas;
import com.models.Users;
import java.awt.Color;

/**
 *
 * @author Jose Ariel
 */
public class list extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public list() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new com.views.RoundedBorder();
        addLista = new com.views.RoundedBorder();
        nameList = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        addTxt = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        describList = new javax.swing.JTextField();
        bgList = new com.views.RoundedBorder();
        ListName = new javax.swing.JLabel();
        ListDescrib = new javax.swing.JLabel();
        ListDate = new javax.swing.JLabel();
        ListPanel = new com.views.RoundedBorder();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(670, 300));
        setPreferredSize(new java.awt.Dimension(670, 300));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        bg.setMinimumSize(new java.awt.Dimension(670, 330));
        bg.setPreferredSize(new java.awt.Dimension(670, 330));
        bg.setRoundBottomLeft(30);
        bg.setRoundBottomRight(30);
        bg.setRoundTopLeft(30);
        bg.setRoundTopRight(30);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addLista.setBackground(new java.awt.Color(255, 255, 255));
        addLista.setRoundBottomLeft(20);
        addLista.setRoundBottomRight(20);
        addLista.setRoundTopLeft(20);
        addLista.setRoundTopRight(20);

        nameList.setForeground(new java.awt.Color(204, 204, 204));
        nameList.setText("Nombre de la lista");
        nameList.setBorder(null);
        nameList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameListFocusLost(evt);
            }
        });
        nameList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nameListMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameListMousePressed(evt);
            }
        });
        nameList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameListActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        addTxt.setBackground(new java.awt.Color(255, 255, 255));
        addTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTxtMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 155));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear lista");

        javax.swing.GroupLayout addTxtLayout = new javax.swing.GroupLayout(addTxt);
        addTxt.setLayout(addTxtLayout);
        addTxtLayout.setHorizontalGroup(
            addTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
            .addGroup(addTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
        );
        addTxtLayout.setVerticalGroup(
            addTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(addTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        describList.setForeground(new java.awt.Color(204, 204, 204));
        describList.setText("Descripcion");
        describList.setBorder(null);
        describList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                describListFocusLost(evt);
            }
        });
        describList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                describListMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                describListMousePressed(evt);
            }
        });
        describList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                describListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addListaLayout = new javax.swing.GroupLayout(addLista);
        addLista.setLayout(addListaLayout);
        addListaLayout.setHorizontalGroup(
            addListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addListaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(nameList, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(describList, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        addListaLayout.setVerticalGroup(
            addListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(addListaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(addListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(nameList)
                    .addComponent(describList))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        bg.add(addLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 50));

        bgList.setBackground(new java.awt.Color(255, 255, 255));
        bgList.setRoundBottomLeft(20);
        bgList.setRoundBottomRight(20);
        bgList.setRoundTopLeft(20);
        bgList.setRoundTopRight(20);

        ListName.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        ListName.setText("Nombre");

        ListDescrib.setFont(new java.awt.Font("Roboto Thin", 0, 12)); // NOI18N
        ListDescrib.setText("Descripcion");

        ListDate.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        ListDate.setText("Fecha de creacion");

        ListPanel.setRoundBottomLeft(20);
        ListPanel.setRoundBottomRight(20);
        ListPanel.setRoundTopLeft(20);
        ListPanel.setRoundTopRight(20);

        javax.swing.GroupLayout ListPanelLayout = new javax.swing.GroupLayout(ListPanel);
        ListPanel.setLayout(ListPanelLayout);
        ListPanelLayout.setHorizontalGroup(
            ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );
        ListPanelLayout.setVerticalGroup(
            ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgListLayout = new javax.swing.GroupLayout(bgList);
        bgList.setLayout(bgListLayout);
        bgListLayout.setHorizontalGroup(
            bgListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgListLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(bgListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgListLayout.createSequentialGroup()
                        .addComponent(ListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(bgListLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ListName)
                        .addGap(131, 131, 131)
                        .addComponent(ListDescrib)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ListDate)
                        .addGap(104, 104, 104))))
        );
        bgListLayout.setVerticalGroup(
            bgListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgListLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(bgListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListName)
                    .addComponent(ListDescrib)
                    .addComponent(ListDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        bg.add(bgList, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 650, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void nameListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameListActionPerformed

    private void nameListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameListMousePressed
        if(nameList.getText().equals("Nombre de la lista")){
            nameList.setText("");
            nameList.setForeground(Color.black);
        }
    }//GEN-LAST:event_nameListMousePressed

    private void nameListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameListMouseExited
        
    }//GEN-LAST:event_nameListMouseExited

    private void nameListFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameListFocusLost
       
    }//GEN-LAST:event_nameListFocusLost

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void describListFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_describListFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_describListFocusLost

    private void describListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_describListMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_describListMouseExited

    private void describListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_describListMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_describListMousePressed

    private void describListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_describListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_describListActionPerformed

    private void addTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTxtMouseClicked
        String name = nameList.getText();
        String describ = describList.getText();
        
       
        Listas lista = new Listas();
        lista.setNombre_lista(name);
        lista.setDescripcion(describ);
        lista.setFecha("10 de octubre");
        lista.setUsuario_id(1);
        
        try{
            DAOListas dao = new DAOListasImpl();
            dao.registrar(lista);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_addTxtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ListDate;
    private javax.swing.JLabel ListDescrib;
    private javax.swing.JLabel ListName;
    private com.views.RoundedBorder ListPanel;
    private com.views.RoundedBorder addLista;
    private javax.swing.JPanel addTxt;
    private com.views.RoundedBorder bg;
    private com.views.RoundedBorder bgList;
    private javax.swing.JTextField describList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameList;
    // End of variables declaration//GEN-END:variables
}
