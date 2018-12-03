public
	class Cwiczenie61{
		public static void main(String[] args){
			java.util.Scanner in = new java.util.Scanner(System.in);
			System.out.print("Wpisz liczbe: ");
			byte wrt = in.nextByte();
			
			for(int i = 7; i >= 0; i--){
				System.out.println( wrt & (0b1 << i));
			}
		}
	}