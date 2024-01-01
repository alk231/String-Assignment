import java.util.*;
public class maximumOccuring {
    public static void main(String[] args)
    {
        String str="rfkjenkvnkeeeeeef";
        str=str.toUpperCase();
        char result='\0';
        int max=0;
        int count[]=new int[100];
        int arr[]=new int [100];
        for(int i=0;i<str.length();i++)
        {
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++)
        {
            if(count[str.charAt(i)]>max)
            {
                max=count[str.charAt(i)];
                result=str.charAt(i);
            }
        }
        System.out.println("character "+String.valueOf(result)+" is maximum occuring character");
    }
}
