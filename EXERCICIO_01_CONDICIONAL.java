package aula2_CONDICIONAL;

import java.util.Scanner;
import java.util.Locale;

public class EXERCICIO_01_CONDICIONAL {

		public static void main(String[] args)
		{
		Locale.setDefault(Locale.US);
		Scanner entrada= new Scanner(System.in);
		
		int numero1=0, numero2=0, numero3=0;
		
		System.out.println("Entre com o primeiro valor: ");
		numero1= entrada.nextInt();
		
		System.out.println("Entre com o segundo valor: ");
		numero2= entrada.nextInt();
		
		System.out.println("Entre com o terceiro valor: ");
		numero3= entrada.nextInt();
		
		if(numero1> numero2 && numero1>numero3) 
		{
			System.out.println("O maior número é: "+numero1);
		}
		else if(numero2> numero1 && numero2>numero3) 
		{
			System.out.println("O maior valor é: "+numero2);
		}
		else 
		{
			System.out.println("O maior valor é: "+numero3);
		}
		entrada.close();
}
}	
