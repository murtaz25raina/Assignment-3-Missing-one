	import java.util.*;
    	public class Palindrome {

    		public static void main(String[] args) {
    			Scanner input=new Scanner(System.in);
    			int num1=input.nextInt();
    		    int reverse=0,rem,num=num1;
    		    while(num>0)
    		    {
    		    	rem=num%10;
    		    	reverse=reverse*10+rem;
    		    	num=num/10;
    		    }
    		    if(num1==reverse)
    		    System.out.println("its a palindrome");
    		    else
    		    	System.out.println("its not a palindrome");
    		    	
    			input.close();
    		}

    	}
