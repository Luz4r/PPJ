package Zestaw13;

public class Zadanie123 {
	public static void main(String[] args){
		show(5);

		//================================
		System.out.println();

		int wrt = 5;
		modifyValue(wrt);

		//====================================
		System.out.println();

		char[] array = "Ala ma kota".toCharArray();

		countHowManyChars(array);
	}

	static void show(int param){
		System.out.println(param);
	}

	static void modifyValue(int param){
		System.out.println(param);
		param *= 5;
		System.out.println(param);
	}

	static void countHowManyChars(char[] array){
	    int howMany;
	    for(char i = 'A'; i <= 'z'; i++){
	        howMany = 0;
	        for(char j : array){
                if(i == j)
                    howMany++;
            }
            if(howMany > 0)
                System.out.println("Znak: " + i + " wystapil: " + howMany + (howMany == 1? " raz" : " razy"));
            if(i == 'Z')
            	i = 'a' - 1;
        }
    }
}
