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
public class VipAccount  extends Account{
    private double Balance;
	private boolean Status;
   	public  void setBalance() {
   		Random Balance2 =new Random();
   		int low =1000000;
   		int high=2000000;
		 Balance =Balance2.nextInt(high-low)+low;
		 
		}
	
	public  double getBalance() {
		return Balance;
}
	public void setStatus(double TotalBalance,double spentMoney) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date firstDate = sdf.parse("03/5/2021");
        Date d2 =  new Date();

        long diffInday = d2.getTime() - firstDate.getTime();
        TimeUnit time = TimeUnit.DAYS; 
        long diffrence = time.convert(diffInday, TimeUnit.MILLISECONDS);
        
        if(spentMoney>TotalBalance && spentMoney<allowableLimit) {
			if(diffrence >120) {
			Status = true;
			System.out.println("You are indepted");
		}else { 
		 Status = true;	
		 long remaniningdays =120-diffrence;
			System.out.println("you will be indepted in : " + remaniningdays +"days");
	}
		}else {
				Status=false;
				}
			}
			
		
	
  public boolean getStatus() {
		return Status;	
	}
}
