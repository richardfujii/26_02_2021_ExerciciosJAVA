package idadesWhile;

import java.util.*;

public class idadesWhile {
	
	public static void main(String args[])
	{
		int idade,menor21=0,maior50=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		
		while (idade!=-99)
		{
			if (idade>0 && idade<150)
			{
				if (idade<=21)
				{
					menor21++;
				}
				else if (idade>=50)
				{
					maior50++;
				}
				System.out.println("Digite uma idade: ");
				idade = leia.nextInt();
				
			}else if((idade<=0 || idade>=150) && idade!=99)
			{
				System.out.println("Opção inválida...\nDigite uma idade: ");
				idade = leia.nextInt();
			}
		}
		
		System.out.println("O número de pessoas com menos de 21 anos é: "+menor21);
		System.out.println("O número de pessoas com mais de 50 anos é: "+maior50);
	}
}
