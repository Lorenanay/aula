public class Minhacalculadora {

	final static int ERROR_MAX_REQUEST_LIMIT = -1;
	final static int WARNING_MAX_REQUEST_LIMIT = -2;
	final static int MAX_REQUEST = 1000;
	final static float MESSAGE_PERCENTAGE_WARINNG = 0.75f; //percente
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroRequest = 999;
				
		int soma = somaResquest(numeroRequest,1);
		int xx = somaResquest(numeroRequest,3);
		 
		String auxMessage = messageControl(soma);
		System.out.println(auxMessage);
		 
		
		String auxMessage2 = messageControl(xx);
		System.out.println(auxMessage2);
		
		//Criar funções soma, multiplicação, bla bla e uma função para mostrar resultado
		
	}
	
	static int somaResquest (int numero1, int numero2) {
		int x = numero1 + numero2;
		if(x > MAX_REQUEST) {
			return ERROR_MAX_REQUEST_LIMIT;
		} 
		return x;
	}
	
	static String messageControl(int requestCount) {
		
		if(requestCount > MAX_REQUEST * MESSAGE_PERCENTAGE_WARINNG) {
			return "Sua quantidade de request ultrapassou 75%, cuidado com seu limite. "
					+ "Quantidade atual de request realizadas " + requestCount;
		}
		
		if(requestCount == ERROR_MAX_REQUEST_LIMIT) {
			return "Que bom, seu limite de request foi atigindo. Necessário adquirir mais requests. "
					+ "Quantidade atual utilizada: " + MAX_REQUEST;
		}
		return " Quantidade atual de requests realizadas " + requestCount;
		
		
		static double soma {
			
		}
		double numero1= 2;
		double numero2= 3;
		
		double auxSoma= numero1 + numero2;
	
		
	    class result {
		
		System.out.println(auxSoma);
			
		}
		
	
	}

}
