import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class aaa {
public static void main(String a[])
{    
	int k,len,b;
	String s;
	Scanner ss=new Scanner(System.in);
	System.out.println("enter the number");
	s=ss.next();
	System.out.println("enter the k elements to delete");
	k=ss.nextInt();
	len=s.length();
    char ch[]=s.toCharArray();
    ArrayList<Integer>a1=new ArrayList<Integer>();
    for(int i=0;i<len;i++)
    {
    	a1.add(Character.getNumericValue(ch[i]));
    }
    Collections.sort(a1);
    b=k-len;
    for(int j=0;j<b;j++)
    {
    	System.out.print(a1.get(j)+" ");
    }
}
}
