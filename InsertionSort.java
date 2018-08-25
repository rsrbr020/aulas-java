public class InsertionSort{
public static void mian(String[] args){
	int[] vetor = {9, 0, 8, 7, 6, 5, 4, 2, 1};
	System.out.printiln("Vetor nao ordenado");
	for(int i = 0;i < vetor.length; i++){
	 System.out.println(Vetor[i]);
 }

	System.out.printiln("Chamando insertionSort<===");
	insertionSort(Vetor);
	System.out.println("Vetor Ordendo");
	for(int j = 0;j < vetor.length; i++){
	 System.out.println("vetor[j]");
  }
 }
}

public void insertionSort(int[] vetor){
		
		for (int i = 1; i < vetor.length; i++){
			
			int aux = vetor[i];
			int j = i;
			
			while ((j > 0) && (vetor[j-1] > aux)){
				vetor[j] = vetor[j-1];
				j -= 1;
			}
			vetor[j] = aux;
                
		}
	
	}