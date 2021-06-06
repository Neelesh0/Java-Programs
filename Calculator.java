import java.util.Scanner;
class Calculator{
public static void main(String[] args){
 
	Scanner sc = new Scanner(System.in);
	System.out.print("1:Add 2:Subtract 3:Multiply 4:Divide");
	System.out.print("Enter the choice = ");
	int choice = sc.nextInt();	
	
	System.out.print("Enter the two number = ");
	int num = sc.nextInt();
	int num1 = sc.nextInt();	
	int result = 0;
	switch(choice)
	{
		case 1:result = num + num1;
			break; 	
		case 2:result = num - num1;
			break; 	
		case 3:result = num * num1;
			break; 	
		 case 4:result = num / num1;
			break; 	
        
		default:System.out.print("Enter wrong choice");
	}
	
	System.out.print("Your result is = "+result);

}
}
	