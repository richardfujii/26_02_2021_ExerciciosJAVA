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
			System.out.println("Digite o "+aux+"º número: ");
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
			System.out.println("Não há múltiplos de 3 dentre os números digitados.\nNão existe divisão por zero.");
		}else
		{
			media=soma/cont3;
			System.out.println("A média dos múltiplos de 3 digitados é: "+media);
			
			while(j<cont3)
			{
				System.out.printf(vetor[j]+"|");
				j++;
			}
		}
		
	}

}
