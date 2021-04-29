import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Main 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df=new DecimalFormat("0.00");
    
        
    double money;
    double years;
    double interest;
    double amt;
    double cal2;
    double count;
    double am1;
    double count1;

     System.out.println("Enter the amount of money: ");
     money = sc.nextDouble();
     System.out.println("Enter the number of years: ");
     years = sc.nextDouble();
     System.out.println("Enter the rate of interest: ");
     interest = sc.nextDouble();
     amt = money;
     
     for(int i = 1; i <= years; ++i)
     {
    	 am1 = amt;
    	 count1 = 0;
    	 for(int j = 1;j<=4;++j)
    	 {
    		 amt = amt*Math.pow(1 + (interest/100)/years, 0.25*years);
    		 count = amt - am1 - count1;
    		 System.out.println("In year "+i+" quarter "+j+" you earned $"+df.format(count));
    		 count1 = count1 + count;
    	}
    	 cal2 = am1*Math.pow(1 + (interest/100)/years, years);
    	 System.out.println("At the end of year "+i+" you had $"+df.format(cal2));
    	 amt = cal2;
    }
       sc.close(); 
  }
}