public
	class Cwiczenie8{
		public static void main(String[] args){
			//Zadanie 1
			float[] floatArr = new float[5];
			
			//Zadanie 2
			int[] intArr = new int[10];
			System.out.println(intArr.length);
			
			System.out.println("\n==========\n");
			
			//Zadanie 3
			int[] array = new int[10];
			
			for(int i = 0; i < array.length; i++){
				array[i] = (int)(Math.random() * 2);
			}
			
			//Zadanie 4
			int howManyOnes = 0, howManyZeroes = 0;
			
			for(int i = 0; i < array.length; i++){
				if(array[i] == 0)
					howManyZeroes++;
				else howManyOnes++;
			}
			System.out.println("W tablicy array jest " + howManyOnes + " jedynek i " + howManyZeroes + " zer");
			
			System.out.println("\n==========\n");
			
			//Zadanie 5
			double[] doubleArray = new double[10];
			for(int i = 0; i < doubleArray.length; i++){
				doubleArray[i] = Math.random() * 255;
				System.out.println(doubleArray[i]);
			}
			
			System.out.println("\nLiczby o parzystym indeksie:");
			for(int i = 2; i < doubleArray.length; i += 2){
				System.out.println(doubleArray[i]);
			}
			
			System.out.println("");
			for(int i = 0; i < doubleArray.length; i++){
				if((int)doubleArray[i] % 2 != 0)
					System.out.println(doubleArray[i]);
			}
			
			System.out.println("\n==========\n");
			
			//Zadanie 6
			char[] charArray = new char[]{'G', 'T', 'A'};
			
			int whichIndex = 0;
			char temp = charArray[0];
			
			for(int i = 0; i < charArray.length; i++){
				if(temp > charArray[i]){
					temp = charArray[i];
					whichIndex = i;
				}
			}
			System.out.println("Indeks elementu najmniejszego to: " + whichIndex);
			
			System.out.println("\n==========\n");
			
			//Zadanie 7
			int tab[] = new int[]{789, 678, 567};
			
			for(int i = 0; i < tab.length; i++)
				for(int j = i; j < tab.length; j++)
					System.out.println(tab[i] - tab[j]);
				
			/*
				0
				111
				222
				0
				111
				0
			*/
			
			System.out.println("\n==========\n");
			
			//Zadanie 8
			byte[] firstByteArray = new byte[]{0, 1, 2};
			byte[] secondByteArray = new byte[]{0, 1, 2};
			
			boolean areTheSame = false;
			
			for(int i = 0; i < firstByteArray.length; i++)
				areTheSame = (firstByteArray[i] == secondByteArray[i])? true:false;
			System.out.println(areTheSame);
			
			System.out.println("\n==========\n");
			
			//Zadanie 9
			
			java.util.Scanner in = new java.util.Scanner(System.in);
			char[] randomChar = new char[5];
			
			int range = ('Z' - 'A') + 1;
			
			for(int i = 0; i < randomChar.length; i++)
				randomChar[i] = (char)((Math.random() * range) + 'A');
			
			int howMany, howManyZeroesInArray = 0;;
			
			while(howManyZeroesInArray < randomChar.length){
				char c = in.next().charAt(0);
				howMany = 0;
				for(int i = 0; i < randomChar.length; i++){
					if(c == randomChar[i]){
						howMany++;
						howManyZeroesInArray++;
						randomChar[i] = 0;
					}
				}
				System.out.println("Podany znak wystapil w tablicy " + howMany + ((howMany == 1)? " raz":" razy"));
			}

			System.out.println("\n==========\n");
			
			//Zadanie 10
			if(args.length > 1)
				for(int i = 0; i < args.length; i++)
					System.out.println(args[i]);
			
			System.out.println("\n");
			for(int i = 0; i < floatArr.length; i++)
				System.out.println(floatArr[i]);
			
			System.out.println("\n");
			for(int i = 0; i < intArr.length; i++)
				System.out.println(intArr[i]);
			
			System.out.println("\n");
			for(int i = 0; i < array.length; i++)
				System.out.println(array[i]);
			
			System.out.println("\n");
			for(int i = 0; i < doubleArray.length; i++)
				System.out.println(doubleArray[i]);
			
			System.out.println("\n");
			for(int i = 0; i < charArray.length; i++)
				System.out.println(charArray[i]);
			
			System.out.println("\n");
			for(int i = 0; i < tab.length; i++)
				System.out.println(tab[i]);
			
			System.out.println("\n");
			for(int i = 0; i < firstByteArray.length; i++)
				System.out.println(firstByteArray[i]);
			
			System.out.println("\n");
			for(int i = 0; i < secondByteArray.length; i++)
				System.out.println(secondByteArray[i]);
			
			System.out.println("\n");
			for(int i = 0; i < randomChar.length; i++)
				System.out.println(randomChar[i]);
		}
	}