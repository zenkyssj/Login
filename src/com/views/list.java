
package com.views;

import com.app.DAOListasImpl;
import com.app.DAOUsersImpl;
import com.interfaces.DAOListas;
import com.interfaces.DAOUsers;
import com.models.Listas;
import com.models.Users;
import com.viewsOthers.list_panel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Ariel
 */
public class list extends javax.swing.JPanel {

    public list() {
        initComponents();
        LoadLists();
        
    }
    
    private void LoadLists(){
        try{
            DAOListas dao = new DAOListasImpl();
            DefaultTableModel model = (DefaultTableModel) tablaList.getModel();
            //List<com.models.Listas> dataList = dao.listar();
            model.setRowCount(0);
            dao.listar().forEach((u) -> model.addRow(new Object[]{u.getNombre_lista(), u.getDescripcion(), u.getFecha()}));
            
            
            
        }catch(Exception e){
            System.out.println(e);
        }
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
        content = new com.views.RoundedBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaList = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(670, 300));
        setPreferredSize(new java.awt.Dimension(670, 330));
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

        nameList.setBackground(new java.awt.Color(255, 255, 255));
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

        describList.setBackground(new java.awt.Color(255, 255, 255));
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

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setRoundBottomLeft(20);
        content.setRoundBottomRight(20);
        content.setRoundTopLeft(20);
        content.setRoundTopRight(20);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        tablaList.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        tablaList.setForeground(new java.awt.Color(102, 102, 102));
        tablaList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion", "Fecha de creacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaList.setToolTipText("");
        tablaList.setGridColor(new java.awt.Color(255, 255, 255));
        tablaList.setName(""); // NOI18N
        tablaList.setShowGrid(false);
        jScrollPane1.setViewportView(tablaList);
        if (tablaList.getColumnModel().getColumnCount() > 0) {
            tablaList.getColumnModel().getColumn(0).setResizable(false);
            tablaList.getColumnModel().getColumn(1).setResizable(false);
            tablaList.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 650, 240));

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
            .addGap(0, 348, Short.MAX_VALUE)
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
        if(describList.getText().equals("Descripcion")){
            describList.setText("");
            describList.setForeground(Color.black);
        }
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
        
        
        try{
            DAOListas dao = new DAOListasImpl();
            dao.registrar(lista);
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        nameList.setText("Nombre de la lista");
        nameList.setForeground(new Color(204,204,204));
        describList.setText("Descripcion");
        describList.setForeground(new Color(204,204,204));
        
        LoadLists();
    }//GEN-LAST:event_addTxtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.views.RoundedBorder addLista;
    private javax.swing.JPanel addTxt;
    private com.views.RoundedBorder bg;
    private com.views.RoundedBorder content;
    private javax.swing.JTextField describList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameList;
    private javax.swing.JTable tablaList;
    // End of variables declaration//GEN-END:variables
}
