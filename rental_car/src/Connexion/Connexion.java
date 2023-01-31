package Connexion;

import java.sql.*;


public class Connexion {
    Connection con;
    public Connexion(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3030/STARAUTO","root","adminadmin");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public Connection connect(){
        return con;
    }
}
