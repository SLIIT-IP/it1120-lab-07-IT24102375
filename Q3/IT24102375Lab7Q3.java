import java.util.Scanner;
public class IT24102375Lab7Q3
{
 public static void main(String[] args){
 Scanner j=new Scanner(System.in);
 double discount1=0;
 double bill=0;
 double pay=0;
 int i = 0 ;
 while (i < 6)
 {
 System.out.println("Customer" +(i+1));
 System.out.print("enter the payment method(O or o and C or c): ");
 char W=j.next().charAt(0);
 if(W=='C'||W=='c'){
 System.out.print("Enter the total bill amount:");
  bill=j.nextDouble();
 discount1=bill*0.05;
  pay=bill-discount1;
 System.out.println("discount is = "+discount1);
 System.out.println("amount to be paid is "+pay);
 }
 else if(W=='O'||W=='o'){
 System.out.println("Enter the total bill amount :");
 bill=j.nextDouble();
 pay=bill;
 System.out.println("discount is = "+discount1);
 System.out.println("amount to be paid is "+pay);
 }

 else
 System.out.println("Payment mode is not valid");
  i++;
}
}
}