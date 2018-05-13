/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abhishek
 */
public class Factory {
    
    static Connection con;
    
    public static Connection createConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/blogging website","root","");
            return  con;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
            return con;
        }
    }
}
