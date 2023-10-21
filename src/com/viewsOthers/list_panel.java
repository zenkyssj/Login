
package com.viewsOthers;

import com.app.DAOListasImpl;
import com.interfaces.DAOListas;
import com.models.Listas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



public final class list_panel extends javax.swing.JPanel {

    
    public list_panel(){
        initComponents();
        LoadLists();
        
    }
    private void LoadLists(){
        try{
            DAOListas dao = new DAOListasImpl();
            //DefaultTableModel model = (DefaultTableModel) tablaList.getModel();
            //List<com.models.Listas> dataList = dao.listar();
            dao.listar().forEach((u) -> System.out.println(u.getNombre_lista()));
            
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    private JPanel createPanel(Listas lista) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(620, 240));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel nombreLabel = new JLabel("Nombre: " + lista.getNombre_lista());
        JLabel descripcionLabel = new JLabel("Descripción: " + lista.getDescripcion());
        JLabel fechaLabel = new JLabel("Fecha: " + lista.getFecha());

        panel.add(nombreLabel);
        panel.add(descripcionLabel);
        panel.add(fechaLabel);

        return panel;
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        content = new com.views.RoundedBorder();

        setPreferredSize(new java.awt.Dimension(620, 240));

        bg.setPreferredSize(new java.awt.Dimension(652, 240));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(650, 240));
        content.setRoundBottomLeft(20);
        content.setRoundBottomRight(20);
        content.setRoundTopLeft(20);
        content.setRoundTopRight(20);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private com.views.RoundedBorder content;
    // End of variables declaration//GEN-END:variables
}
