public
	class Cwiczenie56{
		public static void main(String[] args){
			int x = 4;
			long y = x * 4 - x++;
			if(y < 12) System.out.println("za malo");
			else System.out.println("w sam raz");
			
			//Wynik jest "w sam raz", poniewaz inkrementacja zmiennej x wykonuje sie na samym koncu tego dzialania, wiec dopiero po wykonaniu operacji matematycznej, x zwieksza sie o jeden
		}
	}