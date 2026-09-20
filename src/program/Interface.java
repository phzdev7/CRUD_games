package program;

import java.util.ArrayList;
import java.util.Scanner;

import usuario.User;

public class Interface {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<User> jogos = new ArrayList<>();
		
		
		System.out.println("================================================");
		System.out.println("\n                 GAME MANAGER");
		System.out.println("\n================================================");
		
		while(true) {
		System.out.println("                      MENU                        ");
		System.out.println("\n1 - Cadastro de jogo");
		System.out.println("2 - Listar jogo");
		System.out.println("3 - Buscar Jogo");
		System.out.println("4 - Comprar jogo");
		System.out.println("5 - Atualizar estoque");
		System.out.println("6 - Remover Jogo");
		System.out.println("7 - Sair");
		
		System.out.print("\nDigite: ");
		int r = sc.nextInt();
		System.out.println("\n===================================================");

		
		
		 if (r == 1) {
			 System.out.print("Quantos jogos serão cadastrador: ");
			 int n = sc.nextInt();
			 System.out.println("===================================================");
			 sc.nextLine();
			 for (int i = 0; i < n; i++) {
				
				 System.out.print("Jogo: ");
				 String nome = sc.nextLine();
				 System.out.print("Plataforma: ");
				 String plataforma = sc.nextLine();
				 System.out.print("Preço: R$");
				 double preco = sc.nextDouble();
				 sc.nextLine();
				 System.out.println("\n----------------------------------------------------------");
				 
				 jogos.add(new User (nome,plataforma, preco));
			 }
			continue;  //DENTRO DO IF
		 }
		 
		 
		 if (r == 2) {
			 
			 System.out.println("               TABELA DE JOGOS");
			 for(User user : jogos) {
				
				 System.out.println("Jogo: " + user.getNome());
				 System.out.println("Plataforma: " + user.getPlataforma());
				 System.out.println("Preço: R$" + user.getPreco());
				 System.out.println("\n----------------------------------------------------------");

			 }
			continue;
		 }
		 
		 
		 if (r == 3) {
			 
			 int n = 1;
				 for(User user : jogos) {
					 System.out.println(n  + "- "+ user.getNome());
					 n++;	
				 	}
				 
				 System.out.print("Digite o numero do jogo: ");
				 int escolha = sc.nextInt();
				 System.out.println("\n----------------------------------------------------------");

				 User jogoEscolhido = jogos.get(escolha -1);
				 System.out.println("Jogo: " + jogoEscolhido.getNome());
				 System.out.println("Plataforma: " + jogoEscolhido.getPlataforma());
				 System.out.println("Preço: R$" + jogoEscolhido.getPreco());
				 System.out.println("\n================================================");

			 }
		 
		 
		 
		 
		 
		 
		 
			
		}
		
	}

}
