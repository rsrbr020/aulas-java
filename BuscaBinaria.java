import java.util.Random;
import java.util.Scanner;
  public class buscabinaria {
	public static void main(String[] args) {
	 Random aleatorio = new Random();
	 Scanner tcl = new Scanner(System.in);
	 int vetor[]= new int [100];
	 for(int i = 0; i < vetor.length; i++) {
	    vetor[i] = numeros.nextInt(1000); 
  }
   System.out.println("Vetor nao ordenado");
	for(int i=0; i < vetor.length; i++){
  	  System.out.print(vetor[i]+"");
  }

	int aux = 0;
	for(int i = 0; i < vetor.length; i++){
  	 for(int j = 0;j < vetor.length; i++){
   	  if(vetor[i] < vetor[j]){
   	   aux = vetor[i];
	   vetor[i] = vetor[j];   
	   vetor[j] = aux;	   


   }
  }
 }
  System.out.println("");
  System.out.printiln("Vetor Ordenado");
	for(int i = 0;i < vetor.length; i++){
	 System.out.print(vetor[i]+"");
  }
 } 
}