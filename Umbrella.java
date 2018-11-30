/*Name: Tyrell Walrond
Course: CSC 243
Instructor: Professor Demarco
Filename: Umbrella.java
Purpose: The purpose of this file is to contain and construct a umbrella class for 
		object orientation for a ficticious vacation resort*/

package rentPack;
import java.util.*;
import java.lang.*;

public class Umbrella extends RentObj{

          String equipType, equipName, date, year;
                                float charge_per_item, totalCharge, subTotal; 
                                int numDays,number;
                                int choice;
				// double deliveryCharge;
				// char site;
					Umbrella(){}
					Umbrella(String equipType, String equipName, float charge_per_item, int number, int numDays, float totalCharge, String date, String year){ 
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
				public static ArrayList<Umbrella> umbrellas = new ArrayList<Umbrella>();
               
				public void umbrellaOrder(){
                                
                                        System.out.println("What type of umbrella would you like to rent?: \n");
                                        System.out.println("1. Chair-Side \n" + "2. Single\n" + "3. Family\n" + "4. Tent\n");
                                        choice = in.nextInt();
                                        
                                        switch(choice){
                                        
                                                case 1:
                                                       objCall.setEquipType("Umbrella");
						       objCall.setPrice(5);
						       objCall.setEquipName("Chair-Side");
                                                      
                                                       System.out.println("How many days are you renting this(these) Chair-Sides?: ");
                                                       numDays = in.nextInt();
                                                       objCall.setRentDays(numDays);
						       System.out.println("How many Chair-Sides will you be renting with us?: ");
						       number = in.nextInt();
						       objCall.setAmount(number);
						       System.out.println("Enter date for this delivery(MM/DD): ");
						       date = in.next();
						       objCall.setDate(date);
                                                       System.out.println("Enter the year: ");
                                                       year = in.next();
						       objCall.setYear(year);
													  System.out.println("Select delivery a site: ");
													  System.out.println("a. Victoria Vacation Venue\n" + "b. Bella's Beach\n" + "c. Griffin's Grove");
													  site = in.next().charAt(0);
													  
													  switch(site){
														  
														  case 'a':
															setTotalCost(totalCharge);
															break;
														case 'b':
															totalCharge+= 10;
															setTotalCost(totalCharge);
															break;
														case 'c':
															totalCharge+= 20;
															setTotalCost(totalCharge);
													  } 
													  
						       
									        
						      				Umbrella umbrella1 = new Umbrella(objCall.getEquipType(), objCall.getEquipName(),objCall.getPrice(), objCall.getAmount(), objCall.getRentDays(),objCall.getTotalCost(), objCall.getDate(), objCall.getYear() );
										umbrellas.add(umbrella1);
										Iterator itr = umbrellas.iterator();
										
										while(itr.hasNext()){
											Umbrella ut = (Umbrella)itr.next();
											System.out.println("Type| Type Name| Price | Rent Amount| Rent Days|TotalCost(Shipping&Handling incl.) |Date");
											System.out.println("________________________________________________________");
											System.out.println(ut.equipType+"|  "+ut.equipName +"  |"+ut.charge_per_item+"|  "+ut.number+"|  "+ut.numDays+"|  " +ut.totalCharge + "|  "+ut.date+'/'+ut.year);
										}
										break;
							case 2:
						       objCall.setEquipType("Umbrella");
						       objCall.setPrice(10);
						       objCall.setEquipName("Single");
                                                      
                                                       System.out.println("How many days are you renting this(these) Singles?: ");
                                                       numDays = in.nextInt();
                                                       objCall.setRentDays(numDays);
						       System.out.println("How many Singles will you be renting with us?: ");
						       number = in.nextInt();
						       objCall.setAmount(number);
						       System.out.println("Enter date for this delivery(MM/DD): ");
						       date = in.next();
						       objCall.setDate(date);
                                                       System.out.println("Enter the year: ");
                                                       year = in.next();
						       objCall.setYear(year);
													 System.out.println("Select delivery a site: ");
													  System.out.println("a. Victoria Vacation Venue\n" + "b. Bella's Beach\n" + "c. Griffin's Grove");
													  site = in.next().charAt(0);
													  
													  subTotal = getRentDays() * getAmount() * getPrice();
													  totalCharge = (float)((SALES_TAX * subTotal) + subTotal);
													  
													  switch(site){
														  
														  case 'a':
															setTotalCost(totalCharge);
															break;
														case 'b':
															totalCharge+= 10;
															setTotalCost(totalCharge);
															break;
														case 'c':
															totalCharge+= 20;
															setTotalCost(totalCharge);
													  } 
									        
						      				Umbrella umbrella2 = new Umbrella(objCall.getEquipType(), objCall.getEquipName(),objCall.getPrice(), objCall.getAmount(), objCall.getRentDays(),objCall.getTotalCost(), objCall.getDate(), objCall.getYear() );
										umbrellas.add(umbrella2);
										Iterator itr2 = umbrellas.iterator();
										
										while(itr2.hasNext()){
											Umbrella ut = (Umbrella)itr2.next();
											System.out.println("Type| Type Name| Price | Rent Amount| Rent Days|TotalCost(Shipping&Handling incl.) |Date");
											System.out.println("________________________________________________________");
											System.out.println(ut.equipType+"|  "+ut.equipName +"  |"+ut.charge_per_item+"|  "+ut.number+"|  "+ut.numDays+"|  " +ut.totalCharge + "|  "+ut.date+'/'+ut.year);
										}
										break;
                                                       
						       case 3:
						       objCall.setEquipType("Umbrella");
						       objCall.setPrice(15);
						       objCall.setEquipName("Family-Size");
                                                      
                                                       System.out.println("How many days are you renting this(these) Family Sizes?: ");
                                                       numDays = in.nextInt();
                                                       objCall.setRentDays(numDays);
						       System.out.println("How many Family-Sized Umbrella will you be renting with us?: ");
						       number = in.nextInt();
						       objCall.setAmount(number);
						       System.out.println("Enter date for this delivery(MM/DD): ");
						       date = in.next();
						       objCall.setDate(date);
                                                       System.out.println("Enter the year: ");
                                                       year = in.next();
						       objCall.setYear(year);
						       System.out.println("Select delivery a site: ");
													  System.out.println("a. Victoria Vacation Venue\n" + "b. Bella's Beach\n" + "c. Griffin's Grove");
													  site = in.next().charAt(0);
													  
													  subTotal = getRentDays() * getAmount() * getPrice();
													  totalCharge = (float)((SALES_TAX * subTotal) + subTotal);
													  
													  switch(site){
														  
														  case 'a':
															setTotalCost(totalCharge);
															break;
														case 'b':
															totalCharge+= 10;
															setTotalCost(totalCharge);
															break;
														case 'c':
															totalCharge+= 20;
															setTotalCost(totalCharge);
													  } 
										
										Umbrella umbrella3 = new Umbrella(objCall.getEquipType(), objCall.getEquipName(),objCall.getPrice(), objCall.getAmount(), objCall.getRentDays(),objCall.getTotalCost(), objCall.getDate(), objCall.getYear() );
										umbrellas.add(umbrella3);
										Iterator itr3 = umbrellas.iterator();
										
										while(itr3.hasNext()){
											Umbrella ut = (Umbrella)itr3.next();
											System.out.println("Type| Type Name| Price | Rent Amount| Rent Days|TotalCost(Shipping&Handling incl.) |Date");
											System.out.println("________________________________________________________");
											System.out.println(ut.equipType+"|  "+ut.equipName +"  |"+ut.charge_per_item+"|  "+ut.number+"|  "+ut.numDays+"|  " +ut.totalCharge + "|  "+ut.date+'/'+ut.year);
										}
										break;
							
						       case 4:
						       objCall.setEquipType("Umbrella");
						       objCall.setPrice(20);
						       objCall.setEquipName("Tent");
                                                      
                                                       System.out.println("How many days are you renting this(these) Tents?: ");
                                                       numDays = in.nextInt();
                                                       objCall.setRentDays(numDays);
						       System.out.println("How many Tents will you be renting with us?: ");
						       number = in.nextInt();
						       objCall.setAmount(number);
						       System.out.println("Enter date for this delivery(MM/DD): ");
						       date = in.next();
						       objCall.setDate(date);
                                                       System.out.println("Enter the year: ");
                                                       year = in.next();
						       objCall.setYear(year);
						       System.out.println("Select delivery a site: ");
													  System.out.println("a. Victoria Vacation Venue\n" + "b. Bella's Beach\n" + "c. Griffin's Grove");
													  site = in.next().charAt(0);
													  
													  subTotal = getRentDays() * getAmount() * getPrice();
													  totalCharge = (float)((SALES_TAX * subTotal) + subTotal);
													  
													  switch(site){
														  
														  case 'a':
															setTotalCost(totalCharge);
															break;
														case 'b':
															totalCharge+= 10;
															setTotalCost(totalCharge);
															break;
														case 'c':
															totalCharge+= 20;
															setTotalCost(totalCharge);
													  } 
									        
						      				Umbrella umbrella4 = new Umbrella(objCall.getEquipType(), objCall.getEquipName(),objCall.getPrice(), objCall.getAmount(), objCall.getRentDays(),objCall.getTotalCost(), objCall.getDate(), objCall.getYear() );
										umbrellas.add(umbrella4);
										Iterator itr4 = umbrellas.iterator();
										
										while(itr4.hasNext()){
											Umbrella ut = (Umbrella)itr4.next();
											System.out.println("Type| Type Name| Price | Rent Amount| Rent Days|TotalCost(Shipping&Handling incl.) |Date");
											System.out.println("________________________________________________________");
											System.out.println(ut.equipType+"|  "+ut.equipName +"  |"+ut.charge_per_item+"|  "+ut.number+"|  "+ut.numDays+"|  " +ut.totalCharge + "|  "+ut.date+'/'+ut.year);
										}
										
										}
				}
}
				
                                                       
                                                       
                                        
                                        
                                      
