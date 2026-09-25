import java.util.*;
class Atoi {

    int AtoiNum(String s) {
        int i = 0;
        int sign = 1;
        int num = 0;
        //skipping the leading spaces
        while (i < s.length() && s.charAt(i) == ' ')
            i++;
        //checking for the sign
        if (i<s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i<s.length() && s.charAt(i) == '+') {
            sign = +1;
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int dig = s.charAt(i)-'0';//'5'=53 '0'=48 '5'-'0'= 53-48=5
            if (num > (Integer.MAX_VALUE - dig) / 10) {
                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }
            num = (num * 10) + dig;
            i++;
        }
        return sign * num;
    }
}
    class MyAtoi
    {
        public static void main(String[] args)
        {
            Atoi as=new Atoi();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string");
            String s= sc.nextLine();
            System.out.println(as.AtoiNum(s));

        }
    }