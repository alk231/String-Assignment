import java.util.*;
public class Anagram {
    public static String Sort(char arr[],int n)
    {
        String str="";
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
         str=str+String.valueOf(arr[i]);
        }
        return str;
    }
    public static void main(String[] args)
    {
       String str1="school master";
       String str2="the classroom";
       String result1="",result2="";
       char arr1[]=new char[50];
       char arr2[]=new char[50];
       for(int i=0;i<str1.length();i++)
       {
        arr1[i]=str1.charAt(i);
       }
       for(int i=0;i<str2.length();i++)
       {
        arr2[i]=str2.charAt(i);
       }
       result1=Sort(arr1,arr1.length);
       result2=Sort(arr2,arr2.length);
       if(result1.equals(result2))
       {
        System.out.println("it's an anagram");
       }
       else
       {
        System.out.println("it's not an anagram");
       }


    }
}
