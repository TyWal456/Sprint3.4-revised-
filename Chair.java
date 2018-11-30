/*Name: Tyrell Walrond
Course: CSC 243
Instructor: Professor Demarco
Filename: Chair.java
Purpose: The purpose of this file is to contain and construct a chair class for 
		object orientation for a ficticious vacation resort*/

package rentPack;
import java.util.*;
import java.lang.*;


public class Chair extends RentObj{
                
              String equipType, equipName, date, year;
                                float charge_per_item, totalCharge, subTotal; 
                                int numDays,number;
                                int choice;
                                char colorChoice, site;
				// double deliveryCharge;
				// char site;
					Chair(){}
					Chair(String equipType, String equipName, float charge_per_item, int number, int numDays, float totalCharge, String date, String year){ 
					this.equipType = equipType;
					this.equipName = equipName;
					this.charge_per_item = charge_per_item;
					this.number = number;
					this.numDays = numDays;
					this.totalCharge = totalCharge;
					this.date = date;
					this.year = year;
				}
				Scanner in = new Scanner(System.in);
				RentObj objCall = new RentObj();
				public static ArrayList<Chair> chairs = new ArrayList<Chair>();
				
				
				
               
				
				public void chairOrder(){
                                
                                        System.out.println("What type of chair would you like to rent?: \n");
                                        System.out.println("1.Sling Low  \n" + "2. Chaise Lounge\n" + "3. Folding Classic\n" + "4. Adirondack\n");
                                        choice = in.nextInt();
                                        
                                        switch(choice){
                                        
                                                case 1:
                                                       objCall.setEquipType("Chair");
						       objCall.setPrice(5);
						       objCall.setEquipName("Sling Low");
                                                      
                                                       System.out.println("How many Sling Low Chairs will you be renting with us?: ");
														number = in.nextInt();
														objCall.setAmount(number);
														System.out.println("How many days are you renting this(these) Sling Low Chairs?: ");
                                                       numDays = in.nextInt();
                                                       objCall.setRentDays(numDays);
                                                       System.out.println("Select delivery a site: ");
													   System.out.println("a. Victoria Vacation Venue\n" + "b. Bella's Beach\n" + "c. Griffin's Grove");
													   site = in.next().charAt(0);
														
														subTotal = getRentDays() * getAmount() * getPrice();
														totalCharge = (float)((SALES_TAX * subTotal) + subTotal);
													   switch(site){
														   
														   case 'a':
															setTotalCost(totalCharge);
															if(getAmount() >= 4){
															   totalCharge = (float)(totalCharge - (totalCharge *.10));
															   setTotalCost(totalCharge);
														   }
														   break;
														   case 'b':
														   totalCharge+= 10;
														   setTotalCost(totalCharge);
														   if(getRentDays() >= 3){
															   totalCharge = (float)(totalCharge - (totalCharge *.10));
															   setTotalCost(totalCharge);
														   }
														   break;
														   
														   case 'c':
																totalCharge+=20;
																setTotalCost(totalCharge);
																if(getRentDays() >= 3){
																totalCharge = (float)(totalCharge - (totalCharge *.10));
																setTotalCost(totalCharge);
														   }
														   break;
													   }
														   System.out.println("Enter date for this delivery(MM/DD): ");
														   date = in.next();
														   objCall.setDate(date);
														   System.out.println("Enter the year: ");
														   year = in.next();
														   objCall.setYear(year);
															Chair chair1 = new Chair(objCall.getEquipType(), objCall.getEquipName(),objCall.getPrice(), objCall.getAmount(),objCall.getRentDays(), objCall.getTotalCost(), objCall.getDate(), objCall.getYear() );
															chairs.add(chair1);
															Iterator itr = chairs.iterator();
														
															while(itr.hasNext()){
																Chair ct = (Chair)itr.next();
																System.out.println("Type| Type Name| Price | Rent Amount| Rent Days|TotalCost(Shipping&Handling incl.) |Date");
																System.out.println("_______________________________________________________");
																System.out.println(ct.equipType+"|  "+ct.equipName+"|  "+ct.charge_per_item+"|  "+ct.number+"|  "+ct.numDays+"|"+ ct.totalCharge+ "  |" +ct.date +"/" + ct.year);
															}
															break;
							case 2:
						      objCall.setEquipType("Chair");
						       objCall.setPrice(7);
						       objCall.setEquipName("Chaise Lounge");
                                                      
                                                      System.out.println("How many Chaise Lounge Chairs will you be renting with us?: ");
														number = in.nextInt();
														objCall.setAmount(number);
														System.out.println("How many days are you renting this(these) Chaise Lounge Chairs?: ");
                                                       numDays = in.nextInt();
                                                       objCall.setRentDays(numDays);
                                                       System.out.println("Select delivery a site: ");
													   System.out.println("a. Victoria Vacation Venue\n" + "b. Bella's Beach\n" + "c. Griffin's Grove");
													   site = in.next().charAt(0);
														
														subTotal = getRentDays() * getAmount() * getPrice();
														totalCharge = (float)((SALES_TAX * subTotal) + subTotal);
													   switch(site){
														   
														   case 'a':
															setTotalCost(totalCharge);
															if(getAmount() >= 4){
															   totalCharge = (float)(totalCharge - (totalCharge *.10));
															   setTotalCost(totalCharge);
														   }
														   break;
														   case 'b':
														   totalCharge+= 10;
														   setTotalCost(totalCharge);
														   if(getRentDays() >= 3){
															   totalCharge = (float)(totalCharge - (totalCharge *.10));
															   setTotalCost(totalCharge);
														   }
														   break;
														   
														   case 'c':
																totalCharge+=20;
																setTotalCost(totalCharge);
																if(getRentDays() >= 3){
																totalCharge = (float)(totalCharge - (totalCharge *.10));
																setTotalCost(totalCharge);
														   }
														   break;
													   }
														   System.out.println("Enter date for this delivery(MM/DD): ");
														   date = in.next();
														   objCall.setDate(date);
														   System.out.println("Enter the year: ");
														   year = in.next();
														   objCall.setYear(year);
															Chair chair2 = new Chair(objCall.getEquipType(), objCall.getEquipName(),objCall.getPrice(), objCall.getAmount(),objCall.getRentDays(), objCall.getTotalCost(), objCall.getDate(), objCall.getYear() );
															chairs.add(chair2);
															Iterator itr2 = chairs.iterator();
														
															while(itr2.hasNext()){
																Chair ct = (Chair)itr2.next();
																System.out.println("Type| Type Name| Price | Rent Amount| Rent Days|TotalCost(Shipping&Handling incl.) |Date");
																System.out.println("_______________________________________________________");
																System.out.println(ct.equipType+"|  "+ct.equipName+"|  "+ct.charge_per_item+"|  "+ct.number+"|  "+ct.numDays+"|"+ ct.totalCharge+ "  |" +ct.date +"/" + ct.year);
															}
															break;
																
															   
															   
													   
													   
													  
                                                               
                                                       
                                                       
						       
						      
						       
									
                                                       
						       case 3:
						       objCall.setEquipType("Chair");
						       objCall.setPrice(5);
						       objCall.setEquipName("Folding Classic");
                                                      
                                                        System.out.println("How many Folding Classic Chairs will you be renting with us?: ");
														number = in.nextInt();
														objCall.setAmount(number);
														System.out.println("How many days are you renting this(these) Chaise Lounge Chairs?: ");
                                                       numDays = in.nextInt();
                                                       objCall.setRentDays(numDays);
                                                       System.out.println("Select delivery a site: ");
													   System.out.println("a. Victoria Vacation Venue\n" + "b. Bella's Beach\n" + "c. Griffin's Grove");
													   site = in.next().charAt(0);
														
														subTotal = getRentDays() * getAmount() * getPrice();
														totalCharge = (float)((SALES_TAX * subTotal) + subTotal);
													   switch(site){
														   
														   case 'a':
															setTotalCost(totalCharge);
															if(getAmount() >= 4){
															   totalCharge = (float)(totalCharge - (totalCharge *.10));
															   setTotalCost(totalCharge);
														   }
														   break;
														   case 'b':
														   totalCharge+= 10;
														   setTotalCost(totalCharge);
														   if(getRentDays() >= 3){
															   totalCharge = (float)(totalCharge - (totalCharge *.10));
															   setTotalCost(totalCharge);
														   }
														   break;
														   
														   case 'c':
																totalCharge+=20;
																setTotalCost(totalCharge);
																if(getRentDays() >= 3){
																totalCharge = (float)(totalCharge - (totalCharge *.10));
																setTotalCost(totalCharge);
														   }
														   break;
													   }
														   System.out.println("Enter date for this delivery(MM/DD): ");
														   date = in.next();
														   objCall.setDate(date);
														   System.out.println("Enter the year: ");
														   year = in.next();
														   objCall.setYear(year);
															Chair chair3 = new Chair(objCall.getEquipType(), objCall.getEquipName(),objCall.getPrice(), objCall.getAmount(),objCall.getRentDays(), objCall.getTotalCost(), objCall.getDate(), objCall.getYear() );
															chairs.add(chair3);
															Iterator itr3 = chairs.iterator();
														
															while(itr3.hasNext()){
																Chair ct = (Chair)itr3.next();
																System.out.println("Type| Type Name| Price | Rent Amount| Rent Days|TotalCost(Shipping&Handling incl.) |Date");
																System.out.println("_______________________________________________________");
																System.out.println(ct.equipType+"|  "+ct.equipName+"|  "+ct.charge_per_item+"|  "+ct.number+"|  "+ct.numDays+"|"+ ct.totalCharge+ "  |" +ct.date +"/" + ct.year);
															}
															break;
							
							
							case 4:
						       objCall.setEquipType("Chair");
						       objCall.setPrice(10);
						       objCall.setEquipName("Adirondack");
                                                      
                                                       System.out.println("How many Adirondacks will you be renting with us?: ");
														number = in.nextInt();
														objCall.setAmount(number);
														System.out.println("How many days are you renting this(these) Adirondack Chairs?: ");
                                                       numDays = in.nextInt();
                                                       objCall.setRentDays(numDays);
                                                       System.out.println("Select delivery a site: ");
													   System.out.println("a. Victoria Vacation Venue\n" + "b. Bella's Beach\n" + "c. Griffin's Grove");
													   site = in.next().charAt(0);
														
														subTotal = getRentDays() * getAmount() * getPrice();
														totalCharge = (float)((SALES_TAX * subTotal) + subTotal);
													   switch(site){
														   
														   case 'a':
															setTotalCost(totalCharge);
															if(getAmount() >= 4){
															   totalCharge = (float)(totalCharge - (totalCharge *.10));
															   setTotalCost(totalCharge);
														   }
														   break;
														   case 'b':
														   totalCharge+= 10;
														   setTotalCost(totalCharge);
														   if(getRentDays() >= 3){
															   totalCharge = (float)(totalCharge - (totalCharge *.10));
															   setTotalCost(totalCharge);
														   }
														   break;
														   
														   case 'c':
																totalCharge+=20;
																setTotalCost(totalCharge);
																if(getRentDays() >= 3){
																totalCharge = (float)(totalCharge - (totalCharge *.10));
																setTotalCost(totalCharge);
														   }
														   break;
													   }
														   System.out.println("Enter date for this delivery(MM/DD): ");
														   date = in.next();
														   objCall.setDate(date);
														   System.out.println("Enter the year: ");
														   year = in.next();
														   objCall.setYear(year);
														   System.out.println("What color would you like your Adirondacks?: ");
                                                       System.out.println("a. Red   "+ "b. Green");
                                                       colorChoice = in.next().charAt(0);
                                                       switch(colorChoice){
                                                       case 'a':
                                                               objCall.setColor("Red");
                                                                break;
                                                       case 'b':
                                                                objCall.setColor("Green");
                                                                break;
                                                       }    
															Chair chair4 = new Chair(objCall.getEquipType(), objCall.getEquipName(),objCall.getPrice(), objCall.getAmount(),objCall.getRentDays(), objCall.getTotalCost(), objCall.getDate(), objCall.getYear() );
															chairs.add(chair4);
															Iterator itr4 = chairs.iterator();
														
															while(itr4.hasNext()){
																Chair ct = (Chair)itr4.next();
																System.out.println("Type| Type Name| Price | Rent Amount| Rent Days|TotalCost(Shipping&Handling incl.) |Date     |Color");
																System.out.println("_______________________________________________________");
																System.out.println(ct.equipType+"|  "+ct.equipName+"|  "+ct.charge_per_item+"|  "+ct.number+"|  "+ct.numDays+"|"+ ct.totalCharge+ "  |" +ct.date +"/" + ct.year + "   |"+ objCall.getColor());
															}
															
							
					
							
                                                       
                                                       
                                        
                                        }
										
				
                                        
                                }
}