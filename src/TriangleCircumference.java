import java.util.Scanner;

public class TriangleCircumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a , b , c : ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		
		if(a==0||b==0||c==0) {
			System.out.println("illegal!");
			System.exit(1);
		}
		if(a+b>c&&a+c>b&&b+c>a)
            System.out.println("The triangle circumference is: "+(a+b+c));
        else
            System.out.println("illegal!");
	}

}
