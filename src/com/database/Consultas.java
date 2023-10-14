/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.database;

import com.app.app;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Horizon Studios - Jose Aguilar
 */
//public class Consultas {
//    public void GuardarUsuarios(String usuario, String password){
 //       ConexionDB db = new ConexionDB();
   //     String sql = "INSERT INTO taskm(user, passw) VALUES (?, ?)";
    //    Connection conexion = db.conectar();
    //    try (PreparedStatement pst = conexion.prepareStatement(sql)) {
    //        pst.setString(1, usuario);
       //     pst.setString(2, password);
       //     int rs = pst.executeUpdate();
       //     JOptionPane.showMessageDialog(null, "Guardado correctamente");
       // } catch (SQLException e) {
       //     e.printStackTrace();
      //  }
   // }
    
    //public void AccesoUsuario(String user, String pass, MouseEvent evt){
 //       ConexionDB db = new ConexionDB();

 //       String usuarioCorrecto = null;
  //      String passCorrecto = null;
   //     boolean usuarioEncontrado = false;
//
  //      try {
   //         Connection cn = db.conectar();
    //        PreparedStatement pst = cn.prepareStatement("SELECT user, passw FROM taskm");
     //       ResultSet rs = pst.executeQuery();

   //         while (rs.next()) {
   //             usuarioCorrecto = rs.getString(1);
    //            passCorrecto = rs.getString(2);

      //          if (user.equals(usuarioCorrecto) && pass.equals(passCorrecto)) {
       //             JOptionPane.showMessageDialog(null, "Login correcto, bienvenido " + user);
       //             usuarioEncontrado = true;

       //             app ventana = new app();
       //             ventana.setVisible(true);
        //            ((Window) SwingUtilities.getRoot(evt.getComponent())).dispose();
        //            break;
         //       }
        //    if (!usuarioEncontrado) {
            //    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
          // }
      //  } catch (Exception e) {
       //     JOptionPane.showMessageDialog(null, "Error: " + e);
      //  }
    //}
//}
