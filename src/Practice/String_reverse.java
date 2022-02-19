package Practice;

public class String_reverse 
{
  public static void main(String[] args) {
	
	  String s = "Mangesh Keshavrao Munge";

	  for(int i=s.length()-1;i>=0;i--)
	  {
	   System.out.print(s.charAt(i));

	  }
	  System.out.println();
	  
	  char a[ ] = s.toCharArray();

	  for(int i=s.length()-1;i>=0;i--)
	  {
	   System.out.print(a[i]);

	  }
      System.out.println();
      
      //Word Count
      
      int count = 1;
      String b = "My name is mangesh munge";
      
      for(int i=0;i<=b.length()-1;i++)
      {
        if((b.charAt(i) == ' ') && (b.charAt(i + 1) !=' '))
      {
      count++;
      }
      }
      System.out.println(count);
	  
	  
}
}
