public
	class Zadanie1{
		public static void main(String[] args){
			int[] array = new int[20];
			
			for(int i = 0; i < array.length; i++){
				array[i] = (int)(Math.random() * 255);
			}
			
			for(int i = 0; i < array.length; i++){
				if(array[i] % 2 == 0){
					System.out.print(i + " ");
				}
			}
		}
	}