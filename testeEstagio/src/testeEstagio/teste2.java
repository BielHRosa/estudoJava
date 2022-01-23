package testeEstagio;

import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		   
		 Scanner sc = new Scanner (System.in);
		
		 double semitons = sc.nextInt();
		 double potencia = semitons/12;
	     double resultado = Math.pow (2, potencia);
	     double resultadoFinal = 440*resultado;
	     String notaString = Double.toString(resultadoFinal);
	     System.out.println(notaString);
		 sc.close();   
		    }
}
