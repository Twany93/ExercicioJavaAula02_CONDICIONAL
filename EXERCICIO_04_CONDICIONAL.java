package aula2_CONDICIONAL;

import java.util.Locale;
import java.util.Scanner;

public class EXERCICIO_04_CONDICIONAL {

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner ler= new Scanner(System.in);
		
		int numero,numeropar;
		double resultado;
		System.out.println("Entre com o número: ");
		numero= ler.nextInt();
		
		numeropar= numero%2;
		
		if(numeropar==0)
		{
			if(numero>0) 
			{
				resultado= Math.sqrt(numero); 
				System.out.println("Raiz quadrada de "+numero+" é: "+resultado);
			}
			else if(numero<0)
			{
				System.out.println("ERRO!Não calculamos raiz quadrada com número negativo");
			}
			else if(numero==0)
			{
				System.out.println("ERRO!Número zero é netro");
			}
			
		}
		else if(numeropar!=0)
		{
			resultado= numero*numero;
			System.out.println("O quadrado de "+numero+" é: "+resultado);
		}


}
}