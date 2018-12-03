public
	class Cwiczenie64{
		public static void main(String[] args){
			int dzien = 19, miesiac = 10;
			int sumaDni = 0;
			
			int[] miesiace = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // ilosc dni w miesiacu
			
			for(int i = 0; i < (miesiac - 1); i++){
				sumaDni += miesiace[i];
			}
			sumaDni += dzien;
			System.out.println("Od poczatku roku minelo: "+ sumaDni + " dni");
		}
	}