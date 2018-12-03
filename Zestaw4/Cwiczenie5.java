public
	class Cwiczenie5{
		public static void main(String[] args){
			boolean czyPada = true;
			
			if(czyPada){
				System.out.println("Na dworze pada deszcz");
			}else{
				System.out.println("Na dworze nie pada deszcz");
			}
			
			
			//==================================
			
			java.util.Scanner in = new java.util.Scanner(System.in);
			int wrt = in.nextInt();
			
			if((wrt > -15 && wrt <= -13) || (wrt > -5 && wrt < -4)){
				System.out.println("Wartosc nalezy do zbiorow: A i B");
			}else if((wrt > -3 && wrt < 0) || (wrt > 5 && wrt < 10)){
				System.out.println("Wartosc nalezy do zbiorow: A i C");
			}else if(wrt >= -4 && wrt <= -3){
				System.out.println("Wartosc nalezy do zbiorow: A, B i C");
			}else{
				System.out.println("Wartosc nie nalezy do zadnej czesci wspolnej zbiorow.");
			}
			
			
		}
	}