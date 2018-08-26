import java.util.*;
public class GreatestNumber {

	public static void main(String[] args) {
           Scanner scan =new Scanner(System.in);
		   int a,b,c;
		   a=scan.nextInt();
		   b=scan.nextInt();
		   c=scan.nextInt();
		   if(a>b)
		   {
			   if(a>c)
			   {
			   System.out.println("a is greatest");
			   }
			   else
			   {
				   System.out.println("c is greatest");
			   }
		   }
		   else if(a==b)
		   {
			   if(a>c)
			   {
			   System.out.println("a and b are greatest");
			   }
			   else if(a==c)
			   {
				   System.out.println("a,b and c are greatest");
				   
			   }
			   else
			   {
				   System.out.println("c is greatest");
			   }
		   }
		   else
		   {
			   if(b>c)
			   {
			   System.out.println("b is greatest");}
			   else if(b==c)
			   {
				   System.out.println("b and c are greatest");
				   
			   }
		       else
		       {
			   System.out.println("c is greatest");
		       }
			   }
	}

}
