package com.example.free_money_no_scam.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class forbind {

    static Connection con;

    public static Connection connectDB(){
        try {
            String url = "jdbc:mysql://localhost:3306/Free_Money_NO_SCAM";
            con = DriverManager.getConnection(url,"root","pumpkin1");
            System.out.println("Connected");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }



        //Kode der indsætter email i databasen
        //kode til a hente emails som input og indsætte dem i database





}
