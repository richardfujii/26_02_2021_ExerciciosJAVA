package paridadeFor;

import java.util.Scanner;

public class paridadeFor {
	
	public static void main(String args[])
	{
		int num,i;
		
		Scanner leia = new Scanner(System.in);
		
		for(i=1;i<=10;i++)
		{
			System.out.println("Digite um n�mero: ");
			num= leia.nextInt();
			
			if(num%2==0)
			{
				System.out.printf("O n�mero %d � par. ",num);
			}
			else
			{
				System.out.printf("O n�mero %d � �mpar. ",num);
			}
		}
	}

}
