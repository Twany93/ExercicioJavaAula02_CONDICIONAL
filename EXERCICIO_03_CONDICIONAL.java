package aula2_CONDICIONAL;

import java.util.Scanner;

public class EXERCICIO_03_CONDICIONAL {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		int idade;
		System.out.println("Bem vindo ao clube\nInforme sua idade: ");
		idade= entrada.nextInt();
		
		if(idade>=10 && idade<=14) 
		{
			System.out.println("Faixa etária:infantil\nUso de piscina somente com autorização do responsável");
		}
		else if (idade>=15 && idade <=17)
		{
			System.out.println("Faixa etária:juvenil\nAcesso às piscinas autorizado");
		}
		else if (idade>=18 && idade <=25)
		{
			System.out.println("Faixa etária:Adulto\nAcesso às piscinas autorizado\nNão consuma álcool perto das piscina,somente na nossa praça de alimentação ");
		}
		else if(idade<0) 
		{
			System.out.println("Erro!!!Não existe idade negativa");
		}
		else if(idade<10 && idade>0) 
		{
			System.out.println("Faixa etária: sub infantil\nEntrada somente com um adulto de acompanhante");
		}
		else if(idade>25) 
		{
			System.out.println("Faixa etária: Adulto-cliente sênior");
		}
		entrada.close();
	}

}
