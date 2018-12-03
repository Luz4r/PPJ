public
	class Zadanie6{
		public static void main(String[] args){
			int[] array = new int[100];
			
			int avarage = 0, howManyHigher = 0, howManyLower = 0;
			
			for(int i = 0; i < array.length; i++)
				array[i] = (int)(Math.random()*255);
			
			for(int i:array)
				avarage += i;
			
			avarage /= array.length;
			
			for(int i:array){
				if(i >= avarage){
					howManyHigher++;
				}else
					howManyLower++;
			}
			
			int[] higherThanAvarage = new int[howManyHigher];
			int[] lowerThanAvarage = new int[howManyLower];
			
			for(int i = 0, j = 0; i < array.length; i++){
				if(array[i] >= avarage){
					higherThanAvarage[j] = array[i];
					j++;
				}
			}
			
			for(int i = 0, j = 0; i < array.length; i++){
				if(array[i] < avarage){
					lowerThanAvarage[j] = array[i];
					j++;
				}
			}
			
			System.out.println(avarage + "\n");
			for(int i:higherThanAvarage)
				System.out.print(i + " ");
			
			System.out.println("\n");
			
			for(int i:lowerThanAvarage)
				System.out.print(i + " ");
		}
	}