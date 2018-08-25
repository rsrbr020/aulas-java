/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Rafael Sousa
 */

//Atividade em Java: Caixa Eletronico.

//Importar Scannner
import java.util.Scanner;
public class CaixaEletronico{
	//Classe principal com laco de repeticao e dentro, acoes para o usuario. 
	public static void main(String[] args){
		Scanner acao= new Scanner(System.in);
		CaixaEletronico objeto = new CaixaEletronico();
        double Saldo = 0;
        double Sacar,Depositar;
        boolean Sair=false;
        int opcao = 1;
        //Laco de repeticao do codigo.
        while(opcao != 0) {
        	//Chama menu.
        	objeto.Menu();
        	//Opcao ecolhida pelo usuario.
        	opcao = acao.nextInt();
        	//Acao a partir da ecolha do usuario.
        	//Sacar quantia desejada.
        	if(opcao==1) {
            	System.out.println("Digite o valor que deseja sacar !");
            	Sacar=acao.nextDouble();
            	Saldo=Saldo-Sacar;
            	System.out.println("Seu saldo atual é; "+Saldo);
        	}
        	//Depositar quantia desejada.
        	if(opcao==2) {
            	System.out.println("Digite o valor que deseja depositar depositar !");
            	Depositar=acao.nextDouble();
            	Saldo=Saldo+Depositar;
            	System.out.println("Seu saldo atual é; "+Saldo);
        	}
        	//Ver saldo.
        	if(opcao==3) {
            	System.out.println("Seu saldo atual é; "+Saldo);
        	}
        	//Saida do usuario.
        	if(opcao==4) {
            	System.out.println("Deseja realmente sair ?");
            	System.out.println("Digite S para sim ou N para nao.");
            	String Decisao=acao.next();
            	if("S".equals(Decisao)) {
            		Sair=true;
            		break;
            	}	
        	}
        }
        
        	
        
	}

	public void Menu() {
		// Menu do CaixaEletronico.
		System.out.println("Caixa eletronico.");
		System.out.println("Digite!");
		System.out.println("1- Para sacar.");
		System.out.println("2- Para depositar.");
		System.out.println("3- Para ver saldo.");
		System.out.println("4- Para sair.");

	}
	
}