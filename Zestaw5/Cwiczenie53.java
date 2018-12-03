public
	class Cwiczenie53{
		public static void main(String[] args){
			java.util.Scanner in = new java.util.Scanner(System.in);
			int wrt = in.nextInt();
			
			if(wrt <= -15){
				System.out.println("Wartosc nalezy tylko do zbioru: B");
			}else if(wrt >= -13){
				System.out.println("Wartosc nalezy tylko do zbioru: A");
			}else{
				System.out.println("Wartosc nie nalezy do zadnego lub nalezy do wiecej niz jednego zbioru");
			}
		}
	}