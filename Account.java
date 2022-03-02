package Bank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sama Mostafa
 */import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class Account{
	
	private static String UserName;
	private double Balance;
	private int deposit;
	private double TotalBalance;
	private double spentMoney;
	private double credit;
	protected double allowableLimit;
	private double creditBalance;
	private boolean Status;
	private double Remainingbalance ;

	
 Scanner input = new Scanner(System.in);
	public void setUserName(String Name) {
		System.out.println("please ,Enter the user name.");
		for(int i=0; i<5; i++) {
		
			String name=input.next();
			char fisrtLetter=name.charAt(0) ;
		if(fisrtLetter>= 'A'  && fisrtLetter <='Z' ) {
			System.out.println("The entered username is "+name);
			break;
		}
		else {
			System.out.println("Invalid User Name please try again");
		}
		}
		UserName = Name;
		System.out.println("please enter your id");
		for(int counter=0 ; counter<=5 ; counter++) {
			String id=input.next();
			int eachNumber=0;
		char Number=id.charAt(eachNumber) ;
		if(Number>= 48  && Number <=57 && id.length()==5) {
			eachNumber++;
			if(id.charAt(4)>= 48  && id.charAt(4) <=57 ) {
				System.out.println("correct id ");
			}
				break;
		}	
		else {
			System.out.println("Invalid id please try again");
		}
		}
	}
	public  String getUserName() {
		return UserName;
	}
	public  void setBalance() {
		Random Balance1 =new Random();
		Balance=Balance1.nextInt(100000);
		//System.out.println(" Your balance = "+Balance);
	}
	public  double getBalance() {
		return Balance;
	}
	public  void setDeposit(int deposit1) {
		deposit1 = deposit;
		
		
	}
	public  int getDeposit() {
		return deposit;
	}
	public void setTotalBalance(double balance,int deposit) {
		TotalBalance = balance+deposit;
	}
	public  double getTotalBalance() {
		return TotalBalance;
	}
	public void setSpentMoney(double spentMoney) {
		this.spentMoney = spentMoney;
	}
	public double getSpentMoney() {
		return spentMoney;
	}
	public void setCredit(double allowableLimit,double spentMoney ) {
		creditBalance=allowableLimit-spentMoney;
	}
	public double getCredit() {
		return creditBalance;
	}
	public void setAllowableLimit(double balance,int deposit) {
		allowableLimit=2*(balance+deposit);
	}
	public  double getAllowableLimit() {
		return allowableLimit;
	}
	public void setStatus(double TotalBalance,double spentMoney) throws ParseException {
	
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date firstDate = sdf.parse("05/1/2021");
        Date d2 =  new Date();

        long diffInday = d2.getTime() - firstDate.getTime();
        TimeUnit time = TimeUnit.DAYS; 
        long diffrence = time.convert(diffInday, TimeUnit.MILLISECONDS);
        
		if(spentMoney>TotalBalance && spentMoney<allowableLimit) {
			if(diffrence >60) {
			Status = true;
			System.out.println("You are indepted");
			
		}else { 
		 Status = true;	
		 long remaniningdays =60-diffrence;
			System.out.println("you will be indepted in : " + remaniningdays +"days");
	}
		}else {
				Status=false;
				}
			}
		
	
  public boolean getStatus() {
		return Status;	
	}
public void setRemainingbalance(double trasnferedAmount,double TotalBalance) {
	
	
		double newBalance=TotalBalance-trasnferedAmount;
		Remainingbalance = newBalance;
	} 
	public double getRemainingbalance() {
		return Remainingbalance ;
	}
	
		
	}

