import java.util.Scanner;
class Sort
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a string: ");
String str= sc.nextLine();
System.out.println("You have entered: "+str);
int length = str.length();
    System.out.println("Length of the string : " + length);
char first = str.charAt(2);
 System.out.println("charator at 3rd position: " + first);
System.out.println("substring of string ::"+str.substring(4));
System.out.println("index of a is ::"+str.indexOf('a'));
System.out.println("Uppercase ::"+str.toUpperCase());
System.out.println("lowercase ::"+str.toLowerCase());

  }
}

