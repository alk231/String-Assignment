import java.util.*;
public class Palindrome {
    public static void main(String[] args)
    {
        String str="2552";
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
        str1=  str1+str.charAt(i);
        }
        if(str1.equals(str))
        {
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
}
}
