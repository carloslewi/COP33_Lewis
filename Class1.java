
import java.util.Scanner;
public class Class1{

public static int encrypt(int number)
{
   int x, y, i, j;
   x = number / 1000;
   y = (number % 1000) / 100;
   i = (number % 100) / 10;
   j = number % 10;
   // Replace 
   x = (x + 7) % 10;
   y = (y + 7) % 10;
   i = (i + 7) % 10;
   j = (j + 7) % 10;
   return (i * 1000 + j * 100 + x * 10 + y); 
}
public static int decrypt(int number)
{
   int x, y, i, j;
   x = number / 1000;
   y = (number % 1000) / 100;
   i = (number % 100) / 10;
   j = number % 10;
   // Replace
   x = (x + 3) % 10;
   y = (y + 3) % 10;
   i = (i + 3) % 10;
   j = (j + 3) % 10;
   return (i * 1000 + j * 100 + x * 10 + y);
}

public static void main(String []args){
Scanner sc=new Scanner(System.in);
    int number;
   System.out.println("Enter four-digit number: ");
   number=sc.nextInt();
   System.out.println("Encrypted number is: "+encrypt(number));
   System.out.println("Decrypt cycle: "+decrypt(encrypt(number)));
}
}