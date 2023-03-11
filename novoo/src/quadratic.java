
import java.util.*;

public class quadratic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		double root1, root2;
		Scanner in= new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
 //Determinant =  b*b+4*a*c
		double d = b*b-(4*a*c);
	System.out.println("Determinant"+d);
	
		if(d>0)
		{
			root1 = (-b + Math.sqrt(d))/(2*a);
			root2 = (-b - Math.sqrt(d))/(2*a);
			System.out.println("The roots are real and distant");
			System.out.format("root1=%.2f root2=%.2f",root1,root2);
		}
		else if(d==0)
		{
			root1 = root2 = -b/(2*a);
			System.out.println("The roots are real and equal");
			System.out.format("root1 = root2 = %.2f",root1);
		}
		else
		{
			double real = -b /(2*a);
			double imaginary = Math.sqrt(-d)/(2*a);
			System.out.println("The roots are Imaginary");
			System.out.format("root1 = %.2f+%.2f",real,imaginary);
			System.out.format("\nroot2 = %.2f-%.2f",real,imaginary);
			
		}

	}

}

