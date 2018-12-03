public
	class Zadanie5{
		public static void main(String[] args){
			int[] array = new int[10];
			
			for(int i = 0; i < array.length; i++)
				array[i] = (int)(Math.random()*6);
			
			int howManyOdds = 0, howManyEvens = 0;
			
			for(int i :array){
				if(array[i]%2 == 0)
					howManyEvens++;
				else 
					howManyOdds++;
			}
			
			int[] evensArray = new int[howManyEvens];
			int[] oddsArray = new int[howManyOdds];
			
			for(int i = 0, j = 0; i < array.length; i++){
				if(array[i] % 2 == 0){
					evensArray[j] = array[i];
					j++;
				}
			}
			
			for(int i = 0, j = 0; i < array.length; i++){
				if(array[i] % 2 != 0){
					oddsArray[j] = array[i];
					j++;
				}
			}
			
			for(int i:array)
				System.out.print(i + " ");
			
			System.out.println();
			
			for(int i:evensArray)
				System.out.print(i + " ");
			
			System.out.println();
			
			for(int i:oddsArray)
				System.out.print(i + " ");
			
			
			
			
			
			
		}
	}