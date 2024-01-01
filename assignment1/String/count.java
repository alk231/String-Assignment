public class count {
    public static void main(String[] args)
    {
        String str="123@rbnfjnwla";
        int v=0,c=0,s=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            {
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                v=v+1;
            }
            else
            {
                c=c+1;
            }
        }
            else
            {
                s=s+1;
            }
        }
        System.out.println("no of vowels="+v);
        System.out.println("no of consonents="+c);
        System.out.println("no of special characters="+s);

    }
}
