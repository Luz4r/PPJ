public
	class Cwiczenie42{
		public static void main(String[] args){
			char varChar = 'a';
			int varInt = 10;
			float varFloat = 3.14F;
			double varDouble = 2.41;
			byte varByte = 50;
			
			varChar += varInt;
			System.out.println(varChar);
			varInt += varChar;
			System.out.println(varInt);
			varFloat += varDouble;
			System.out.println(varFloat);
			varByte += varInt;
			System.out.println(varByte);
			
			int x = 2 * (((5 + 3) * 4) - 8); 
			System.out.println("----------------------------------");
			System.out.println(x);
		}
	}