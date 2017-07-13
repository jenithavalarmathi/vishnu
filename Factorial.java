import java.util.*;
import java.io.*;
public class Factorial{
  public static void main(String args[]){
    int i,n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number:");
    n=s.nextInt();
    int fact=1;
    for(i=1;i<=n;i++)
    {
       fact=fact*i;
    }
    System.out.println("The factorial is "+fact);
  }
}
      
      
