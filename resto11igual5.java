package resto11igual5;

public class resto11igual5 {

	public static void main(String[] args) {
		
		int x,i=0,j=0;
		int []vetor = new int[100];
		for (x=1000;x<=1999;x++)
		{
			if (x%11==5)
			{
				System.out.println(x);
				vetor[i]=x;
				i++;
			}
			
		}
		System.out.println("\nImpressão do vetor: ");
		while(j<i)
		{
			System.out.printf(vetor[j]+" ");
			j++;
		}

	}

}
