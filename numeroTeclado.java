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
			System.out.println("Digite o "+aux+"� n�mero: ");
			num = leia.nextInt();
			if (num!=0)
			{
				vetor[i]=num;
				soma = soma + num;
			}
			i++;
		}while(num!=0 && i<100);
		
		System.out.println("\nA soma dos n�meros digitados � de: "+soma);
		
		if (i>1)
		{
			System.out.println("\nOs n�meros do seu vetor s�o:");
			while(j<i-1)
			{
				System.out.printf(vetor[j]+"|");
				j++;
			}	
		}
	}
	
}
