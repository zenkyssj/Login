
package com.app;

import com.views.Principal;
import com.views.Tareas;
import com.views.list;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class app extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public app() {
        initComponents();
        setLocationRelativeTo(null);
        setDate();
        initContent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void setDate(){
        LocalDate now = LocalDate.now();
        Date fechaActual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE", new Locale("es", "ES"));

        String diaDeLaSemana = sdf.format(fechaActual);
        String diasemana = diaDeLaSemana.substring(0, 1).toUpperCase() + diaDeLaSemana.substring(1);
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        int año = now.getYear();
       
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        dateText.setText(diasemana + ", " + dia + " de " + meses[month - 1] + " de " + año);
    }
    
    private void initContent(){
        ShowJPanel(new Principal());
    }
    
    private void ShowJPanel(JPanel p){
        p.setSize(670, 370);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        logoname = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        principalBtn = new javax.swing.JPanel();
        principalTxt = new javax.swing.JLabel();
        principalImg = new javax.swing.JLabel();
        listasBtn = new javax.swing.JPanel();
        listasTxt = new javax.swing.JLabel();
        listasImg = new javax.swing.JLabel();
        tareasBtn = new javax.swing.JPanel();
        tareasTxt = new javax.swing.JLabel();
        tareasImg = new javax.swing.JLabel();
        docsBtn = new javax.swing.JPanel();
        docsTxt = new javax.swing.JLabel();
        docsImg = new javax.swing.JLabel();
        proyectosBtn = new javax.swing.JPanel();
        proyectosTxt = new javax.swing.JLabel();
        proyectosImg = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        header = new javax.swing.JPanel();
        cuentaBtn = new javax.swing.JPanel();
        cuentaTxt = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 400));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(900, 400));
        background.setPreferredSize(new java.awt.Dimension(900, 400));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(0, 102, 155));

        logoname.setBackground(new java.awt.Color(255, 255, 255));
        logoname.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        logoname.setForeground(new java.awt.Color(255, 255, 255));
        logoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname.setText("TaskManager");

        principalBtn.setBackground(new java.awt.Color(0, 102, 155));
        principalBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        principalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principalBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                principalBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                principalBtnMouseExited(evt);
            }
        });

        principalTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        principalTxt.setForeground(new java.awt.Color(255, 255, 255));
        principalTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        principalTxt.setText("Principal");

        principalImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        principalImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/home-outline.png"))); // NOI18N

        javax.swing.GroupLayout principalBtnLayout = new javax.swing.GroupLayout(principalBtn);
        principalBtn.setLayout(principalBtnLayout);
        principalBtnLayout.setHorizontalGroup(
            principalBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalBtnLayout.createSequentialGroup()
                .addComponent(principalImg, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(principalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        principalBtnLayout.setVerticalGroup(
            principalBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalBtnLayout.createSequentialGroup()
                .addGroup(principalBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(principalImg, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(principalTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        listasBtn.setBackground(new java.awt.Color(0, 102, 155));
        listasBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listasBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listasBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listasBtnMouseExited(evt);
            }
        });

        listasTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        listasTxt.setForeground(new java.awt.Color(255, 255, 255));
        listasTxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        listasTxt.setText("Listas");

        listasImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listasImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/calendar-plus.png"))); // NOI18N

        javax.swing.GroupLayout listasBtnLayout = new javax.swing.GroupLayout(listasBtn);
        listasBtn.setLayout(listasBtnLayout);
        listasBtnLayout.setHorizontalGroup(
            listasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listasBtnLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(listasImg, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listasBtnLayout.setVerticalGroup(
            listasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listasBtnLayout.createSequentialGroup()
                .addComponent(listasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(listasImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tareasBtn.setBackground(new java.awt.Color(0, 102, 155));
        tareasBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tareasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tareasBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tareasBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tareasBtnMouseExited(evt);
            }
        });

        tareasTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tareasTxt.setForeground(new java.awt.Color(255, 255, 255));
        tareasTxt.setText("Tareas");

        tareasImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tareasImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/book-open-page-variant.png"))); // NOI18N

        javax.swing.GroupLayout tareasBtnLayout = new javax.swing.GroupLayout(tareasBtn);
        tareasBtn.setLayout(tareasBtnLayout);
        tareasBtnLayout.setHorizontalGroup(
            tareasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tareasBtnLayout.createSequentialGroup()
                .addComponent(tareasImg, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tareasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tareasBtnLayout.setVerticalGroup(
            tareasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tareasTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tareasImg, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        docsBtn.setBackground(new java.awt.Color(0, 102, 155));
        docsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        docsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                docsBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                docsBtnMouseExited(evt);
            }
        });

        docsTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        docsTxt.setForeground(new java.awt.Color(255, 255, 255));
        docsTxt.setText("Documentos");

        docsImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        docsImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/file-chart.png"))); // NOI18N

        javax.swing.GroupLayout docsBtnLayout = new javax.swing.GroupLayout(docsBtn);
        docsBtn.setLayout(docsBtnLayout);
        docsBtnLayout.setHorizontalGroup(
            docsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, docsBtnLayout.createSequentialGroup()
                .addComponent(docsImg, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(docsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        docsBtnLayout.setVerticalGroup(
            docsBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(docsTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(docsImg, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        proyectosBtn.setBackground(new java.awt.Color(0, 102, 155));
        proyectosBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proyectosBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                proyectosBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                proyectosBtnMouseExited(evt);
            }
        });

        proyectosTxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        proyectosTxt.setForeground(new java.awt.Color(255, 255, 255));
        proyectosTxt.setText("Proyectos");

        proyectosImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proyectosImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/calendar-multiple-check.png"))); // NOI18N

        javax.swing.GroupLayout proyectosBtnLayout = new javax.swing.GroupLayout(proyectosBtn);
        proyectosBtn.setLayout(proyectosBtnLayout);
        proyectosBtnLayout.setHorizontalGroup(
            proyectosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proyectosBtnLayout.createSequentialGroup()
                .addComponent(proyectosImg, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proyectosTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        proyectosBtnLayout.setVerticalGroup(
            proyectosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proyectosBtnLayout.createSequentialGroup()
                .addGroup(proyectosBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(proyectosImg, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(proyectosTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoname, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(tareasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(docsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(proyectosBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(principalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(logoname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(listasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(principalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(tareasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(docsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(proyectosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        background.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 400));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        cuentaBtn.setBackground(new java.awt.Color(255, 255, 255));
        cuentaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cuentaTxt.setBackground(new java.awt.Color(255, 255, 255));
        cuentaTxt.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cuentaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuentaTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/ac.png"))); // NOI18N
        cuentaTxt.setText("  Mi Cuenta");

        javax.swing.GroupLayout cuentaBtnLayout = new javax.swing.GroupLayout(cuentaBtn);
        cuentaBtn.setLayout(cuentaBtnLayout);
        cuentaBtnLayout.setHorizontalGroup(
            cuentaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cuentaTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        );
        cuentaBtnLayout.setVerticalGroup(
            cuentaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuentaBtnLayout.createSequentialGroup()
                .addComponent(cuentaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dateText.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        dateText.setText("{dayname}, {day} de {month}");

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitBtnLayout.createSequentialGroup()
                    .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 3, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                .addComponent(cuentaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cuentaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(670, 300));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void principalBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalBtnMouseEntered
        principalBtn.setBackground(new Color(102,153,255));
    }//GEN-LAST:event_principalBtnMouseEntered

    private void principalBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalBtnMouseExited
        principalBtn.setBackground(new Color(0,102,155));
    }//GEN-LAST:event_principalBtnMouseExited

    private void listasBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listasBtnMouseEntered
        listasBtn.setBackground(new Color(102,153,255));
    }//GEN-LAST:event_listasBtnMouseEntered

    private void listasBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listasBtnMouseExited
        listasBtn.setBackground(new Color(0,102,155));
    }//GEN-LAST:event_listasBtnMouseExited

    private void tareasBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tareasBtnMouseEntered
        tareasBtn.setBackground(new Color(102,153,255));
    }//GEN-LAST:event_tareasBtnMouseEntered

    private void tareasBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tareasBtnMouseExited
        tareasBtn.setBackground(new Color(0,102,155));
    }//GEN-LAST:event_tareasBtnMouseExited

    private void docsBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docsBtnMouseEntered
        docsBtn.setBackground(new Color(102,153,255));
    }//GEN-LAST:event_docsBtnMouseEntered

    private void docsBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docsBtnMouseExited
       docsBtn.setBackground(new Color(0,102,155));
    }//GEN-LAST:event_docsBtnMouseExited

    private void proyectosBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proyectosBtnMouseEntered
       proyectosBtn.setBackground(new Color(102,153,255));
    }//GEN-LAST:event_proyectosBtnMouseEntered

    private void proyectosBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proyectosBtnMouseExited
       proyectosBtn.setBackground(new Color(0,102,155));
    }//GEN-LAST:event_proyectosBtnMouseExited

    private void listasBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listasBtnMouseClicked
        try {
            ShowJPanel(new list());
        } catch (Exception ex) {
            Logger.getLogger(app.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listasBtnMouseClicked

    private void principalBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalBtnMouseClicked
        ShowJPanel(new Principal());
    }//GEN-LAST:event_principalBtnMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void tareasBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tareasBtnMouseClicked
       ShowJPanel(new Tareas());
    }//GEN-LAST:event_tareasBtnMouseClicked

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
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel content;
    private javax.swing.JPanel cuentaBtn;
    private javax.swing.JLabel cuentaTxt;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel docsBtn;
    private javax.swing.JLabel docsImg;
    private javax.swing.JLabel docsTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JPanel listasBtn;
    private javax.swing.JLabel listasImg;
    private javax.swing.JLabel listasTxt;
    private javax.swing.JLabel logoname;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel principalBtn;
    private javax.swing.JLabel principalImg;
    private javax.swing.JLabel principalTxt;
    private javax.swing.JPanel proyectosBtn;
    private javax.swing.JLabel proyectosImg;
    private javax.swing.JLabel proyectosTxt;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separator;
    private javax.swing.JPanel tareasBtn;
    private javax.swing.JLabel tareasImg;
    private javax.swing.JLabel tareasTxt;
    // End of variables declaration//GEN-END:variables
}
