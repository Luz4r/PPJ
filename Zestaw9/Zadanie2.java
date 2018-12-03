public
	class Zadanie2{
		public static void main(String[] args){
			char[] array = new char[10];
			
			int range = ('Z' - 'A') + 1;
			
			for(int i = 0; i < array.length; i++)
				array[i] = (char)((Math.random()*range)+'A');
			
			char[] nextArray = new char[array.length];
			
			for(int i = (array.length - 1), j = 0; i >= 0; i--, j++){
				nextArray[j] = array[i];
			}
			
			for(char i : array)
				System.out.print(i + " ");
			
			System.out.println();
			
			for(char i : nextArray)
				System.out.print(i + " ");
		}
	}