/*Name: Tyrell Walrond
Course: CSC 243
Instructor: Professor Demarco
Filename: rentDriver.java
Purpose: The purpose of this file is to facilitate methods using constructs for 
		object orientation for a ficticious vacation resort*/

package rentPack;
import java.util.*;
import java.lang.*;



public class rentDriver{
	

	public static String type; 
	public static String name; 
	public static float totalPrice;
	public static String date;
	public static String Year;

	rentDriver(){}
	rentDriver(String type, String name, float totalPrice, String date, String Year){
		
		this.type = type;
		this.name = name;
		this.totalPrice = totalPrice;
		this.date = date;
		this.Year = Year;
		
	}
	public static ArrayList<rentDriver> items = new ArrayList<rentDriver>();
	

	
	
	


	
        



public static void main(String args[]){
	
	Scanner in = new Scanner(System.in);
	char choice;
	int orderNo = 1;
	Customer rentGrab = new Customer();
	RentObj objGrab = new RentObj();
	Boat boatObj = new Boat();
	Chair chairObj = new Chair();
	Umbrella umbrellaObj = new Umbrella();
	float grandTotal = 0;
	 
	
        
        

        
                
	
	
    rentGrab.getContactInfo();
	System.out.println("     Welcome to Victoria's Vacation Renting Shack!      \n");
     
        
       
                for(int i = 0; i < 5; i++){
                
		System.out.println("Order#: 00"+ orderNo + "\n\n");
        
		orderNo++;
		
		System.out.println("  What equipment type would you like to rent?: ");
		System.out.println("  a. Boats  " + '\n' + "  b. Chairs  " + '\n' + "  c. Umbrellas ");
		choice = in.next().charAt(0);
                
			switch(choice){
	
				 case 'a':
					boatObj.boatOrder();
					for(int j = 0; j < boatObj.boats.size(); j++){
                                                rentDriver boatList = new rentDriver(boatObj.boats.get(j).getEquipType(), boatObj.boats.get(j).getEquipName(), boatObj.boats.get(j).getTotalCost(), boatObj.boats.get(j).getDate(), boatObj.boats.get(j).getYear());
						items.add(boatList);
                                                grandTotal+= boatObj.boats.get(j).getTotalCost();

                                                
					}
                                        
						System.out.println("Grand Total:$" + Math.round(grandTotal));
					break;
				 case 'b':
					chairObj.chairOrder();
					for(int k = 0; k < chairObj.chairs.size(); k++){
                                                  rentDriver chairList = new rentDriver(chairObj.chairs.get(k).getEquipType(), chairObj.chairs.get(k).getEquipName(), chairObj.chairs.get(k).getTotalCost(), chairObj.chairs.get(k).getDate(), chairObj.chairs.get(k).getYear());
						items.add(chairList);
                                                grandTotal+= chairObj.chairs.get(k).getTotalCost();
					}
						System.out.println("Grand Total:$" + Math.round(grandTotal));
					break;
				 case 'c':
					umbrellaObj.umbrellaOrder();
					for(int a = 0; a < umbrellaObj.umbrellas.size(); a++){
                                                 rentDriver umbList = new rentDriver(umbrellaObj.umbrellas.get(a).getEquipType(), umbrellaObj.umbrellas.get(a).getEquipName(), umbrellaObj.umbrellas.get(a).getTotalCost(), chairObj.chairs.get(a).getDate(), chairObj.chairs.get(a).getYear());
                                                 items.add(umbList);
						grandTotal+= umbrellaObj.umbrellas.get(a).getTotalCost();
					}
					System.out.println("Grand Total:$" + Math.round(grandTotal));
                                       
			} 
		}
	}
}				
					
					
                           
                              
	