
package com.app;

import com.database.ConexionDB;
import com.interfaces.DAOUsers;
import com.login.login;
import com.models.Users;
import java.awt.HeadlessException;
import java.awt.Window;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Jose Ariel
 */
public class DAOUsersImpl extends ConexionDB implements DAOUsers{
     String usuarioCorrecto = null;
     String passCorrecto = null;
    @Override
    public void registrar(Users user) throws Exception {
        
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO users(name, password) VALUES (?,?)");
            
            st.setString(1, user.getName());
            st.setString(2, user.getPassword());
            int rs = st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        } catch (ClassNotFoundException | SQLException e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }
    @Override
    public boolean acceder(Users user) throws Exception {
        
       
        boolean usuarioEncontrado = false;
        
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT name, password FROM users");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                usuarioCorrecto = rs.getString(1);
                passCorrecto = rs.getString(2);

                if (user.getName().equals(usuarioCorrecto) && user.getPassword().equals(passCorrecto)) {
                    JOptionPane.showMessageDialog(null, "Login correcto, bienvenido " + user);
                    usuarioEncontrado = true;
                    
                    
                    app ventana = new app();
                    ventana.setVisible(true);
                    
                    
                    return true;
                    
                }
            }
            if (!usuarioEncontrado) {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                return false;
            }
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            throw e;
        } finally{
            this.Cerrar();
        }
        return false;
        
    }
    
    @Override
    public void modificar(Users user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Users user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Users> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
