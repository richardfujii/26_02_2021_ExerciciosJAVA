package numeroTeclado;

import java.util.*;

public class numeroTeclado {
	
	public static void main(String args[])
	{
		int i=0,j=0,aux=0,num,soma=0;
		int []vetor = new int[100];
		Scanner leia = new Scanner(System.in);
		do
		{
			aux = 1 + i;
			System.out.println("Digite o "+aux+"º número: ");
			num = leia.nextInt();
			if (num!=0)
			{
				vetor[i]=num;
				soma = soma + num;
			}
			i++;
		}while(num!=0 && i<100);
		
		System.out.println("\nA soma dos números digitados é de: "+soma);
		
		if (i>1)
		{
			System.out.println("\nOs números do seu vetor são:");
			while(j<i-1)
			{
				System.out.printf(vetor[j]+"|");
				j++;
			}	
		}
	}
	
}
