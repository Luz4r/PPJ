public
	class Cwiczenie44{
		public static void main(String[] args){
			System.out.println("Wprowadz liczbe");
			java.util.Scanner in = new java.util.Scanner(System.in);
			int x = in.nextInt();
			
			if(x < 10)
				System.out.println("Liczba jest mniejsza od 10, 100, 1000");
			else if(x < 100 && x >= 10)
				System.out.println("Liczba jest mniejsza od 100, 1000");
			else
				System.out.println("Liczba jest mniejsza od 1000");
			
			System.out.println("=====================================");
			
			if(x < 0)
				System.out.println("Liczba zawiera się w zbiorze B");
			else if(x > 1)
				System.out.println("Liczba zawiera sie w zbiorze A");
			else
				System.out.println("Liczba zawiera sie w zbiorach A, B i C");
			
		}
	}