public
	class Program3{
		public static void main(String[] args){
			int x = 72;
			System.out.println(x);
			
			int a605 = 386;
			//int 6b = 567;
			//int @asd = 123;
			//int public = 900;
			//int null = 800;
			
			char charValue = 'a';
			char charvalue = 'b';
			/* Program skompiluje się, ponieważ te dwie zmienne maja inne nazwy pomimo różnej wielkości liter*/
			
			boolean value = true;
			int intiger = 1;
			double realNumber = 2.5;
			char y = 'A';
			
			value = intiger == realNumber;
			System.out.println(value);
			value = intiger == a;
			System.out.println(value);
			value = realNumber == a;
			System.out.println(value);
			
			int a = 5;
			double b = 10;
			
			//a = b;
			b = a;
		}
	}