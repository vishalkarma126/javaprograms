import static java.lang.System.in;
import static java.lang.System.in;
import java.util.Scanner;

class Reverse
{
	public void reverse_string(String str)
	{
		StringBuilder str1= new StringBuilder();
		str1.append(str);
		str1.reverse();
		String str2=str1.toString();
		if(str2==str)
		{
		System.out.println("anagram");	
		}
		else 
		{
		System.out.println("not anagram");
		}
	}

	public static void main(String[] args)
	{
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Reverse rv=new Reverse();
		rv.reverse_string(str);
	}
	
}