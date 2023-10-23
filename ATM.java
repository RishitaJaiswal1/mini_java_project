import java.util.Scanner;
import java.io.Console;

class Transactions{
          void func(int n){
            if(n==1){
            System.out.println("********Deposit************");
           }else if(n==2){
            System.out.println("********Transfer************");       
           }else if(n==3){
            System.out.println("*********Withdrawal**********");
           }else {
            System.out.println("Invalid Input");
           }
          } 
}
class Account{
     void account(int z){
            if(z==1){
          System.out.println("********Saving************");
         }else if(z==2){
          System.out.println("*********Current Account*********");
         }else if(z==3){
          System.out.println("*********Fixed Deposit Account*********");
         }else if(z==4){
          System.out.println("*********Salary Account********");
         }else {
          System.out.println("Invalid Input");
         }
     }
}

class Quit{
     void quit(String d){
    System.out.println("    "+"close window"+"    ");
    System.out.println("********Thank you********");
     }
}
class Withdraw extends Account{

  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      Transactions s= new Transactions();
       Account a = new Account();
          Console text=System.console();
          char[] ch=text.readPassword("Enter 4 digit ATM pin code");

         for(int i=0;i<ch.length;i++){
         System.out.print("*");
         }
      
      System.out.println();
      System.out.println("Select the type of Transactions");
      System.out.println("press 1 for Deposit");
      System.out.println("press 2 for Transfer");
      System.out.println("press 3 for Withdrawal Option");

      int t = sc.nextInt();
         s.func(t);
      
        System.out.println();
         System.out.println("Select the type of Account");
         System.out.println("press 1 for Savings");
         System.out.println("press 2 for Current Account");
         System.out.println("press 3 for Fixed Deposit Account");
         System.out.println("press 4 for Salary Account");
        
         int y =sc.nextInt();
             a.account(y); 

        System.out.println();
        System.out.println("Enter the withdrawal amount");
System.out.println("Make sure that you do not enter a withdrawal amount more than the balance in your account");
          
          int u =sc.nextInt();
          System.out.println("Amount :"+u);

          Quit w = new Quit();
       System.out.println("press Enter to close window");
       String m= sc.next();   
            w.quit(m);
        sc.close();
  }
}
