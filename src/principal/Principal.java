package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Sorvete;
import entidade.Sorveteiro;

public class Principal {
	public static void main(String[] args) {
		// Variaveis
		int i = 0;
		String sabor, calda, numero, casca;
		// Scanner
		Scanner ler = new Scanner(System.in);
		Sorveteiro sorveteiro = new Sorveteiro();
		// Lista
		List<Sorvete> sorvete = new ArrayList<>();
		System.out.println("-----------------------------------");
		System.out.println("Gerenciamento de Sorvetes");
		System.out.println("-----------------------------------");
		System.out.println("Por favor, digite seu nome: ");
		sorveteiro.setNome(ler.nextLine());
		System.out.println("-----------------------------------");
		System.out.println("Seja bem-vindo, "+ sorveteiro.getNome());
		System.out.println("-----------------------------------");
		// While para fazer o loop do menu.
		while (true) {

			System.out.println("Escolha alguma das opções a baixo." + "\n1: Adicionar Sorvete" + "\n2: Remover Sorvete"
					+ "\n3: Ver os Sorvete" + "\n0: Sair");
			System.out.println("-----------------------------------");
			System.out.println("Digite o numero da opção: ");
			System.out.println("-----------------------------------");
			// Try / Catch para poder fazer o isolamento de futuros erros do usuario.
			try {
				// Aqui faz a conversão do tipo String para o tipo int
				numero = ler.nextLine();

				i = Integer.parseInt(numero);
				if (i == 0) {
					System.out.println("Sessão encerrada.");
					break;
				}
				// O isolamento do erro.
			} catch (NumberFormatException e) {
				System.out.println("-----------------------------------");
				System.out.println("Número inválido!");
				System.out.println("-----------------------------------");

			}
			// Switch para seleção dos menus
			switch (i) {
			// Adição dos sorvetes a lista
			case 1:
				System.out.println("Digite o Sabor: ");
				sabor = (ler.nextLine());
				System.out.println("Digite a Calda: ");
				calda = (ler.nextLine());
				System.out.println("Casquinha ou Tijela?: ");
				casca = (ler.nextLine());
				sorvete.add(new Sorvete(sabor, calda, casca));
				System.out.print("Sorvete adicionado\n");

				break;
			// Remoção dos sorvete da lista
			case 2:
				System.out.println("Digite o nome do sorvete: ");
				String nome = ler.nextLine();
				for (i = 0; i < sorvete.size(); i++) {
					Sorvete s = sorvete.get(i);

					if (s.getSabor().equals(nome)) {

						sorvete.remove(s);

						System.out.println("Sorvete removido com sucessso.");

					}

				}

				break;
			// Visualização dos sorvetes.
			case 3:
				for (i = 0; i < sorvete.size(); i++) {
					System.out.print("Sabor: " + sorvete.get(i).getSabor() + "| " + "Calda: " + sorvete.get(i).getCalda()
							+ "| " + "Recipiente: " + sorvete.get(i).getCasca() + "\n");
				}
				break;

			default:

				System.err.println("A operação não foi concluida.");
				break;

			}
			System.out.println("---------------");
			System.out.println("Voltar ao menu: \n 0: Menu");
			numero = ler.nextLine();

		}
	}

}
