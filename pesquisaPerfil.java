package pesquisaPerfil;

import java.util.Scanner;

public class pesquisaPerfil {
	
	public static void main(String args[])
	{
		int i=0, sexo, idade, comportamento;
		int pessoascalmas=0, mulheresnervosas=0,homensagressivos=0,outroscalmos=0,nervosos40mais=0,calmas18menos=0;
		Scanner leia = new Scanner(System.in);
		
		while (i<150)
		{
			System.out.println("\nQual � sua idade: ");
			idade = leia.nextInt();
			while(idade<=0 || idade>=160)
			{
				System.out.println("\nOp��o inv�lida...\nQual � sua idade: ");
				idade = leia.nextInt();
			}
			
			System.out.println("\n1-feminino, 2-masculino e 3-Outros.\nDigite a op��o do seu sexo: ");
			sexo = leia.nextInt();
			while(sexo<1 || sexo>3)
			{
				System.out.println("\nOp��o inv�lida...\n1-feminino, 2-masculino e 3-Outros.\nDigite a op��o do seu sexo: ");
				sexo = leia.nextInt();
			}
			
			System.out.println("\n1-pessoa calma, 2-pessoa nervosa e 3-pessoa agressiva.");
			System.out.println("Digite a op��o que corresponde ao seu comportamento: ");
			comportamento = leia.nextInt();
			while(comportamento<1 || comportamento>3)
			{
				System.out.println("\nOp��o inv�lida...\n1-pessoa calma, 2-pessoa nervosa e 3-pessoa agressiva.");
				System.out.println("Digite a op��o que corresponde ao seu comportamento: ");
				comportamento = leia.nextInt();
			}
		
			if(comportamento==1)
			{
				pessoascalmas++;
			}
			if(sexo==1 && comportamento==2)
			{
				mulheresnervosas++;
			}
			if(sexo==2 && comportamento==3)
			{
				homensagressivos++;
			}
			if(sexo==3 && comportamento==1)
			{
				outroscalmos++;
			}
			if(idade>40 && comportamento==2)
			{
				nervosos40mais++;
			}
			if(idade<18 && comportamento==1)
			{
				calmas18menos++;
			}
			i++;
		}
		
		System.out.printf("\nN�mero de pessoas calmas: %d",pessoascalmas);
		System.out.printf("\nN�mero de mulheres nervosas: %d",mulheresnervosas);
		System.out.printf("\nN�mero de homens agressivos: %d",homensagressivos);
		System.out.printf("\nN�mero de outros calmos", outroscalmos);
		System.out.printf("\nN�mero de pessoas nervosas com mais de 40 anos: %d",nervosos40mais);
		System.out.printf("\nN�mero de pessoas calmas com menos de 18 anos: %d",calmas18menos);
	}

}
