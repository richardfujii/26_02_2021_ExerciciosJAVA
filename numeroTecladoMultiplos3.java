package numeroTecladoMultiplos3;

import java.util.*;

public class numeroTecladoMultiplos3 {

	public static void main(String[] args) {
		
		int num,aux=0,i=0,j=0,cont3=0;
		double media,soma=0.0;
		int []vetor = new int[100];
		Scanner leia = new Scanner(System.in);
		
		do
		{	
			aux = i + 1;
			System.out.println("Digite o "+aux+"� n�mero: ");
			num = leia.nextInt();
			if (num%3==0 && num!=0)
			{
				soma = soma + num;
				vetor[cont3]=num;
				cont3++;
			}
			i++;
			
		}while(num!=0 && i<100);
		
		if (cont3==0)
		{
			System.out.println("N�o h� m�ltiplos de 3 dentre os n�meros digitados.\nN�o existe divis�o por zero.");
		}else
		{
			media=soma/cont3;
			System.out.println("A m�dia dos m�ltiplos de 3 digitados �: "+media);
			
			while(j<cont3)
			{
				System.out.printf(vetor[j]+"|");
				j++;
			}
		}
		
	}

}
