
package simpleBankingApplication;
import java.util.Scanner;
public class MainClass {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank("Harsha","AX78687");
		b.display();
		
 sc.close();
	}
}
class Bank {
		  String customerName;
		  String customerId;
		  int balance;
		  int previousTransaction;
		  
		  Bank(String customerName,String customerId)
		  {
			  this.customerName=customerName;
			  this.customerId=customerId;
		  }
		  
		  void deposit(int amount)
		  {
			  if(amount!=0)
			  {
				 balance=balance+amount;
				 previousTransaction=amount;
			  }
		  }
		  void withdraw(int amount)
		  {
			  if(amount!=0)
			  {
				  balance=balance-amount;
				  previousTransaction=-amount;
			  }
		  }
		  void getPreviousTransaction(){
			  if(previousTransaction>0)
			  {
				  System.out.println("Amount Deposited: "+previousTransaction);
			  }
			  else if(previousTransaction<0)
			  {
				  System.out.println("Amount Withdrawn: "+Math.abs(previousTransaction));
			  }
			  else
			  {
				  System.out.println("No Transaction Occured");
			  }
		  }
		  void display()
		  {
			  char option='\0';
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Welcome "+customerName);
			  System.out.println("Your Id is: "+customerId);
			  System.out.println("\n");
			  System.out.println("A. Check Balance");
			  System.out.println("B. Deposit");
			  System.out.println("C. Withdraw");
			  System.out.println("D. Previous transaction");
			  System.out.println("E. Exit");
			  System.out.println("\n");
			  
			  do
			  {
				 System.out.println("---------------------------------------------------------------------------------------------");
				  System.out.println("Enter an option");
				  option=sc.next().charAt(0);
				  System.out.println("---------------------------------------------------------------------------------------------");
				  
				  switch(option)
				  {
				  case  'A':
					  System.out.println("Balance: "+balance);
				      break;
				  
				  case 'B':
					  System.out.println("Enter the amount to deposit:");
					  int amount=sc.nextInt();
				      deposit(amount);
				     
				      break;
				  
				  case 'C':
					  System.out.println("Enter the amount to be withdrawn:");
					  int amount2=sc.nextInt();
					  withdraw(amount2);
					  break;
				 
				  case 'D':
					  
					  getPreviousTransaction();

					  break;
				  
				  case 'E':
				      System.out.println("__________________________________________________________________________________________");
				      break;
				  
				  default:
					  System.out.println("Invalid Option!!.Please enter again");
					  break;
					  
				  }
				  
			  }while(option!='E');
			  System.out.println("Thank you for using our services!! Visit again"); 
		  }
		}

