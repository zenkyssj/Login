/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.views;

import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();   
        bienvenida.setCursor(new Cursor(HAND_CURSOR));
        documentos.setCursor(new Cursor(HAND_CURSOR));
        tareas.setCursor(new Cursor(HAND_CURSOR));
        proyectos.setCursor(new Cursor(HAND_CURSOR));
        listas.setCursor(new Cursor(HAND_CURSOR));
        initName();
        
    }
    private String loadName(String fileName){
        
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line = bufferedReader.readLine();

            if(line != null){
                String username = line.trim();
                return username;
            } else {
                return null;
            }        
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        
    }
    private void initName(){
        jLabel1.setText("¡Bienvenido, " + loadName("output.txt") + "!");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bienvenida = new com.views.RoundedBorder();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tareas = new com.views.RoundedBorder();
        tareasTxt = new javax.swing.JLabel();
        listas = new com.views.RoundedBorder();
        jLabel3 = new javax.swing.JLabel();
        proyectos = new com.views.RoundedBorder();
        jLabel6 = new javax.swing.JLabel();
        documentos = new com.views.RoundedBorder();
        jLabel4 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(670, 300));
        setPreferredSize(new java.awt.Dimension(670, 300));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(0, 0));
        bg.setPreferredSize(new java.awt.Dimension(670, 300));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bienvenida.setBackground(new java.awt.Color(0, 153, 204));
        bienvenida.setRoundBottomLeft(30);
        bienvenida.setRoundBottomRight(30);
        bienvenida.setRoundTopLeft(30);
        bienvenida.setRoundTopRight(30);

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¿Que desea hacer?");

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Bienvenido, user!");

        javax.swing.GroupLayout bienvenidaLayout = new javax.swing.GroupLayout(bienvenida);
        bienvenida.setLayout(bienvenidaLayout);
        bienvenidaLayout.setHorizontalGroup(
            bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        bienvenidaLayout.setVerticalGroup(
            bienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bienvenidaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        bg.add(bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 320));

        tareas.setBackground(new java.awt.Color(0, 102, 155));
        tareas.setRoundBottomLeft(30);
        tareas.setRoundBottomRight(30);
        tareas.setRoundTopLeft(30);
        tareas.setRoundTopRight(30);

        tareasTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tareasTxt.setForeground(new java.awt.Color(255, 255, 255));
        tareasTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tareasTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/book-open-page-variant.png"))); // NOI18N
        tareasTxt.setText("Mis tareas");

        javax.swing.GroupLayout tareasLayout = new javax.swing.GroupLayout(tareas);
        tareas.setLayout(tareasLayout);
        tareasLayout.setHorizontalGroup(
            tareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tareasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tareasTxt)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        tareasLayout.setVerticalGroup(
            tareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tareasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tareasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        bg.add(tareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 170, 150));

        listas.setBackground(new java.awt.Color(0, 102, 155));
        listas.setRoundBottomLeft(30);
        listas.setRoundBottomRight(30);
        listas.setRoundTopLeft(30);
        listas.setRoundTopRight(30);

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/calendar-plus.png"))); // NOI18N
        jLabel3.setText("Mis listas");

        javax.swing.GroupLayout listasLayout = new javax.swing.GroupLayout(listas);
        listas.setLayout(listasLayout);
        listasLayout.setHorizontalGroup(
            listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        listasLayout.setVerticalGroup(
            listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        bg.add(listas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 270, 150));

        proyectos.setBackground(new java.awt.Color(0, 102, 155));
        proyectos.setRoundBottomLeft(30);
        proyectos.setRoundBottomRight(30);
        proyectos.setRoundTopLeft(30);
        proyectos.setRoundTopRight(30);

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/calendar-multiple-check.png"))); // NOI18N
        jLabel6.setText("Mis proyectos");

        javax.swing.GroupLayout proyectosLayout = new javax.swing.GroupLayout(proyectos);
        proyectos.setLayout(proyectosLayout);
        proyectosLayout.setHorizontalGroup(
            proyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proyectosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        proyectosLayout.setVerticalGroup(
            proyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proyectosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        bg.add(proyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 270, 150));

        documentos.setBackground(new java.awt.Color(0, 102, 155));
        documentos.setRoundBottomLeft(30);
        documentos.setRoundBottomRight(30);
        documentos.setRoundTopLeft(30);
        documentos.setRoundTopRight(30);

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/file-chart.png"))); // NOI18N
        jLabel4.setText("Mis documentos");

        javax.swing.GroupLayout documentosLayout = new javax.swing.GroupLayout(documentos);
        documentos.setLayout(documentosLayout);
        documentosLayout.setHorizontalGroup(
            documentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(documentosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        documentosLayout.setVerticalGroup(
            documentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(documentosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        bg.add(documentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 170, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private com.views.RoundedBorder bienvenida;
    private com.views.RoundedBorder documentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private com.views.RoundedBorder listas;
    private com.views.RoundedBorder proyectos;
    private com.views.RoundedBorder tareas;
    private javax.swing.JLabel tareasTxt;
    // End of variables declaration//GEN-END:variables
}
