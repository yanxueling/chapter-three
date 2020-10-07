
public class RandomMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber=(int)(Math.random()*12)+1;
		
		switch(randomNumber) {
		case 1:System.out.println("random number "+randomNumber+" is January.");
				break;
		case 2:System.out.println("random number "+randomNumber+" is February.");
				break;
		case 3:System.out.println("random number "+randomNumber+" is March.");
				break;
		case 4:System.out.println("random number "+randomNumber+" is April.");
				break;
		case 5:System.out.println("random number "+randomNumber+" is May.");
				break;
		case 6:System.out.println("random number "+randomNumber+" is June.");
				break;
		case 7:System.out.println("random number "+randomNumber+" is July.");
				break;
		case 8:System.out.println("random number "+randomNumber+" is August.");
				break;
		case 9:System.out.println("random number "+randomNumber+" is September.");
				break;
		case 10:System.out.println("random number "+randomNumber+" is October.");
				break;
		case 11:System.out.println("random number "+randomNumber+"is November.");
				break;
		case 12:System.out.println("random number "+randomNumber+" is December.");
				break;
		}
	}

}
