package com.example.free_money_no_scam.model;


import java.sql.PreparedStatement;

public class EmailFetch {

    public void emailFetcher(String email){
        try{
            PreparedStatement statement = forbind.connectDB().prepareStatement("INSERT INTO emails (`email`) VALUES (?);");
            statement.setString(1,email);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
