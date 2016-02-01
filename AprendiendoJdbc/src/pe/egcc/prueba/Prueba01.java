/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba;

import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author Alumno
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //parametros para la conexion
        String driver="oracle.jdbc.OracleDriver";
        String urlBD="jdbc:oracle:thin:@172.17.3.126:1521:XE";
        String user="uni";
        String pass="uni";
        try {
        // cargar el driver
            Class.forName(driver).newInstance(); 
            Connection cn;
            cn=DriverManager.getConnection(urlBD,user,pass);
        //
            System.out.println("Conexion correcta");    
          cn.close();
        
         } catch (ClassNotFoundException e) {        
            System.out.println("ERROS:No se encontro el driver");
        } catch (Exception e) {        
      
            e.printStackTrace();
        }
     
            
        
        
        
        
    }
    
}
