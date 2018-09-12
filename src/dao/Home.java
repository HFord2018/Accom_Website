package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Home {
    
    private Connection con;
    
    private PreparedStatement pst;
    
    private ResultSet rs;
    
    public Home()
    {
        
        try{
            //Load driver class and register
            Class.forName("com.mysql.jdbc.Driver");
            
            //Establish the connection
            //this.con1 = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost/test?serverTimezone=UTC", "root", "");                System.out.println("Connection Established");
            
        }
        catch(Exception e){
            
            System.out.println("Exception : " +e);
            
        }
    }
    
    public ArrayList<Properties> getAllProperties()
    {
        ArrayList<Properties> Properties = new ArrayList<Properties>();
        try{
          this.pst = this.con.prepareStatement("SELECT * from properties");
          
          this.rs = this.pst.executeQuery();
          
          while(this.rs.next())
          {
              Properties u1 = new Properties();
              u1.setId(rs.getInt("property_id"));
              u1.setAddress(rs.getString("address"));
              u1.setAccomodationType(rs.getString("accomodation_type"));
              u1.setPricePerWeek(rs.getInt("price_per_week"));
              u1.setBedroomNo(rs.getInt("bedroom_no"));
              u1.setImage(rs.getString("image"));
              Properties.add(u1);
          }
          System.out.println("why are oyu neot nwork" + Properties);
           return  Properties;
     }
       catch(Exception e)
       {
           System.out.println(e);
           return Properties;
       }
        
        
    }
}
