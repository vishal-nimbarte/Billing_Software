/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcon;

import com.mysql.cj.protocol.Resultset;
import gettersetter.Register;
import gettersetter.RegisterModel;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class DBOperation
{
    public static ResultSet login(String email1,String password1)
    {
        ResultSet rs = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_software","root","2001");
            PreparedStatement ps = con.prepareStatement("select * from register where email=? and password=?");
            ps.setString(1,email1);
            ps.setString(2,password1);
            rs = ps.executeQuery();
        }
      
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    
    
    public static boolean register(Register reg)
    {
        boolean status = false;
        try
        {
           //Database Connection
            
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into register values (?,?,?,?,?,?)");
            
            ps.setString(1,reg.getName());
            ps.setString(2,reg.getEmail());
            ps.setString(3,reg.getPassword());
            ps.setString(4,reg.getGender());
            ps.setString(5,reg.getMobile_number());
            ps.setString(6,reg.getModule());
            
            int i = ps.executeUpdate();
            
            if(i>0)
            {
                status = true;
            }
            else
            {
                status = false;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
    
    
    public static ResultSet showAllEmployeeData()
    {
        ResultSet rs = null;
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from register where module='Employee'");
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    public static ResultSet getSelectedEmployee(String email)
    {
        ResultSet rs = null;
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from register where email=?");
            ps.setString(1,email);
            rs = ps.executeQuery();
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    public static boolean insertImageDetails(FileInputStream fis,String... str )
    {
        boolean status = false;
        try
        {
            //database connection
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into items values(?,?,?,?,?,?)");
            
            //insert the values in the database
            ps.setString(1,str[0]);
            ps.setString(2,str[1]);
            ps.setString(3,str[2]);
            ps.setString(4,str[3]);
            ps.setString(5,str[4]);
            ps.setBinaryStream(6,fis);
            
            int i = ps.executeUpdate();
//            System.out.println(i);
            if(i>0)
            {
                status = true;
            }
            else
            {
                status = false;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return  status;
    }
    public static boolean cheackOldPassword(String old_pwd,String email)
    {
        boolean status = false;
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from register where email=? and password=?");
            ps.setString(1,email);
            ps.setString(2,old_pwd);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                status = true;
            }
            else
            {
                status = false;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
    
    public static boolean UpdatePassword(String new_pwd,String email)
    {
        boolean status = false;
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("update register set password=? where email=?");
            
            ps.setString(1,new_pwd);
            ps.setString(2,email);
           
            int i = ps.executeUpdate();
            if(i>0)
            {
                status = true;
            }
            else
            {
                status = false;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
    public static boolean updateDetails(RegisterModel rm)
    {
        boolean status = false;
        
        
        
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("update register set name=?,password=?,gender=?,phono_no=? where email=?");
            
            ps.setString(1,rm.getName());
            ps.setString(2,rm.getPassword());
            ps.setString(3,rm.getGender());
            ps.setString(4,rm.getPhone_number());
            ps.setString(5,rm.getEmail());
            
            int i = ps.executeUpdate();
            
            if(i>0)
            {
                status = true;
            }
            else
            {
                status = false;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
    
    public static boolean deleteEmployee(String email)
    {
        boolean status = false;
        try
        {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("delete from register where email=?");
        ps.setString(1, email);
        int i = ps.executeUpdate();
        if(i>0)
        {
            status = true;
        }
        else
        {
            status = false;
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
    
    public static boolean updateMyProfile(String name,String email,String gender,String phono_no)
    {
        boolean status = false;
        
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("update register set name=?,gender=?,phono_no=? where email=?");
            ps.setString(1,name);
            ps.setString(2,gender);
            ps.setString(3,phono_no);
            ps.setString(4,email);
            
            int i = ps.executeUpdate();
            if(i>0)
            {
                status = true;
            }
            else
            {
                status = false;
            }
        }
        catch(Exception e)
        {
            //
            System.out.println(e);
        }
        
        return status;
    }
    
    public static ResultSet getAllItems()
    {
        ResultSet rs = null;
        try
        {
            Connection con=DBConnection.getConnection();
            
            PreparedStatement ps=con.prepareStatement("select * from items");
            rs=ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    public static ResultSet getItemDetails(String item_id)
    {
        ResultSet rs = null;
        try
        {
            Connection con=DBConnection.getConnection();
            
            PreparedStatement ps=con.prepareStatement("select * from items where item_id=?");
            ps.setString(1, item_id);
            rs=ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    public static boolean updateItemWithoutImage(String... str)
    {
        boolean status=false;
        try
        {
            Connection con=DBConnection.getConnection();
            
            PreparedStatement ps=con.prepareStatement("update items set item_name=?, item_price=?, item_desc=?, item_category=? where item_id=?");
            //item_id_0, item_name_1, item_price_2, item_desc_3, item_category_4
            ps.setString(1, str[1]);//
            ps.setString(2, str[2]);//
            ps.setString(3, str[4]);////
            ps.setString(4, str[3]);////
            ps.setString(5, str[0]);//
            
            int i=ps.executeUpdate();
            if(i>0)
            {
                status=true;
            }
            else
            {
                status=false;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }
    
    public static boolean updateItemWithImage(FileInputStream fis, String... str)
    {
        int j = 0;
        boolean status=false;
        try
        {
            
            while(j<5)
            {
                System.out.println(str[j]);
                j++;
            }
            
            Connection con=DBConnection.getConnection();
            //fis, item_id_0, item_name_1, item_price_2, item_desc_3, item_category_4
            PreparedStatement ps=con.prepareStatement("update items set item_name=?, item_price=?, item_desc=?, item_category=?, item_img=? where item_id=?");
          
            ps.setString(1, str[1]);//
            ps.setString(2, str[2]);//
            ps.setString(3, str[4]);///
            ps.setString(4, str[3]);///
            ps.setBinaryStream(5, fis);
            ps.setString(6, str[0]);
            
            int i=ps.executeUpdate();
            if(i>0)
            {
                status=true;
            }
            else
            {
                status=false;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
    public static boolean deleteItem(String item_id)
    {
        boolean status=false;
        try
        {
            Connection con=DBConnection.getConnection();
            
            PreparedStatement ps=con.prepareStatement("delete from items where item_id=?");
            ps.setString(1, item_id);
            
            int i=ps.executeUpdate();
            if(i>0)
            {
                status=true;
            }
            else
            {
                status=false;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
    
    public static boolean insertCustomerDetails(String... str)
    {
        boolean status = false;
        
        String name = str[0];
        String email = str[1];
        String password = str[2];
        String gender = str[3];
        String phone_no = str[4];
        String module = str[5];
        
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?,?)");
            
            ps.setString(1,name);
            ps.setString(2,email);
            ps.setString(3,password);
            ps.setString(4,gender);
            ps.setString(5,phone_no);
            ps.setString(6,module);
            
            int i = ps.executeUpdate();
            if(i>0)
            {
                status = true;
            }
            else
            {
                status = false;
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
    
    public static ResultSet cheackCustomerExits(String phono_no)
    {
//        System.out.println(phono_no);
        ResultSet rs = null;
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from register where phono_no=?");
            ps.setString(1,phono_no);
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    public static boolean customerBillingDetails(String customer_phno, String items, String date1, String time1, String emp_email)
    {
        boolean status=false;
        try
        {
            Connection con=dbcon.DBConnection.getConnection();
            
            PreparedStatement ps=con.prepareStatement("insert into customer_shopping_details values(?,?,?,?,?)");
            ps.setString(1, customer_phno);
            ps.setString(2, items);
            ps.setString(3, date1);
            ps.setString(4, time1);
            ps.setString(5, emp_email);
            int i=ps.executeUpdate();
            if(i>0)
            {
                status=true;
            }
            else
            {
                status=false;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
    
    public static ResultSet getCustomerShoppingDetails(String mobile_number)
    {
        ResultSet rs = null;
        try
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from customer_shopping_details where mobile_number=?");
            ps.setString(1,mobile_number);
            rs = ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         return rs;
    }
}
