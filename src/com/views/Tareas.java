
package com.views;


import com.app.DAOTareasImpl;
import com.interfaces.DAOTareas;
import java.awt.Color;
import com.models.Tareas;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;

public class tareas extends javax.swing.JPanel {

    /**
     * Creates new form Tareas
     */
    public tareas() {
        initComponents();
        LoadTareas();
    }

    private void LoadTareas(){
        try{
            DAOTareas dao = new DAOTareasImpl();
            DefaultTableModel model = (DefaultTableModel) tablaTareas.getModel();
            //List<com.models.Listas> dataList = dao.listar();
            model.setRowCount(0);
            dao.listar().forEach((u) -> model.addRow(new Object[]{u.getNombre_tarea(), u.getDescripcion(), u.getFecha()}));
            
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new com.views.RoundedBorder();
        addTares = new com.views.RoundedBorder();
        nameTarea = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        addTxt = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        describTarea = new javax.swing.JTextField();
        content = new com.views.RoundedBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTareas = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(670, 300));

        bg.setPreferredSize(new java.awt.Dimension(670, 300));
        bg.setRoundBottomLeft(30);
        bg.setRoundBottomRight(30);
        bg.setRoundTopLeft(30);
        bg.setRoundTopRight(30);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addTares.setBackground(new java.awt.Color(255, 255, 255));
        addTares.setRoundBottomLeft(20);
        addTares.setRoundBottomRight(20);
        addTares.setRoundTopLeft(20);
        addTares.setRoundTopRight(20);

        nameTarea.setBackground(new java.awt.Color(255, 255, 255));
        nameTarea.setForeground(new java.awt.Color(204, 204, 204));
        nameTarea.setText("Nombre de la tarea");
        nameTarea.setBorder(null);
        nameTarea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTareaFocusLost(evt);
            }
        });
        nameTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nameTareaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameTareaMousePressed(evt);
            }
        });
        nameTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTareaActionPerformed(evt);
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
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        addTxtLayout.setVerticalGroup(
            addTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        describTarea.setBackground(new java.awt.Color(255, 255, 255));
        describTarea.setForeground(new java.awt.Color(204, 204, 204));
        describTarea.setText("Descripcion");
        describTarea.setBorder(null);
        describTarea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                describTareaFocusLost(evt);
            }
        });
        describTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                describTareaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                describTareaMousePressed(evt);
            }
        });
        describTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                describTareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addTaresLayout = new javax.swing.GroupLayout(addTares);
        addTares.setLayout(addTaresLayout);
        addTaresLayout.setHorizontalGroup(
            addTaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addTaresLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(nameTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(describTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        addTaresLayout.setVerticalGroup(
            addTaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addTaresLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(addTaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(nameTarea)
                    .addComponent(describTarea, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18))
            .addComponent(addTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(addTares, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 50));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setRoundBottomLeft(20);
        content.setRoundBottomRight(20);
        content.setRoundTopLeft(20);
        content.setRoundTopRight(20);

        tablaTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion", "Fecha de creacion"
            }
        ));
        jScrollPane1.setViewportView(tablaTareas);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 650, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTareaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTareaFocusLost

    }//GEN-LAST:event_nameTareaFocusLost

    private void nameTareaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTareaMouseExited

    }//GEN-LAST:event_nameTareaMouseExited

    private void nameTareaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTareaMousePressed
        if(nameTarea.getText().equals("Nombre de la tarea")){
            nameTarea.setText("");
            nameTarea.setForeground(Color.black);
        }
    }//GEN-LAST:event_nameTareaMousePressed

    private void nameTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTareaActionPerformed

    private void describTareaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_describTareaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_describTareaFocusLost

    private void describTareaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_describTareaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_describTareaMouseExited

    private void describTareaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_describTareaMousePressed
        if(describTarea.getText().equals("Descripcion")){
            describTarea.setText("");
            describTarea.setForeground(Color.black);
        }
    }//GEN-LAST:event_describTareaMousePressed

    private void describTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_describTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_describTareaActionPerformed

    private void addTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTxtMouseClicked
        
        
        
        String name = nameTarea.getText();
        String describ = describTarea.getText();
        
       
        com.models.Tareas tarea = new com.models.Tareas();
        tarea.setNombre_tarea(name);
        tarea.setDescripcion(describ);
        tarea.setFecha("10 de octubre");
        tarea.setUsuario_id(1);
        
        try{
            DAOTareas dao = new DAOTareasImpl();
            dao.registrar(tarea);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        nameTarea.setText("Nombre de la tarea");
        nameTarea.setForeground(new Color(204,204,204));
        describTarea.setText("Descripcion");
        describTarea.setForeground(new Color(204,204,204));
       
        LoadTareas();
        
    }//GEN-LAST:event_addTxtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.views.RoundedBorder addTares;
    private javax.swing.JPanel addTxt;
    private com.views.RoundedBorder bg;
    private com.views.RoundedBorder content;
    private javax.swing.JTextField describTarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTarea;
    private javax.swing.JTable tablaTareas;
    // End of variables declaration//GEN-END:variables
}
