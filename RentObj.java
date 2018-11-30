
/*Name: Tyrell Walrond
Course: CSC 243
Instructor: Professor Demarco
Filename: RentObj.java
Purpose: The purpose of this file is to contain and construct an object class; containing abstract methods for 
		object orientation for a ficticious vacation resort*/

package rentPack;
import java.util.*;
import java.lang.*;

public class RentObj{
       RentObj(){}
	   RentObj(String equipType, String equipName, float charge_per_item, int number, int numDays, float totalCharge, String date){
				this.equipType = equipType;
				this.equipName = equipName; 
				this.charge_per_item = charge_per_item;
				this.numDays = numDays;
				this.date = date;
				this.number = number;
				this.totalCharge = totalCharge;
    }   
		Scanner in = new Scanner(System.in);
       
       
				public static String equipType = " ";
				public static String equipName = " ";
				public static float totalCharge;
				public static int numDays;
				public static String date;
				public static final double SALES_TAX = 0.06;
				public static double deliveryCharge;
				public static float charge_per_item;
				public char choice = ' ';
				public int typeChoice;
				public char site;
				public static int number;
				public float subTotal = 0;
				public float totalSum = 0;
				public String color;
                                public float discount;
				
				public String yyyy;
				
				
				public void setYear(String yyyy){
					this.yyyy = yyyy;
				}
				
				public String getYear(){
					return yyyy;
				}
				
				public void setPrice(float charge_per_item){
					this.charge_per_item = charge_per_item;
				}
				
				public static float getPrice(){
						return charge_per_item;
				}
				public void setRentDays(int numDays){
						this.numDays = numDays;
				}
				public static int getRentDays(){
						return numDays;
				}
						
				public void setEquipType(String equipType){
                                        this.equipType = equipType;
                                }
				public String getEquipType(){
						return equipType;
				}
				public void setEquipName(String equipName){
					this.equipName = equipName;
				}
				public String getEquipName(){
					return equipName;
				}
				public void setAmount(int number){
					this.number = number;
				}
				public static int getAmount(){
					return number;
				}
				public void setTotalCost(float totalCharge){
					
					this.totalCharge = totalCharge;
				}
						
				public static float getTotalCost(){
						return totalCharge;
				}
				public void setDate(String date){
						
						this.date = date;
                                           
				}
				public static String getDate(){
						return date;
				}
				
				public void setDelivery( double deliveryCharge){
						this.deliveryCharge = deliveryCharge;
				}

				public static double getDelivery(){
					return deliveryCharge;
				}
                                
				public void setColor(String color){
						this.color = color;
				}
				
				public String getColor(){
						return color;
				}
				
                                
                                   
		
                  

				

		   
	          
				
				
        
        
        
        
        

}