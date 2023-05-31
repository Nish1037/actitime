import java.util.Scanner;
class String5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=new String("Hello");
		String s2=new String("hello");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}