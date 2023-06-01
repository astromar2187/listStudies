package atividadeParticip02;

import java.util.Scanner;

public class AppLista {
	public static void main(String[] args) {
		int op = -1;
		Scanner sc = new Scanner(System.in);
		String menu = "***Menu***\n1.Inserir nome no início da lista\n2.Inserir nome no final da lista\n3.Excluir nome da lista\n4.Mostrar todos os nomes da lista, incluindo a quantidade de nomes\n5.Mostrar os nomes da lista em ordem inversa\n0.Sair da aplicação\nPor favor, escolha uma opção: ";
		Lista lista = new Lista();
		
		while(op!=0) {
			System.out.print(menu);
			op = Integer.parseInt(sc.nextLine());
			
			switch(op) {
			case 1: 
				 System.out.println("Digite o nome a ser inserido no início: ");
                 String nomeInicio = sc.nextLine();
                 lista.inserirInicio(nomeInicio); 
				break;
			case 2:
				System.out.println("Digite o nome a ser inserido no final: ");
                String nomeFinal = sc.nextLine();
                lista.inserirFinal(nomeFinal);
				break;
			case 3:
				 System.out.println("Digite o nome a ser removido: ");
                 String nomeRemover = sc.nextLine();
                 lista.excluiNome(nomeRemover);
				break;
			case 4:
				System.out.println("*Lista: "+lista.mostrarLista()+"*");
				System.out.println("*Tamanho da Lista: "+lista.getQuantidade()+" elementos");
				break;
			case 5:
				System.out.println("*Lista invertida: "+lista.mostrarListaInvertida()+"*");
				System.out.println("*Tamanho da Lista: "+lista.getQuantidade()+" elementos");
				break;
			default:
				if(op!=0) {
					System.out.println("Insira uma opção válida!");
				}
			}
		}
		System.out.println("\n****Fim da aplicação****");
		sc.close();
	}
}
