import java.util.Scanner;

public class Isbn_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int firstNineDigits=input.nextInt();
		
		int d9=firstNineDigits%10;
		int d8=firstNineDigits/10%10;
		int d7=firstNineDigits/100%10;
		int d6=firstNineDigits/1000%10;
		int d5=firstNineDigits/10000%10;
		int d4=firstNineDigits/100000%10;
		int d3=firstNineDigits/1000000%10;
		int d2=firstNineDigits/10000000%10;
		int d1=firstNineDigits/100000000;

		int d10=(int)((d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11);
		
		if(d10==10)
			System.out.println("The ISBN-10 number is "+firstNineDigits+"X");
		else
			System.out.println("The ISBN-10 number is "+firstNineDigits+d10);
	}

}
