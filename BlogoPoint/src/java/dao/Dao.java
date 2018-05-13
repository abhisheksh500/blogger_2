/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Tao;
import factory.Factory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abhishek
 */
public class Dao {
    static Connection con;
    PreparedStatement ps;
    public int insert (Tao d)
    { 
        int n =0;
        try{
            con = Factory.createConnection();
            ps =con.prepareStatement("insert into signup values(?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1, d.getName());
            ps.setString(2, d.getGender());
            ps.setString(3, d.getBirthday());
            ps.setString(4, d.getEmail());
            ps.setString(5, d.getPassword());
            ps.setString(6, d.getConfirmpassword());
            ps.setString(7, d.getContact());
            ps.setString(8,d.getSecurity_question());
            ps.setString(9, d.getSecurity_answer());
            n = ps.executeUpdate();
            con.close();
            return n;
        }
        catch(SQLException e)
        {
            Logger.getLogger(Tao.class.getName()).log(Level.SEVERE, null, e);
            return n;
        }
    }
}
