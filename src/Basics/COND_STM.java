import java.util.*;
/*class IF {
    //IF STSTEMENT(positive/negetive)
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any  positive no ");
        int n=sc.nextInt();
        if(n>0)
            System.out.println("It is a positive no");
    }
}
class IF_ELSE
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no");
        int n= sc.nextInt();
        if(n>0)
            System.out.println("Positive no");
        else
            System.out.println("It is not  a positive no");
    }
}
class Lader_if
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no");
        int n =sc.nextInt();
        if(n>0)
            System.out.println("It is a positive no");
        if(n<0)
            System.out.println("It is a negative no");
        if(n==0)
            System.out.println("Its a zero");
    }
}

class If_Else_If
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no");
        int n=sc.nextInt();
        if(n>0)
            System.out.println("Positive no");
        else if(n<0)
            System.out.println("Negative no");
        else
            System.out.println("Zero");
    }
}
class SWITCH_CASE
{
    public static void main(String[] cas)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no");
        int n=sc.nextInt();
        int ch;
        //need to put it in ch as switch can check for exact characters,integers not conditions
        if(n>0)
            ch=1;
        else if(n<0)
            ch=-1;
        else
            ch=0;
        switch (ch)
        {
            case 1:
                System.out.println("Positive");
                break;
            case -1:
                System.out.println("Negative");
                break;
            case 0:
            System.out.println("Zero");
                break;
            default:
                System.out.println("Enter an integer value ");
        }

    }
}*/



class IF {
    //IF STSTEMENT(positive/negetive)
      static void CHECK(Scanner sc)
    {
        System.out.println("Its IF class");
        System.out.println("Enter any  positive no ");
        int n=sc.nextInt();
        if(n>0)
            System.out.println("It is a positive no");
    }
}
class IF_ELSE
{
    static void CHECK(Scanner sc)
    {
        System.out.println("Its IF_ELSE class");
        System.out.println("Enter any no");
        int n= sc.nextInt();
        if(n>0)
            System.out.println("Positive no");
        else
            System.out.println("It is not  a positive no");
    }
}
class Lader_if
{
    static void CHECK(Scanner sc)
    {
        System.out.println("Its Lader_if class");
        System.out.println("Enter any no");
        int n =sc.nextInt();
        if(n>0)
            System.out.println("It is a positive no");
        if(n<0)
            System.out.println("It is a negative no");
        if(n==0)
            System.out.println("Its a zero");
    }
}

class If_Else_If
{
    static void CHECK(Scanner sc)
    {

        System.out.println("Its If_Else_If class");
        System.out.println("Enter any no");
        int n=sc.nextInt();
        if(n>0)
            System.out.println("Positive no");
        else if(n<0)
            System.out.println("Negative no");
        else
            System.out.println("Zero");
    }
}
class SWITCH_CASE
{
    static void CHECK(Scanner sc)
    {
        System.out.println("Its SWITCH_CASE class");
        System.out.println("Enter any no");
        int n=sc.nextInt();
        int ch;
        //need to put it in ch as switch can check for exact characters,integers not conditions
        if(n>0)
            ch=1;
        else if(n<0)
            ch=-1;
        else
            ch=0;
        switch (ch)
        {
            case 1:
                System.out.println("Positive");
                break;
            case -1:
                System.out.println("Negative");
                break;
            case 0:
                System.out.println("Zero");
                break;
            default:
                System.out.println("Enter an integer value ");
        }

    }
}
public class COND_STM
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        IF.CHECK(sc);
        IF_ELSE.CHECK(sc);
        If_Else_If.CHECK(sc);
        Lader_if.CHECK(sc);
        SWITCH_CASE.CHECK(sc);

    }
}


/*Passing a single object reference ensures all classes share
 the exact same input stream without wasting memory or duplicating data.*/

/*The Danger of Alternatives: If I created separate Scanner instances inside each class,
closing any one of them would permanently shut down the underlying
operating system stream (System.in).

This would cause all subsequent classes to immediately crash
with a NoSuchElementException when trying to read user input."*



import java.util.Scanner;

class IF {
    static void CHECK() { // No parameter passed
        Scanner sc = new Scanner(System.in); // Creating a local scanner
        System.out.println("Enter a positive no: ");
        int n = sc.nextInt();
        if(n > 0) System.out.println("Positive");

        sc.close(); // CRITICAL ERROR: This permanently shuts down System.in!
    }
}

class IF_ELSE {
    static void CHECK() { // No parameter passed
        Scanner sc = new Scanner(System.in); // Trying to open a new scanner
        System.out.println("Enter any no: ");

        // CRASH HERE: System.in was destroyed by the previous class!
        int n = sc.nextInt();
        if(n > 0) System.out.println("Positive");
        else System.out.println("Not positive");

        sc.close();
    }
}

public class COND_STM1 {
    public static void main(String args[]) {
        IF.CHECK();      // Works fine, takes input, then kills System.in
        IF_ELSE.CHECK(); // Crashes instantly with NoSuchElementException
    }
}




OUTPUT:

Enter a positive no:
7
Positive
Enter any no:
Exception in thread "main" java.util.NoSuchElementException
	at java.base/java.util.Scanner.throwFor(Scanner.java:945)
	at java.base/java.util.Scanner.next(Scanner.java:1602)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
	at IF_ELSE.CHECK(COND_STM1.java:21)
	at COND_STM1.main(COND_STM1.java:32)

Process finished with exit code 1
 */