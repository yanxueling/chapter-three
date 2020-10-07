import java.util.Scanner;

public class CircleCompute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
        double x=input.nextDouble();
        double y=input.nextDouble();
        
        double distance=Math.sqrt(x*x+y*y);
        
        if(distance>10)
            System.out.println("Point("+x+","+y+") is not in the circle");
        else
            System.out.println("Point("+x+","+y+") is in the circle");

	}

}
