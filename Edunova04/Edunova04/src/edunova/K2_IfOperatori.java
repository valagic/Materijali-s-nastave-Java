package edunova;

public class K2_IfOperatori {

	public static void main(String[] args) {
		
		int t=2, j=3;
		
		// operatori uspore�ivanja i logi�ki
		// logi�ki AND
		if(t>=2 & j==3) {
			System.out.println("OK 1");
		}
		// & provjerava oba uvjeta
		
		
		// && u slu�aju da prvi uvjet nije zadovoljen
		// drugi se ne�e provjeravati
		if(t>2 && j==3) {
			System.out.println("OK 2");
		}
		
		// logi�ki OR
		// | provjerava oba uvjeta
		if(t>2 | j==3) {
			System.out.println("OK 3");
		}
		
		// || u slu�aju da je zadovoljen prvi uvjet
		// ne provjerava se drugi
		if(t==2 || j<0) {
			System.out.println("OK 4");
		}
		
		// logi�ki NOT
		// !
		if(!(t==0 || j==3)) {
			System.out.println("OK 5");
		}
		
		//ovo nije potrebno
		if(!(t==3)) {
			System.out.println("OK 6");
		}
		
		//pi�e se
		if(t!=3) {
			System.out.println("OK 7");
		}
		
	
		
	}
}
