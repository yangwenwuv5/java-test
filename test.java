import java.util.Scanner;

/*import java.util.Scanner;

public class test {
              public static void main (String[] args)
              {
            	  Scanner scan = new Scanner(System.in);
            	  String str1 = scan.next();
            	 System.out.println(str1);
              }
}
*/
public class test{
	   public static void main(String[] args)
	   {
		Scanner scan = new Scanner(System.in);
		int str =scan.nextInt();
		System.out.println(sum(str));
	   }
	public static int jieshen(int i) {
		if(i==1) return 1;
		else
			return i*jieshen(i-1);
	}
	public static int sum(int n)
	{
		int count=0;
		for(int i=1; i<=n; i++)
		{
			jieshen(i);
			count+=jieshen(i);
		}
		return count;
		
	}
}