
package com.istloja.conexionbd;

import com.istloja.modelo.persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;


public class Conexion {

    
    
    
   
   
    public static void main(String[] args) {
        System.out.println("iniciando conexion con la base de datos");
        Conexion baseDatosMySql = new Conexion ();
       baseDatosMySql.conexionMysql();
      
        
        
        
        
            
        }
    private static final String nombreBaseDatos = "bdEjercisio1";
    private static final String usuario = "root";
    private static final String contrasena = "root";
    private static final String lineaBaseConexion = "jdbc:mysql://localhost:3306/" + nombreBaseDatos + "?useSSL=TRUE";
    private Connection connect = null;
    
    
    
    
        public Connection conexionMysql(){
            
        
        try{
             connect = DriverManager.getConnection(lineaBaseConexion, usuario, contrasena);
            
             if (connect != null) {
                return connect;

            }
             
             
        }catch (Exception e){
            System.out.println("Error al conectar:"+ e.getMessage());
            
        }
          return null;      
        
    }

//    }

    public Connection conectarBaseDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


