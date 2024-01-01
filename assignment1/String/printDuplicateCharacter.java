import java.util.*;
public class printDuplicateCharacter
{
    public static void main(String[] args)
    {
        String str="AaaaaMMAN";
        char ch[]=str.toCharArray();
        int j=1;
        Arrays.sort(ch);
        char temp[]=new char[100];
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]==ch[i+1])
            {
                if(temp[j-1]!=ch[i])
                {
                
                temp[j++]=ch[i];
            }
        
        }
    }
        System.out.println("the duplicate elements are:");
        for(int i=0;i<j;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}