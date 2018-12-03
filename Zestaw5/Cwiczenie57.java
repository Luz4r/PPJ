public
	class Cwiczenie57{
		public static void main(String[] args){
			boolean czyPada = true;
			boolean czySwieciSlonce = false;
			
			if(czyPada){
				if(czySwieciSlonce){
					System.out.println("Tecza");
				}else{
					System.out.println("Plucha");
				}
			}else{
				if(czySwieciSlonce){
					System.out.println("Slonecznie");
				}else{
					System.out.println("Pochmurno");
				}
			}
		}
	}