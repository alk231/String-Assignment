import java.util.*;

public class panagram {
    public static void main(String[]args)
    {
        String str1="The quick brown fox jumps over the lazy dog";
        str1=str1.toUpperCase();
        int index=0;
        int k=0;
        int c=0;
        char arr[]=new char[50];
        int arr1[]=new int[26];
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            if(ch!=' ')
            {
            arr[k++]=ch; 
            }
        }
        for (index=0;index<k;index++)
        {
            arr1[arr[index]-65]++;
        }
        for(int j=0;j<arr1.length;j++)
        {
            if(arr1[j]==0)
            {
                c=1;
                break;
            }
        }
        if(c!=1)
        {
            System.out.println("it's a panagram");
        }
        else
        {
            System.out.println("it's not a panagram");
        }
        }
    }



