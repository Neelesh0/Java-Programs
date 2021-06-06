import java.util.*;
class Prime{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number = ");
	 int num = sc.nextInt();
		int c =0,i=2; 
		while(num>i)
                  {
		   if(num % i == 0)
			{
				c++;
			}	
			i++;
		  }
		if(c==0)
		System.out.print("No is prime");
		else
		System.out.print("No is not prime");	

	}
}