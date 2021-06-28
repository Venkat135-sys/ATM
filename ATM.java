//99
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


class Funds extends Exception
{
	Funds(String amount)
	{
		super(amount);
		
	}
}

class ATM
{
	public static void main(String v[])
	{
		
		try
		{
			
			int currentBalance = 50000;
			
			
			
			 Scanner s = new Scanner(System.in);
			 
			 System.out.println("====================Insert your Debit/Credit card Here!==================");
			 System.out.println(":::::::::::enter Language:::::::::::");
			 int n=s.nextInt();
			 switch(n)
			 {
				 case 1 :
					System.out.println("English");
					break;
				 case 2:
					System.out.println("Hindi");
					break;
				default:
				   System.out.println("choose one language");
				   break;

			 }
			 
			 
			 
			 
			 
			 //Pin
			 System.out.println("------Enter your four digit pin number------");
			 int pinNumber=s.nextInt();
			 if(pinNumber==2002||pinNumber==9390||pinNumber==7333||pinNumber==1234||pinNumber==2345)
			 {
				 System.out.println("pin :XXXX"+"(" +pinNumber +")");
				 
				 //Account Type
				 System.out.println("......Select your account Type........");
				 int accountType = s.nextInt();
				 switch(accountType)
				 {
					 case 1:
					    System.out.println("Savings");
						break;
				    case 2:
					    System.out.println("Current");
						break;
				 }
					 
				 
				  
			 System.out.println("=======Enter amount to withdraw========");
			 
			 int withDrawAMount = s.nextInt();
			 
			 System.out.println("Amount requested is Rs:" +withDrawAMount);
			 
			 System.out.println("=====enter pin for your request=======");
			 int pin=s.nextInt();
			 if(pin==pinNumber)
			 {
				 System.out.println("pin :XXXX"+"(" +pin +")");
				
				if(withDrawAMount>currentBalance)
			    {
				   throw new Funds("Insufficient Funds in your account" +" Your account has only Rs:"+currentBalance); 
			    }
			
			
			
			  System.out.println("Your request amount " +withDrawAMount +" " +"is processing.....!please wait");
			
			  currentBalance = currentBalance - withDrawAMount;
			  System.out.println("======================Thank you===================");
			  
			  System.out.println(".....Your recipt in printing..... please wait!!..............");
			  System.out.println("enter any(1-6) number:");
			  int cutomerDetails=s.nextInt();
			  switch(cutomerDetails){
				  case 1:
					System.out.println("---------Union Bank----------");
					System.out.println("Name:Venkat Vadlakonda");
					System.out.println("age:19");
					System.out.println("Accountnumber:2310110xxxxxxxx5733");
					System.out.println("Account type: Savings");
					Date thisDate=new Date();
					SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/YY hh:mm a");
					System.out.println("Date&Time:"+dateForm.format(thisDate));
					System.out.println("Remaining Balance is " +"'" +currentBalance +"'" );
					break;
				case 2:
					System.out.println("---------SBI Bank----------");
					System.out.println("Name:Nakul Vadlakonda");
					System.out.println("age:26");
					System.out.println("Accountnumber:32100000xxxxxxxx5773");
					System.out.println("Account type: Savings");
					Date thisDate1=new Date();
					SimpleDateFormat dateForm1 = new SimpleDateFormat("dd/MM/YY hh:mm a");
					System.out.println("Date&Time:"+dateForm1.format(thisDate1));
					System.out.println("Remaining Balance is " +"'" +currentBalance +"'" );
					break;
				case 3:
					System.out.println("---------HDFC Bank----------");
					System.out.println("Name:Shravika Vadlakonda");
					System.out.println("age:26");
					System.out.println("Accountnumber:2310110xxxxxxxx6767");
					System.out.println("Account type: Savings");
					Date thisDate5=new Date();
					SimpleDateFormat dateForm5 = new SimpleDateFormat("dd/MM/YY hh:mm a");
					System.out.println("Date&Time:"+dateForm5.format(thisDate5));
					System.out.println("Remaining Balance is " +"'" +currentBalance +"'" );
					break;
				case 4:
					System.out.println("---------ICICI Bank----------");
					System.out.println("Name:Sunny Vadlakonda");
					System.out.println("age:27");
					System.out.println("Accountnumber:2310110xxxxxxxxx1133");
					System.out.println("Account type: Savings");
					Date thisDate2=new Date();
					SimpleDateFormat dateForm2 = new SimpleDateFormat("dd/MM/YY hh:mm a");
					System.out.println("Date&Time:"+dateForm2.format(thisDate2));
					System.out.println("Remaining Balance is " +"'" +currentBalance +"'" );
					break;
				case 5:
					System.out.println("---------SBI Bank----------");
					System.out.println("Name:Prasad Vadlakonda");
					System.out.println("age:51");
					System.out.println("Accountnumber:2311112xxxxxxxx5733");
					System.out.println("Account type: Savings");
					Date thisDate3=new Date();
					SimpleDateFormat dateForm3 = new SimpleDateFormat("dd/MM/YY hh:mm a");
					System.out.println("Date&Time:"+dateForm3.format(thisDate3));
					System.out.println("Remaining Balance is " +"'" +currentBalance +"'" );
					break;
				case 6:
					System.out.println("---------Union Bank----------");
					System.out.println("Name:Swarupa Vadlakonda");
					System.out.println("age:45");
					System.out.println("Accountnumber:2310110xxxxxxxx5933");
					System.out.println("Account type: Savings");
					Date thisDate4=new Date();
					SimpleDateFormat dateForm4 = new SimpleDateFormat("dd/MM/YY hh:mm a");
					System.out.println("Date&Time:"+dateForm4.format(thisDate4));
					System.out.println("Remaining Balance is " +"'" +currentBalance +"'" );
					break;
			  }
			  
			   System.out.println("----------------Remove your Debit/Credit card Here!------------------");
				 
			 }
			 
			 else{
				 System.out.println("Invalid pin/pin not matched");
			 }
			
			
			 }
			 
			 else
			 {
				 System.out.println("Invalid pin");
			 }
			 
				 
			 
			 
			
			
		}
		
		
		catch(Funds e)
		{
			System.out.println("Exception caught...");
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("*******************************************");
		}
		
	}
}
				
	