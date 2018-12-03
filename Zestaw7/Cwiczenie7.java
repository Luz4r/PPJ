public
	class Cwiczenie7{
		public static void main(String[] args){
			
			//Zadanie 1
			int wrt = 3;
			
			System.out.println((wrt > 5)? "int z przedzialu <6, 10>" : "int z przedzialu <0, 5>");
			
			
			System.out.println("\n=====\n");
			
			
			//Zadanie 2
			char chr = 'H';
			System.out.println((chr < 'G')? "znak A - G" : "znak H - Z");
			
			
			System.out.println("\n=====\n");
			
			
			//Zadanie 3
			int x = 43707, even = 0, odd = 0, temp = 0;
			
			for(int i = 0; i < 32; i += 2){
				even += (x & (0b1 << i));
			}
			
			
			for(int i = 1; i < 32; i+=2){
				odd += (x & (0b1 << i));
			}
			System.out.println("Nieparzysta: " + odd);
			System.out.println("Parzysta: " + even);
			
			
			System.out.println("\n=====\n");
			
			
			//Zadanie 4
			byte val = 0;
			char charVal;
			
			
			switch(val % 16){
				case 10:
					charVal = 'A';
					break;
				case 11:
					charVal = 'B';
					break;
				case 12:
					charVal = 'C';
					break;
				case 13:
					charVal = 'D';
					break;
				case 14:
					charVal = 'E';
					break;
				case 15:
					charVal = 'F';
					break;
				default:
					charVal = (char)((val % 16) + '0');
			}
			
			System.out.println(charVal);
			
			
			System.out.println("\n=====\n");
			
			
			//Zadanie 5
			for(int i = -50; i <= 50; i++){
				if((i % 2 == 0) && (i % 8 == 0)){
					System.out.println(i);
				}
			}
			
			
			System.out.println("\n=====\n");
			
			
			//Zadanie 6
			int s = 0;
			int j = 1;
			while(j <= 10){
				s = s + j;
				j++;
			}
		}	
	}