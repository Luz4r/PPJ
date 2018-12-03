public
	class Cwiczenie54{
		public static void main(String[] args){
			// wynikiem tej operacji matematycznej podanej w zadaniu powinno byc 0
			
			double sqTwo = Math.sqrt(2);
			
			double result = Math.pow(sqTwo, 2) - 2;
			
			if(result == 0){
				System.out.println("Wynik sie sprawdzil");
			}else{
				System.out.println("Wynik sie nie sprawdzil");
			}
			
			System.out.println(result);
		}
	}