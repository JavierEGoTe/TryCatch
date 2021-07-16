
public class Principal {
	
	static int numerador = 10;
	static Integer denominador = 2;
	static float division;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Anted de la division");
		try {
			division = numerador / denominador;
		} catch (ArithmeticException error){
			division =0;
			System.out.println("Error: "+ error.getMessage());
		} catch (NullPointerException ex) {
			division  = 0;
			System.out.println("Erro: "+ ex.getMessage());
			System.out.println("Segundo catch");
		}finally {
			System.out.println("Despues de la división");
		}
		String frutas[]= {"Mango","Pera","Manzana","Uva"};
		
		for(String fruta: frutas){
			System.out.println(fruta);
		}
		 
	}

}
