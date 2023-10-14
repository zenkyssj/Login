
package com.app;

import com.database.ConexionDB;
import com.interfaces.DAOListas;
import com.models.Listas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import com.login.login;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Jose Ariel
 */
public class DAOListasImpl extends ConexionDB implements DAOListas{

    @Override
    public void registrar(Listas user) throws Exception {
        
        try{
            
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO listas(nombre_lista, descripcion, fecha, usuario_id) VALUES (?,?,?,?)");
            
            st.setString(1, user.getNombre_lista());
            st.setString(2, user.getDescripcion());
            st.setString(3, user.getFecha());
            st.setInt(4,obtenerIdUsuario());
            
            int rs = st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        } catch (ClassNotFoundException | SQLException e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Listas user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Listas user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Listas> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String readTextFromFile(String fileName){
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
    
    public int obtenerIdUsuario() throws ClassNotFoundException, SQLException{
        int userId = -1;
        String fileContent = readTextFromFile("output.txt");
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT id FROM users WHERE name=?");
            st.setString(1, fileContent);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                userId = rs.getInt("id");
            } else{
                throw new SQLException("Usuario no encontrado en la base de datos.");
            }
        }  catch (SQLException e) {
           throw new SQLException("Error al obtener el ID del usuario: " + e.getMessage());
        } finally {
            this.Cerrar();
        }
        return userId;
    }
}
