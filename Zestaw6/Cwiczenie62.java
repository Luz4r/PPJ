public
	class Cwiczenie62{
		public static void main(String[] args){
			int ARGB = 370208;
			System.out.println("G: " + (ARGB >> 8 & 0b11111111));
		}
	}