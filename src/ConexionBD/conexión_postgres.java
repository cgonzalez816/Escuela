/*
 * To change this template, choose Tools | Templates * and open the template in the editor.
 */
package ConexionBD;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Cesar Gonzalez y Pablo Marin
 */
public class conexión_postgres {

    private Connection conn; //Se Crea Variable "Conexión" con Base de Datos

    //Se Crea el Método Constructor
    public conexión_postgres(String pNombreDB, String pUser, String dPassword) throws ClassNotFoundException, SQLException {
        try {
            String driver = "org.postgresql.Driver"; //Se Asigna el Driver de "Conexión" con Base de Datos
            Class.forName(driver);
            String connString = "jdbc:postgresql://localhost:5432/" + pNombreDB; //String de Conexión
            String user = pUser; //Usuario de PostGreSQL 9.2
            String password = dPassword; //Constraseña de Usuario del PostGreS

            this.conn = DriverManager.getConnection(connString, user, password); //Se Realiza la Conexión
            System.out.println("Conexión Realizada con Éxito");
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }

    public conexión_postgres() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ResultSet select(String pCampos, String pTabla, String pCondición) {

        ResultSet rs = null; //Obtener los Datos del Select
        Statement s = null; //Se Utiliza para Inicializar la Conexión
        String sentencia = "";
        try {
            s = this.conn.createStatement(); //Se Inicializa la Conexión
            sentencia = "Select " + pCampos + " from " + pTabla; //Se Crea el Select
            //sentencia = "select * from " + "\"schUTN\"" + ".alumno";
            rs = s.executeQuery(sentencia); //Se Ejecuta y se Obtienen los Datos
        } catch (Exception e) {
            System.err.println("Error: " + e.toString());
        }
        return (rs);
    }

    public String insertar(String pTabla, String pValores) {
        Statement s = null;
        String sentencia = "";
        String Retorno = "Datos Insertados";

        try {
            s = this.conn.createStatement();
            sentencia = "Insert Into " + pTabla + " values " + pValores;
            s.executeQuery(sentencia);
        } catch (SQLException e) {
            System.err.println("Error: " + e.toString());
            Retorno = e.toString();
        }
        return (Retorno);
    }

    public String Modificar(String pTabla, String pValores) {

        String sentencia = "";
        String retorno = "Datos Modificados";
        Statement s = null;
        try {
            s = this.conn.createStatement();
            sentencia = " update " + pTabla + " " + pValores; //Se Crea el SQL
            s.executeQuery(sentencia); //Se Ejecuta el SQL
        } catch (Exception e) {
            retorno = e.toString();
        }
        return (retorno);
    }
    
     public String Borrar(String pTabla, String pValores) {

        String sentencia = "";
        String retorno = "Datos Borrados";
        Statement s = null;
        try {
            s = this.conn.createStatement();
            sentencia = " delete from " + pTabla + " " + pValores; //Se Crea el SQL
            s.executeQuery(sentencia); //Se Ejecuta el SQL
        } catch (Exception e) {
            retorno = e.toString();
        }
        return (retorno);
    }    

}   