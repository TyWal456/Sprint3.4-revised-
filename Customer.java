/*Name: Tyrell Walrond
Course: CSC 243
Instructor: Professor Demarco
Filename: Customer.java
Purpose: The purpose of this file is to contain and construct a Customer class for 
		object orientation for a ficticious vacation resort by holding contact information.*/
package rentPack;
import java.util.*;
import java.lang.*;

public class Customer{
     
        Scanner in = new Scanner(System.in);
        public static String custName;
        public static String phone;
        public static String email;
        public static ArrayList<RentObj> rentals = new ArrayList<>();
        
        Customer(String custName, String phone, String email){
        
                setName(custName);
                setPhone(phone);
                setEmail(email);
        
        
        }
        
        Customer(){
                contactInfo();
        }
        
        public void setName(String custName){
                this.custName = custName;
        }
        
        public String getName(){
                return custName;
        }
        
        public void setPhone(String phone){
                this.phone = phone;
         
        }
        
        public String getPhone(){
                return phone;
        }
        
        public void setEmail(String email){
        
                this.email = email;
        }
        
        public String getEmail(){
                
                return email;
        }
        
		public void contactInfo(){
        System.out.println("Enter full name: \t");
        custName=in.nextLine();
        setName(custName);
        
        
        System.out.println("Enter your email address: \t");
        email=in.nextLine();
        setEmail(email);
        
        
        System.out.println("Enter your phone number: \t");
        phone=in.nextLine();
        setPhone(phone);
             
            
    }

    public void getContactInfo(){
            System.out.println("Hello " + getName() +'\n');
            System.out.println("Your telephone is: " + getPhone()+ '\n');
            System.out.println("Your email address is: "+ getEmail() + '\n');
    }
        
        
        
}




				
				
