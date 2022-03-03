package aula2_CONDICIONAL;

import java.util.Scanner;
import java.util.Locale;

public class EXERCICIO_02_CONDICIONAL_PROFESSOR {

		public static void main(String[] args)
		{//programa que coloca os três números em ordem crescente
		Locale.setDefault(Locale.US);
		Scanner ler= new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Entre com três valorores: ");
		numero1= ler.nextInt();
		numero2= ler.nextInt();
		numero3= ler.nextInt();
		
		//Existem 6 possíveis ordens para impressão
		
		if(numero1<=numero2 && numero2<=numero3) 
		{
			System.out.println("1-A ordem crescente é: "+numero1+" "+numero2+" "+numero3);
		}
		else if (numero1<=numero3 && numero3<=numero2) 
		{
			System.out.println("2-A ordem crescente é: "+numero1+" "+numero3+" "+numero2);
		}
		else if (numero2<=numero1 && numero1<=numero3) 
		{
			System.out.println("3-A ordem crescente é: "+numero2+" "+numero1+" "+numero3);
		}
		else if (numero2<=numero3 && numero3<=numero1) 
		{
			System.out.println("4-A ordem crescente é: "+numero2+" "+numero3+" "+numero1);
		}
		
		else if (numero3<=numero1 && numero1<=numero2) 
		{
			System.out.println("5-A ordem crescente é: "+numero3+" "+numero1+" "+numero2);
		}
		else 
		{
			System.out.println("6-A ordem crescente é: "+numero3+" "+numero2+" "+numero1);
		}	
		ler.close();
		System.out.println("Fim do programa");
}
}	
