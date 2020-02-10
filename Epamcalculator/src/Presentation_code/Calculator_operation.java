
package Presentation_code;
import java.util.*;

public class Calculator_operation implements Calculator{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Calculator_operation oo=new Calculator_operation();
	double a=s.nextDouble();
	double b=s.nextDouble();
	char c=s.next().charAt(0);
		System.out.println(oo.arithematic(a,b,c));
		}
	@Override
	public double  arithematic(double a,double b,char c) {
		char op[]= {'+','-','*','/'};
		if(c=='+') {
		return (a+b);
		}
		if(c=='-') {
			return (a-b);
			}if(c=='*') {
				return (a*b);
			}
			if(c=='/') {
				return (a/b);
				}
		return 0;
	}
	
	
}
