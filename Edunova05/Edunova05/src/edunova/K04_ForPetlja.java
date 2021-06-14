package edunova;

public class K04_ForPetlja {
	
	public static void main(String[] args) {
		//petlja ili iteracije (loop)
		//ponavljanje jednos te istog koda odre�eni broj puta
		
		//10 puta ispi�ite osijek jedno ispod drugog
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		
		System.out.println();
		
		//sintaksa for petlje
		//for (od kuda; do kuda; uve�anja/umanjenje)
		
		for(int i=0;i<10;i=i+1) {
			System.out.println("Osijek");
		}
		
		System.out.println();
		
		for(int i=0;i<10;i=i+1) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i=1;i<=10;i=i+1) {
			System.out.println(i);
		}
		
		System.out.println();
		
		int odKuda = 5, doKuda=10;
		
		for(int i=odKuda;i<=doKuda;i=i+1) {
			System.out.println(i);
		}
		
		// od sada koristimo i++, i--
		System.out.println();
		for(int i=10;i>0;i--) {
			System.out.println(i);
		}
		
		//zbrojiti prvih 100 brojeva
		int zbroj=0;
		for(int i=0;i<=100;i++) {
			zbroj+=i;
		}
		System.out.println(zbroj);
		
		System.out.println();
		//ognje��ivanje petlje
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		//doma�a zada�a: lijepo formatirati tablicu
		System.out.println();
		//preskakanje - nastavak izvo�enja petlje
		int preskoci = 4;
		for(int i=0;i<10;i++) {
			if(preskoci==i) {
				continue;
			}
			System.out.println(i);
			/*
			System.out.println(i+1);
			System.out.println(i+2);
			System.out.println(i+3);
			System.out.println(i+4);
			System.out.println(i+5);
			System.out.println(i+6);
			*/
		}
		System.out.println();
		//lo�a alternativa
		for(int i=0;i<10;i++) {
			if(preskoci!=i) {
				System.out.println(i);
				/*
				System.out.println(i+1);
				System.out.println(i+2);
				System.out.println(i+3);
				System.out.println(i+4);
				System.out.println(i+5);
				System.out.println(i+6);
				*/
			}
			
		}
		System.out.println();
		//petlja se mo�e nasilno prekinuti
		for(int i=0;i<10;i++) {
			if(i==preskoci) {
				break;
			}
			System.out.println(i);
		}
		
		// nasilno prekidanje ugnje�enih petlji
		//labela
		vanjska:
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				if(j==4) {
					break vanjska;
				}
			}
		}
	}

}
