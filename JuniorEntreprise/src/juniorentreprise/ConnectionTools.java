/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package juniorentreprise;

/**
 *
 * @author Rémy
 */
import java.sql.*;
public class ConnectionTools {
    private static String dbURL = "jdbc:derby://localhost:1527/Pulpe;create=true;user=remy;password=";
    private static String tableName = null;
    // jdbc Connection
    private static Connection conn = null;
    private static Statement requete = null;
    
    private static void createConnection()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection(dbURL); 
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }
    
    private static void insertEtudiant(int id, String nom, String prenom, int tel)
    {
        try
        {
            requete = conn.createStatement();
            requete.execute("insert into " + tableName + " values (" +
                    id + ",'" + restName + "','" + cityName +"')");
            requete.close();
        }
        catch (SQLException sqlExcept)
        {
            sqlExcept.printStackTrace();
        }
    }
    
}
