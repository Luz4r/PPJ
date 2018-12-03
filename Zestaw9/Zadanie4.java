public
	class Zadanie4{
		public static void main(String[] args){
			char[] array = new char[15];
			
			array[array.length / 2] = 'a';
			
			
			for(int i = (array.length/2) + 1, j = 1; i < array.length; i++, j++)
				array[i] = (char)('a' + j);
			
			for(int i = (array.length/2) - 1, j = 1; i >= 0; i--, j++)
				array[i] = (char)('a' + j);
			
			for(char i : array)
				System.out.print(i);
			
		}
	}