
package programminginterview;

/**
 *
 * @author scarroll
 */
public class Person {
    
    
    private String firstName, lastName, startDate, address1, address2, city, state, 
            country, zip, databaseType;
    
    
    
    public Person(String firstName, String lastName, String startDate, String address1,
    String address2, String city, String state, String country, String zip, String databaseType){
        
       this.firstName = firstName;
       this.lastName = lastName;
       this.startDate = startDate;
       this.address1 = address1;
       this.address2 = address2;
       this.city = city;
       this.state = state;
       this.country = country;
       this.zip = zip;
       this.databaseType = databaseType;
        
    }
    
    
    
    String getFirstName()
    {
        return this.firstName;
        
    }
    
      String getLastName()
    {
        return this.lastName;
        
    }


     String getstartDate()
    {
        return this.startDate;
        
    }
     
     
     
     
     String getAddress1()
    {
        return this.address1;
        
    }
     
     
     String getAddress2()
    {
        return this.address2;
        
    }
        
     
     String getCity()
    {
        return this.city;
        
    }
     
     
      String getState()
    {
         if (this.state.length() == 0)
        {
            this.state = "CA";
        }
        
        
        
        return this.state;
        
    }
      
      
      
      String getCountry()
    {
        if (this.country.length() == 0)
        {
            this.country = "USA";
        }
        
        
        
        return this.country;
        
    }
      
      
      
      
      
        String getZipcode()
    {
        return this.zip;
        
    }
        
        
        
        
          String getDatabase()
    {
        return this.databaseType;
        
    }
         
         
         
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
