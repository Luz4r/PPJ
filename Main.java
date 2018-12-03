public
	class Main{
		public static void main(String[] args){
			int x = 43707, even = 0, odd = 0;
			
			for(int i = 0, j = 0; i < 32; i += 2, j++)
				even += (x & (0b1 << i)) >> (i - j);
			
			for(int i = 1, j = 0; i < 32; i += 2, j++)
				odd += (x & (0b1 << i)) >> (i - j);
			System.out.println("Liczby parzyste: " + even);
			System.out.println("Liczby nieparzyste: " + odd);
			
		}
	}