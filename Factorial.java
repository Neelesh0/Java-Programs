import java.util.Scanner;
class Factorial{
public static void main(String[] args){
 
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number which you want to factorial = ");
	int num = sc.nextInt();
	int result = 1;
	for(int i=num;i>=2;i--)
	{ 
	result = result * i;
	}
	System.out.print("Your factorial is = "+result);
}
}