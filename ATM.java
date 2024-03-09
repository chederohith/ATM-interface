import java.util.Scanner;

public class ATMMachine{
     public static void main(String args[]){
        
    int pin=1234;
   Scanner obj1=new Scanner(System.in);
   System.out.println("Enter your pin"); 
   int inputpin=obj1.nextInt();
   Atm obj2=new Atm();
   if(inputpin==pin){
       obj2.menu();
      }else{ 
         System.out.println("incorrect pin");
   }

 }    
   
}         

class Atm{
   private float balance=0;

 public void menu(){
    System.out.println("1.check balance");
    System.out.println("2.withdraw money");
    System.out.println("3.Deposit money");
    System.out.println("4.exit");
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter your option");
    int option=obj.nextInt();
     switch (option) {
            case 1:
                checkbalance();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                deposit();
                break;
            case 4:
                System.out.println("Exiting...");
                System.exit(0); // Terminate the program
                break;
            default:
                System.out.println("Invalid option");
                break;
           }
      }

      public void checkbalance() {
       System.out.println("balance : "+balance);
        menu();
       }
   
   public void withdraw(){
    System.out.println("Enter withdrawal Amount : "); 
     Scanner object1=new Scanner(System.in);
     float withdraw=object1.nextFloat();
    if(withdraw>balance){
      System.out.println("insuffient funds");
    } else{
    balance=balance-withdraw;
     System.out.println("withdrawal is Done");
      }
      menu();
     }


    public void deposit(){
       Scanner object=new Scanner(System.in);
       float deposit=object.nextFloat();
      balance=balance+deposit;
       System.out.println("Deposit is Done");
       menu();
     }

  
}      
     
    
   