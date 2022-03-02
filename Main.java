package Bank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Bank.Account;
import Bank.VipAccount;
/**
 *
 * @author Sama Mostafa
 */ import java.security.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {
	

		static Scanner input = new Scanner(System.in);
		
		
		public static void main(String[] args) throws ParseException   { 
			  System.out.println("please, choose the type of your account 1-for personal acc 2-for VIP acc ");
		        int typeOfAcc=input.nextInt();
		        switch(typeOfAcc) {
		        case 1:
		        {
			Account client1=new Account();
			client1.setUserName("name");
			client1.getUserName();
			client1.setBalance();
			client1.getBalance();
			System.out.println("Please, enter the amount you want to deposit");
			int deposit=input.nextInt();
			client1.setDeposit(deposit);
			client1.getDeposit();
			System.out.println("The added amount ="+deposit);
			client1.setTotalBalance(client1.getBalance(),deposit);
			System.out.println("Your total balance ="+client1.getTotalBalance());
			System.out.print("Enter the amount of money you want withdraw");
			int amount=input.nextInt();
			client1.setAllowableLimit(client1.getBalance(),deposit);
			client1.setCredit(client1.getAllowableLimit(),amount);
			client1.getCredit();
	        client1.setStatus(client1.getBalance(), amount);
	    	for(int counter=0 ; counter<=5 ; counter++) {
			if(amount>client1.getAllowableLimit()){
				System.out.println("Invalid process,its greater than the allowable limit");
				client1.setAllowableLimit(client1.getBalance(),deposit);
				System.out.println("Your allowable limit = "+client1.getAllowableLimit()+" "+"please try again");
				System.out.print("Enter the amount of money you want withdraw");
				 amount=input.nextInt();
				}
			else if(client1.getStatus()==true) {
					client1.getStatus();
					break;
			}else {
				System.out.println("you are  not indebted");
				break;
			} 
	    	}	
			System.out.println("Enter the user name you wanna to transfer to");
			for(int i=0; i<5; i++) {//to make sure that the user name is valid
				String n=input.next();
				char fisrtLetter=n.charAt(0) ;
			if(fisrtLetter>= 'A'  && fisrtLetter <='Z' ) {
				System.out.println("The entered username is "+n);
				
				break;
			}
			else {
				System.out.println("Invalid User Name please try again");
			}}
			System.out.println("Enter the amount you wanna to transfer");
			double transfer=input.nextDouble();
			client1.setRemainingbalance(transfer,client1.getTotalBalance());
			System.out.println(" Done ,your balance after transfer is  "+client1.getRemainingbalance());
			break;
		}
		
        case 2:{
		VipAccount client2=  new VipAccount();
		client2.setUserName("name");
		client2.getUserName();
		client2.setBalance();
		System.out.println(" Your  vip balance = " +client2.getBalance());
		System.out.println("Please, enter the amount you want to deposit");
		int deposit=input.nextInt();
		client2.setDeposit(deposit);
		client2.getDeposit();
		System.out.println("The added amount ="+deposit);
		client2.setTotalBalance(client2.getBalance() ,deposit);
		client2.getTotalBalance();
		System.out.println("Your total balance ="+client2.getTotalBalance());
		System.out.print("Enter the amount of money you want withdraw");
		int amount=input.nextInt();
		client2.setAllowableLimit(client2.getBalance(),deposit);
		client2.setCredit(client2.getTotalBalance(),amount);
		client2.getCredit();
		 client2.setStatus(client2.getBalance(), amount);
		for(int counter=0 ; counter<=5 ; counter++) {
			if(amount>client2.getAllowableLimit()){
				System.out.println("Invalid process,its greater than the allowable limit");
				client2.setAllowableLimit(client2.getBalance(),deposit);
				System.out.println("Your allowable limit = "+client2.getAllowableLimit()+" "+"please try again");
				System.out.print("Enter the amount of money you want withdraw");
				 amount=input.nextInt();
				}
			else if(client2.getStatus()==true) {
					client2.getStatus();
					break;
			}else {
				System.out.println("you are  not indebted");
				break;
			} 
	    	}
		System.out.println("Enter the user name you wanna to transfer to");
		for(int i=0; i<5; i++) {//to make sure that the user name is valid
			String n=input.next();
			char fisrtLetter=n.charAt(0) ;
		if(fisrtLetter>= 'A'  && fisrtLetter <='Z' ) {
			System.out.println("The entered username is "+n);
			
			break;
		}
		else {
			System.out.println("Invalid User Name please try again");
		}}
		System.out.println("Enter the amount you wanna to transfer");
		double transfer=input.nextDouble();
		client2.setRemainingbalance(transfer,client2.getTotalBalance());
		System.out.println(" Done ,your balance after transfer is  "+client2.getRemainingbalance());
		break;
	   }
		          
		default://error
	        System.out.println("invalid");
	        }
	}}
