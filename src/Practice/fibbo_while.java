package Practice;

public class fibbo_while {

	public static void main(String[] args) {
		
		int a=0,b=1,n=100;

		while(a<=100)
		{
		  System.out.println(a);
		  int c = a+b;

		a=b;
		b=c;

		}
		
		
	}

}
