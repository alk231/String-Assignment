import java.util.*;
public class uniqueCharacters {
 
    public static void main(String[] args)
    {
        String str="Alok";
        char ch[]=str.toCharArray();
        boolean flag=true;
        Arrays.sort(ch);
        char temp[]=new char[100];
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]==ch[i+1])
            {
                System.out.println("it does not contain unique characters");
                flag=false;
                break;
            }
        
        }
            if(flag==true)
            {
                System.out.println("it contains all unique characters");
            }
        
    }
}