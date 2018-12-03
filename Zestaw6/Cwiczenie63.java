public
	class Cwiczenie63{
		public static void main(String[] args){
			boolean x = true, z = true;
			int y = 20;
			x = (y != 10) ^ (z = false); // true ^ false = true
			System.out.println(x + ", " + y + ", " + z);
		}
	}