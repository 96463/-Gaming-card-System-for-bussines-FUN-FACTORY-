 import java.util.Scanner;
  class Switch
 {
   public static void main (String[]args)
   {
       int day;
       int day1=1;  //here day1=weekend
       int gameno,deposit,balance=10;
     Scanner obj=new Scanner(System.in);
     System.out.println("swipe the card");
     System.out.println("press enter");
     String str=obj.nextLine();
     System.out.println("wait for just a minute card is reading");
     System.out.println("game is\n*g1\n*g2\n*g3\n*g4\n*g5\n*g6\n*g7\n*g8\n*g9\n*g10");
     System.out.println(" please enter the game no you want to play");
     gameno=obj.nextInt();
     switch(gameno)
     {
       case 1:
             {
          System.out.println(" enter the day");
           day=obj.nextInt();
           if(day1==day)        
           { 
               int g1price=20;
               
              if( balance>=g1price)
               { 
                   balance=balance-g1price;
                  System.out.println("enter into g1");
                  System.out.println("left balance="+balance);
               }
             
               else
               
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than10");
           }
  else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g1");
           }
         }
           }                 
           
 else 
         { 
        int g1price=10;
    if(balance>=g1price)
         {
           balance=balance-g1price;
         
         System.out.println("enter into g1");
         System.out.println("left balance="+balance);
         }
         else
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than 10");
 }
         
           else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
 System.out.println(" enter into game g1");
           }
         }
     }
                              break;
                              }
   
       case 2:
         {
   
          System.out.println(" enter the day");
           day=obj.nextInt();
           if(day1==day)        
           { 
               int g2price=20;
               
              if( balance>=g2price)
               { 
                   balance=balance-g2price;
                  System.out.println("enter into g2");
                  System.out.println("left balance="+balance);
               }
             
               else
               
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than10");
           }
  else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g2");
           }
         }
           }                 
           
 else 
         { 
        int g2price=10;
               if(balance>=g2price)
         {
           balance=balance-g2price;
         
         System.out.println("enter into g2");
         System.out.println("left balance"+balance);
         }
         else
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than 10");
 }
         
           else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g2");
           }
         }
     }
    
         break;
       }
         case 3:
           {
          System.out.println(" enter the day");
           day=obj.nextInt();
           if(day1==day)        
           { 
               int g3price=20;
               
              if( balance>=g3price)
               { 
                   balance=balance-g3price;
                  System.out.println("enter into g3");
                  System.out.println("left balance="+balance);
               }
             
               else
               
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than10");
           }
  else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g3");
           }
         }
           }                 
           
 else 
         { 
        int g3price=10;
               if(balance>=g3price)
         {
           balance=balance-g3price;
         
         System.out.println("enter into g3");
         System.out.println("left balance"+balance);
         }
         else
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("min amount should more than 10");
           }
         
           else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g3");
           }
         }
     }
    
       
               break;
       }
             
         case 4:
             
 {
   
          System.out.println(" enter the day");
           day=obj.nextInt();
           if(day1==day)        
           { 
               int g4price=20;
               
              if( balance>=g4price)
               { 
                   balance=balance-g4price;
                  System.out.println("enter into g4");
 System.out.println("left balance="+balance);
               }
             
               else
               
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than10");
           }
  else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g4");
           }
         }
           }                 
           
 else 
         { 
        int g4price=10;
    if(balance>=g4price)
         {
           balance=balance-g4price;
         
         System.out.println("enter into g4");
         System.out.println("left balance"+balance);
         }
         else
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than 10");
 }
         
           else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g2");
           }
         }
     }      
     break;
 }
       
       case 5:
       {
    System.out.println(" enter the day");
           day=obj.nextInt();
           if(day1==day)        
           { 
               int g5price=20;
               
              if( balance>=g5price)
               { 
                   balance=balance-g5price;
                  System.out.println("enter into g5");
                  System.out.println("left balance="+balance);
               }
             
               else
               
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than10");
           }
  else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g5");
           }
         }
           }                 
           
 else 
         { 
        int g5price=10;
               if(balance>=g5price)
         {
           balance=balance-g5price;
         
         System.out.println("enter into g1");
         System.out.println("left balance"+balance);
         }
         else
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("min amount should be more than 10");
 }
         
           else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g5");
           }
         }
     }
    
         break;
       }
         case 6:             
        {
          System.out.println(" enter the day");
           day=obj.nextInt();
           if(day1==day)        
           { 
               int g6price=20;
               
              if( balance>=g6price)
               { 
                   balance=balance-g6price;
                  System.out.println("you enterd into g6");
                   System.out.println("left balance="+balance);
               }
             
               else
               
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than10");
           }
  else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g1");
           }
         }
           }                 
           
 else 
         { 
        int g6price=10;
    if(balance>=g6price)
         {
           balance=balance-g6price;
         
         System.out.println("enter into g6");
         System.out.println("left balance"+balance);
         }
         else
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than 10");
 }
         
           else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g6");
           }
         }
     }
     break;
        }
                 case 7:
             {
          System.out.println(" enter the day");
           day=obj.nextInt();
           if(day1==day)        
           { 
               int g7price=20;
               
              if( balance>=g7price)
               { 
                   balance=balance-g7price;
                  System.out.println("you entered into g7");
                  System.out.println("left balance="+balance);
               }
             
               else
               
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than10");
           }
  else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g7");
           }
         }
           }                 
           
 else 
         { 
        int g7price=10;
    if(balance>=g7price)
         {
           balance=balance-g7price;
         
         System.out.println("enter into g7");
         System.out.println("left balance="+balance);
         }
         else
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than 10");
 }
         
           else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
             System.out.println(" enter into game g7");
           }
         }
     }
                              break;
                              }
       case 8:
                        
 {
          System.out.println(" enter the day");
           day=obj.nextInt();
           if(day1==day)        
           { 
               int g8price=20;
               
              if( balance>=g8price)
               { 
                   balance=balance-g8price;
                  System.out.println("you enterd into g8");
                   System.out.println("left balance="+balance);
               }
             
               else
               
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than10");
           }
  else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g8");
           }
         }
           }                 
           
 else 
         { 
        int g8price=10;
    if(balance>=g8price)
         {
           balance=balance-g8price;
         
         System.out.println("enter into g8");
         System.out.println("left balance"+balance);
         }
         else
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than 10");
 }
         
           else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g2");
           }
         }
     }
     break;
 }
      case 9:                  
       {
          System.out.println(" enter the day");
           day=obj.nextInt();
           if(day1==day)        
           { 
               int g9price=20;
               
              if( balance>=g9price)
               { 
                   balance=balance-g9price;
                  System.out.println("entered into g9");
                  System.out.println("left balance="+balance);
              }
               else     
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than10");
           }
  else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g9");
           }
         }
           }                 
 else 
         { 
        int g9price=10;
    if(balance>=g9price)
         {
           balance=balance-g9price;
         System.out.println("enter into g9");
         System.out.println("left balance="+balance);
         }
         else
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than 10");
 }
         
           else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
            System.out.println(" enter into game g2");
           }
         }
     }
           break;
       }
            case 10:         
          {
          System.out.println(" enter the day");
           day=obj.nextInt();
           if(day1==day)        
           { 
               int g10price=20;
               
              if( balance>=g10price)
               { 
                   balance=balance-g10price;
                  System.out.println("enter into g10");
                  System.out.println("left balance="+balance);
               }
               else   
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than10");
           }
  else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g10");
           }
         }
           }                 
           
 else 
         { 
        int g10price=10;
    if(balance>=g10price)
         {
           balance=balance-g10price;
         System.out.println("enter into g10");
         System.out.println("left balance"+balance);
         }
         else
         {
           System.out.println("insufficient fund");
           System.out.println("you want to add balance");
           System.out.println("enter money to be deposited");
           deposit=obj.nextInt();
          if(deposit<10)
           {
             System.out.println("minimum amount should more than 10");
 }
           else
           {
           balance=balance+deposit;
           System.out.println("successfully deposite");
           System.out.println("current balance="+balance);
           System.out.println(" enter into game g10");
           }
         }
     }         
              break;
          }
                 default:
                  { 
                     System.out.println("exit");
                }   
   }
           }
       }
