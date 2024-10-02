import java.util.Scanner;
public class IT24102375Lab7Q1
{
 public static void main(String[] args)
{
 Scanner j=new Scanner(System.in);
 double sum=0;
 int i=0;
 for(i=0;i<4;i++)
 {
  System.out.print("eneter the marks "+(i+1)+":");
  int marks=j.nextInt();
  sum=sum+marks;
 }
 double avg=sum/i; 
 System.out.println("");
 System.out.println("Average is  "+avg);
 if(avg>75)
  System.out.println("Overall grade is : Distinction");
 else if(avg>50)
  System.out.println("Overall grade is : credit");
 else
  System.out.println("Overall grade is : fail");

}
}