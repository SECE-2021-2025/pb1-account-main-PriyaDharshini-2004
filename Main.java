package problem1;
import java.io.IOException;
import java.util.*;
class Main{

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
       

        int n,id,balance;
        String name;
        System.out.println("Enter the number of accounts to create");
        n=sc.nextInt();

        Account acc,accf,acct;
        Account[] acc_arr=new Account[n];
        
        int i=0;
        int t=n;
        while(n-->0)
        {  
            System.out.println("Enter the id");
             id=sc.nextInt();
            System.out.println("Enter the name");
             name=sc.next();
            System.out.println("Enter the balance");
         balance=sc.nextInt();
 
         acc=new Account(id,name,balance);

         acc_arr[i++]=acc;
    
        }
        System.out.println("Details");
        
        int acc_id,amount,choice,acc_idfrom,acc_idto;
        boolean bool=true;
        while(bool)
        {
            System.out.println("1) Credit");
            System.out.println("2) Debit");
            System.out.println("3) Transfer");
            System.out.println("4) Exit");

             choice=sc.nextInt(); 
            switch(choice){
                case 1: 
                        System.out.println("Select the account");
                        display(acc_arr,t);
                        System.out.println("Enter the id");
                        acc_id=sc.nextInt();
                        acc=acc_arr[acc_id-1];
                        System.out.println("Enter the amount to add");
                        amount=sc.nextInt();
                        //acc.credit(amount)
                       System.out.println(acc.credit(amount)); 
                       System.out.println("The result after credited:");
                       display(acc_arr,t);
                        break;
                case 2:
                    System.out.println("Select the account");
                    display(acc_arr,t);
                    System.out.println("Enter the id");
                    acc_id=sc.nextInt();
                    acc=acc_arr[acc_id-1];
                    System.out.println("Enter the amount to debit");
                    amount=sc.nextInt();
                    System.out.println(acc.debit(amount)); 
                    System.out.println("The result after debited:");
                       display(acc_arr,t);
                    break;
                case 3:
                     System.out.println("Select the acc to transfer");
                     display(acc_arr,t);
                     
                     acc_idfrom=sc.nextInt();
                     accf=acc_arr[acc_idfrom-1];
                     System.out.println("Select the acc to be transfer");
                     acc_idto=sc.nextInt();
                     acct=acc_arr[acc_idto-1];
                     System.out.println("Enter the amount to be transfered");
                      amount=sc.nextInt();
                     balance=accf.transfer(acct,amount);
                     System.out.println("Amount balance is"+balance);
                     System.out.println("The account is tranfered"+accf.toString());
                     System.out.println("The account is to be tranfered"+acct.toString());

                     amount=sc.nextInt();
                     
                    break;
                default:
                    break;



            }
        }
        sc.close();
    }

    public static void display(Account[] acc_arr,int t)
    {
        for(int index=0;index<t;index++)
        {
            System.out.println("The account details"+(index+1));
           System.out.println(acc_arr[index].toString());
           // acc_arr[index].toString();
        }
    }
}

/*P      NPDT
 * byte Byte  1byte-8bits  2^7   max 0111 1111--> 127 , min -(n+1);
 * char Character  1 byte
 * int Integer  4 byte
 * float Float   4byte
 * double Double  8 byte
 * int a=10 ->primitive data types; a=0 possible but a=null not possible   a.equals(b) not posssible 
 * Integer a=10->Objects   a=NULL possible  a.equals(b);//possible
 * 
 * BigInteger   bigInteger api java
 * BigDecimal
 */