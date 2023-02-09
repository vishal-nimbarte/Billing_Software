/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import dbcon.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class HashMapInsertionInDatabase
{
    public static void main(String[] args)
    {
        ArrayList al1 = new ArrayList();
        al1.add("Bat");
        al1.add("7000");
        al1.add("7");
        
        ArrayList al2 = new ArrayList();
        al2.add("Ball");
        al2.add("8000");
        al2.add("8");
        
        HashMap hm = new HashMap();
        hm.put("101",al1);
        hm.put("102",al2);
        
        
//        System.out.println(hm);
        
        String mobile_number = "9284495360";
        String email = "nikita@gmail.com";
        
        LocalDate ld = LocalDate.now();
//        System.out.println(ld.toString());
        String date1 = ld.toString();
        
        
        LocalTime lt = LocalTime.now();
//        System.out.println(lt.toString());
        String time1 = lt.toString();
        
        ////////////////////////////////////////////////////////
        
        HashMapInsertionInDatabase hid = new HashMapInsertionInDatabase();
        String items = hid.hashmapToString(hm);
//        hid.insertData(mobile_number, items, date1, time1, email);
        hid.getData();
    }
    
    void insertData(String mobile_number,String items,String datee,String timee,String email)
    {
     try
     {
         
        Connection con = DBConnection.getConnection();
        PreparedStatement ps =con.prepareStatement("insert into shopping_demo values (?,?,?,?,?)");
        
        ps.setString(1,mobile_number);
//        ps.setObject(2,hm);
        ps.setString(2,items);
        ps.setString(3,datee);
        ps.setString(4,timee);
        ps.setString(5,email);
        
        int i = ps.executeUpdate();
        if(i>0)
        {
            System.out.println("Insertion Successfully..!");
        }
        else
        {
            System.out.println("Not Insertion Successfully..!");
        }
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
    }
    
    void getData()
    {
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from shopping_demo");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getString("mobile_number"));
                System.out.println(rs.getString("itmes"));
                System.out.println(rs.getString("datee"));
                System.out.println(rs.getString("timee"));
                System.out.println(rs.getString("email"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    String hashmapToString(HashMap<String , ArrayList> hm)
    {
        String items = "";
//        System.out.println(hm);
        for(Map.Entry me:hm.entrySet())
        {
//            System.out.println(me.getKey()+":"+me.getValue());
            items = items + me.getKey()+",";
            
            ArrayList al = (ArrayList)me.getValue();
            
            items =items +  al.get(0)+",";
            items =items +  al.get(1)+",";
            items = items + al.get(2)+",";
            
        }
        System.out.println(items);
        return items;
    }
}
