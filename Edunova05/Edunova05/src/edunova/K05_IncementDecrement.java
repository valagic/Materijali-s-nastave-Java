package edunova;

public class K05_IncementDecrement {
	
	public static void main(String[] args) {
		int i=0;
		System.out.println(i); //0
		i=i+1;
		System.out.println(i); //1
		i+=1; // vrijedi i za - * / %
		System.out.println(i); //2
		i++;
		System.out.println(i); //3
		
		System.out.println();
		// increment
		// i++ prvo koristi pa uve�a
		i=0;
		System.out.println(i++); //0
		System.out.println(i);//1
		// ++i prvo uve�a pa koristi
		System.out.println(++i); //2
		
		//decrement i-- i --i
		
		//u pravilu zadaci na razgovorima na poslu
		//bez izvo�enja koda
		int t=0, k=1;
		t = ++k; //t = 2, k=2
		k = ++t - k--; //t = 3, k=1
		System.out.println(k+t--); //4
		
		// DZ vje�bati 7 zadataka. PRvo si ih iz glave random
		// napi�ite pa na papiru do�ite do rezultata
		// izvo�enjem provjerite
	}

}
