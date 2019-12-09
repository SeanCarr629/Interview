
package programminginterview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author scarroll
 */
public class ProgrammingInterview {

 //declare variables
    
 private static String firstName, lastName, startDate, address1, address2,
         city, state, country, zip;
 
 private static PrintWriter writer;

   
    public static void main(String[] args) {
 
        //declare arraylist
        ArrayList<Person> people = new ArrayList<Person>();
     
         //read in data from file   
         try {
            FileReader reader = new FileReader("users.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            String line;
            
            
           String number = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {

             
         //If text file has first line of "1"       
         if(number.equals("1")){
          
                 
                 //collect data from file
               firstName =  line.substring(0, 9).trim();
               lastName =  line.substring(10, 26).trim();
               startDate =  line.substring(27, 35).trim();
               address1 =  line.substring(35, 45).trim();
               address2 =  line.substring(45, 55).trim();
               city = line.substring(55, 65).trim();
               state = line.substring(65, 67).trim();
               country = line.substring(67, 69).trim();
              
               zip = line.substring(70, 80).trim();
               
               
              
              
               //insert data into "Person" object
               people.add(new Person(firstName, lastName, startDate, address1, address2,
                       city, state, country, zip, "1"));
            
               
               
          //if text file has first line of "2"     
         }else{
             
            
             String line2 = line;
             
              String[] array = line.split(",");
              
               firstName =  array[0];
               lastName =  array[1];
               startDate =  array[2];
               address1 =  array[3];
               address2 =  array[4];
               city = array[5];
               state = array[6];
               country = array[7];
               zip = array[8];
              
             
             people.add(new Person(firstName, lastName, startDate, address1, address2,
                       city, state, country, zip, "2"));
             
             
             
             
             
         }
               
         }
            reader.close();
 
           //catch exception
        } catch (IOException e) {
            e.printStackTrace();
        }
         
         
         
     try {
         
        //write data to new file
         writer = new PrintWriter("users_revised.txt");
     } catch (FileNotFoundException ex) {
         Logger.getLogger(ProgrammingInterview.class.getName()).log(Level.SEVERE, null, ex);
     
     }
     String choice;
     Scanner input = new Scanner(System.in);
     System.out.println("Enter 1, for sort by first name, 2 for sort by last name, or 3 for sort by start date");
     choice = input.nextLine();
     
     if(choice.equals("1")){
         
         Collections.sort(people, new CompareByFirstName());
     
     
     }else if (choice.equals("2")){
     
     Collections.sort(people, new CompareByLastName());
     }else{
         
   
     Collections.sort(people, new CompareByStartDate());
     
     }
         
       writer.println(people.get(0).getDatabase());
            for(int i = 0; i < people.size(); i++){
            
             
            writer.println(people.get(i).getFirstName() + " " + people.get(i).getLastName() + ", " +
                    formatDates(people.get(i).getstartDate()));
            writer.println(people.get(i).getAddress1() + ", " + people.get(i).getAddress2());
            writer.println(people.get(i).getCity() + "," + people.get(i).getState() + ",");
            writer.println(people.get(i).getCountry() + "," + people.get(i).getZipcode());
            writer.println(" "); 
         
           
            }
          writer.close();
    
     }
    
    

    //metohd to format date
    static String formatDates(String date)
    {
        
      String monthString;
      String year =  date.substring(0, 4);
      Integer month = Integer.parseInt(date.substring(4, 5));
      String day = date.substring(6,7);
      
      String formattedDate;
     
     //case statement to choose month
     switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString= "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        
       } 
      
     
     //formatted date
      formattedDate = "("+ monthString + " " + month + ", " + year + ")";
      
      return formattedDate;
 
}
    


}
        
        
        
        
        
        
        
        
        
        
        
     
     
        
        
        
        
        
    
    

