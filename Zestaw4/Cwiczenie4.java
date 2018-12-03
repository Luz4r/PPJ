public
	class Cwiczenie4{
		public static void main(String[] args){
			int binary = 0b1111;
			int hexal = 01001;
			int octal = 0xA23;
			
			System.out.println(binary);
			System.out.println(hexal);
			System.out.println(octal);
			
			System.out.println("-----------------------");
			
			char minChar = Character.MIN_VALUE;
			char maxChar = Character.MAX_VALUE;
			boolean minBool = false;
			boolean maxBool = true;
			byte minByte = -128;
			byte maxByte = 127;
			short minShort = -32768;
			short maxShort = 32767;
			int minInt = Integer.MIN_VALUE;
			int maxInt = Integer.MAX_VALUE;
			long minLong = Long.MIN_VALUE;
			long maxLong = Long.MAX_VALUE;
			float minFloat = -Float.MAX_VALUE;
			float maxFloat = Float.MAX_VALUE;
			double minDouble = -Double.MAX_VALUE;
			double maxDouble = Double.MAX_VALUE;
			
			System.out.println(minChar);
			System.out.println(maxChar);
			System.out.println(minBool);
			System.out.println(maxBool);
			System.out.println(minByte);
			System.out.println(maxByte);
			System.out.println(minShort);
			System.out.println(maxShort);
			System.out.println(minInt);
			System.out.println(maxInt);
			System.out.println(minLong);
			System.out.println(maxLong);
			System.out.println(minFloat);
			System.out.println(maxFloat);
			System.out.println(minDouble);
			System.out.println(maxDouble);
		}
	}