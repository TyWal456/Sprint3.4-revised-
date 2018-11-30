/*Name: Tyrell Walrond
Course: CSC 243
Instructor: Professor Demarco
Filename: Boat.java
Purpose: The purpose of this file is to contain and construct a boat class for 
		object orientation for a ficticious vacation resort*/

package rentPack;
import java.util.*;
import java.lang.*;

public class Boat extends RentObj{
                
				String equipType, equipName, date, year;
                                float charge_per_item, totalCharge, discount, subTotal;
                                int numDays,number;
                                int choice;
				char site;
					Boat(){}
					Boat(String equipType, String equipName, float charge_per_item, int number, int numDays, float totalCharge, String date, String year){ 
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
				public static ArrayList<Boat> boats = new ArrayList<Boat>();
               
				
				
				
                              
                                
			public void boatOrder(){
			
					System.out.println("What type of boat would you like to rent?: \n");
					System.out.println("1. Paddle Board \n" + "2. Single Kyack\n" + "3. Tandem Kyack\n" + "4. 3-Person Canoe\n");
					choice = in.nextInt();
					
                                        switch(choice){
                                        
							case 1:
                                                                objCall.setEquipType("Boat");
                                                                objCall.setPrice(65);
                                                                objCall.setEquipName("Paddle Board");

                                                                System.out.println("How many Paddle Boards will you be renting with us?: ");
                                                                number = in.nextInt();
                                                                objCall.setAmount(number);
                                                                System.out.println("How many days are you renting this(these) Paddle Boards?: ");
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
                                                                        if(getRentDays() >= 3){
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
						      
						       
						       
						      
						      
									        
						      				Boat boat1 = new Boat(objCall.getEquipType(), objCall.getEquipName(),objCall.getPrice(), objCall.getAmount(),objCall.getRentDays(), objCall.getTotalCost(), objCall.getDate(), objCall.getYear() );
										boats.add(boat1);
										
										Iterator itr = boats.iterator();
										
										while(itr.hasNext()){
											Boat bt = (Boat)itr.next();
											System.out.println("Type| Type Name| Price | Rent Amount| Rent Days|TotalCost(Shipping&Handling incl.) |Date");
											System.out.println("_______________________________________________________");
											System.out.println(bt.equipType+"|  "+bt.equipName+"|  "+bt.charge_per_item+"|  "+bt.number+"|  "+bt.numDays+"|"+ bt.totalCharge+ "  |" +bt.date +"/" + bt.year);
										}
										break;
							case 2:
						       objCall.setEquipType("Boat");
						       objCall.setPrice(45);
						       objCall.setEquipName("Single Kyack");
                                                      
                                                        System.out.println("How many Single Kyacks will you be renting with us?: ");
														number = in.nextInt();
														objCall.setAmount(number);
						       System.out.println("How many days are you renting this(these) Single Kyacks?: ");
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
                                                                        if(getRentDays() >= 3){
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
										Boat boat2 = new Boat(objCall.getEquipType(), objCall.getEquipName(),objCall.getPrice(), objCall.getAmount(),objCall.getRentDays(), objCall.getTotalCost(), objCall.getDate(), objCall.getYear() );
										boats.add(boat2);
										
										Iterator itr2 = boats.iterator();
										
										while(itr2.hasNext()){
											Boat bt = (Boat)itr2.next();
											System.out.println("Type| Type Name| Price | Rent Amount| Rent Days|TotalCost(Shipping&Handling incl.) |Date");
											System.out.println("_______________________________________________________");
											System.out.println(bt.equipType+"|  "+bt.equipName+"|  "+bt.charge_per_item+"|  "+bt.number+"|  "+bt.numDays+"|"+ bt.totalCharge+ "  |" +bt.date +"/" + bt.year);
										}
										break;
                                                       
						       case 3:
						       objCall.setEquipType("Boat");
						       objCall.setPrice(65);
						       objCall.setEquipName("Tandem Kyack");
							   System.out.println("How many Tandem Kyacks will you be renting with us?: ");
                                                        number = in.nextInt();
                                                        objCall.setAmount(number);
						       System.out.println("How many days are you renting this(these) Tandem Kyacks?: ");
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
                                                                        if(getRentDays() >= 3){
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
										Boat boat3 = new Boat(objCall.getEquipType(), objCall.getEquipName(),objCall.getPrice(), objCall.getAmount(),objCall.getRentDays(), objCall.getTotalCost(), objCall.getDate(), objCall.getYear() );
										boats.add(boat3);
										
										Iterator itr3 = boats.iterator();
										
										while(itr3.hasNext()){
											Boat bt = (Boat)itr3.next();
											System.out.println("Type| Type Name| Price | Rent Amount| Rent Days|TotalCost(Shipping&Handling incl.) |Date");
											System.out.println("_______________________________________________________");
											System.out.println(bt.equipType+"|  "+bt.equipName+"|  "+bt.charge_per_item+"|  "+bt.number+"|  "+bt.numDays+"|"+ bt.totalCharge+ "  |" +bt.date +"/" + bt.year);
										}
										break;
                                                      
                                                       									        

							
						       case 4:
						       objCall.setEquipType("Boat");
						       objCall.setPrice(75);
						       objCall.setEquipName("3-Person Canoe");
                                                      
                                                       System.out.println("How many 3-Person Canoes will you be renting with us?: ");
														number = in.nextInt();
														objCall.setAmount(number);
						       System.out.println("How many days are you renting this(these) 3-Person Canoes?: ");
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
                                                                if(getRentDays() >= 3){
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
                                                Boat boat4 = new Boat(objCall.getEquipType(), objCall.getEquipName(),objCall.getPrice(), objCall.getAmount(),objCall.getRentDays(), objCall.getTotalCost(), objCall.getDate(), objCall.getYear() );
                                                boats.add(boat4);
                                                
                                                Iterator itr4 = boats.iterator();
                                                
                                                while(itr4.hasNext()){
                                                        Boat bt = (Boat)itr4.next();
                                                        System.out.println("Type| Type Name| Price | Rent Amount| Rent Days|TotalCost(Shipping&Handling incl.) |Date");
                                                        System.out.println("_______________________________________________________");
                                                        System.out.println(bt.equipType+"|  "+bt.equipName+"|  "+bt.charge_per_item+"|  "+bt.number+"|  "+bt.numDays+"|"+ bt.totalCharge+ "  |" +bt.date +"/" + bt.year);
                                                }
						
						
										
					
				
                                        
                                }
			}
}

				


				