package edunova;

public class K5_UvjetnoGrananjeSwitch {

	public static void main(String[] args) {
		
		int operacija=1;
		
		if(operacija==1) {
			
		} else if(operacija==2) {
			
		}else if(operacija==3) {
			
		}else if(operacija==4) {
			
		}else {
			System.out.println("Gre�ka");
		}
				
		// switch radi s cijelim brojevima, char i String
		
		switch(operacija) {
		case 1:
			System.out.println("Zbrajanje");
			break;
		case 2:
			System.out.println("Oduzimanje");
			break;
		case 3:
			System.out.println("Mno�enje");
			break;
		case 4:
			System.out.println("Djeljenje");
			break;
		case 0:
		case 5:
			System.out.println("Bio si blizu ali ne valja");
			break;
			default:
				System.out.println("Gre�ka");
		}
		
		// Doma�a zada�a
		// od JDK 12 nova mogu�a sintaksa
		// https://docs.oracle.com/en/java/javase/13/language/switch-expressions.html
		
		
	}
}
