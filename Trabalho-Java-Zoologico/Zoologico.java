package com.mago.zoologico;

import com.mago.zoologico.Animais.*;
import com.mago.zoologico.Funcionarios.FuncionariosManager;

import java.io.IOException;
import java.util.Scanner;

public class Zoologico {
	public static int userInput(Scanner prompt) {
		int a = 0;
		while (true) {
			try {
				a = Integer.parseInt(prompt.nextLine());
				break;

			} catch (NumberFormatException e) {
				System.out.println("Informe uma opção válida");
			}
		}

		return a;
	}

	public static void main(String[] args) throws FileReadError, FileWriteError {

		int a = 0;

		while (a != 5) {
			Scanner prompt = new Scanner(System.in);

			System.out.println("Bem vindo ao zoologico o que voce deseja fazer?");

			System.out.println("1 - Visualizar funcionarios cadastrados");
			System.out.println("2 - Cadastrar funcionario");
			System.out.println("3 - Iniciar uma visita");
			System.out.println("4 - Animais");
			System.out.println("5 - Sair");

			a = userInput(prompt);

			switch (a) {
				case 1:
					FuncionariosManager loader = new FuncionariosManager();

					try {
						loader.loadNamesFromFile("funcionarios.txt");
					} catch (FileReadError e) {
						throw new FileReadError();
					}
					System.out.print("\nAperte enter para continuar...");
					prompt.nextLine();
					break;
				case 2:
					System.out.print("Nome do funcionário: ");
					String nome = prompt.nextLine();
					FuncionariosManager funcionariosManager = new FuncionariosManager();
					funcionariosManager.cadastrarFuncionario(nome);
					break;
				case 3:
					Visita visita = new Visita();
					int na = 0;

					while (na != 3) {
						System.out.println("Começando nova visita");
						System.out.println("O que deseja fazer?");
						System.out.println("1 - Adicionar visitante");
						System.out.println("2 - Visualizar visitantes");
						System.out.println("3 - Voltar");

						na = userInput(prompt);

						switch (na) {
							case 1:
								System.out.print("Nome do visitante: ");
								String visitanteNome = prompt.nextLine();
								System.out.print("Idade do visitante: ");
								int idadeVisitante = userInput(prompt);
								Visitante visitante = new Visitante(visitanteNome, idadeVisitante);
								visita.adicionarVisitante(visitante);

								System.out.println("Visitante adicionado com sucesso!");
								break;
							case 2:
								System.out.println(visita.toString());

								break;
							default:
								break;
						}


					}
					break;
				case 4:
					int na_ = 0;
					while (na_ != 6) {

						System.out.println("O que deseja fazer?");
						System.out.println("1 - Coruja");
						System.out.println("2 - Golfinho");
						System.out.println("3 - Leão");
						System.out.println("4 - Macaco");
						System.out.println("5 - Flamingo");
						System.out.println("6 - Voltar");

						na_ = userInput(prompt);

						Scanner scanner = new Scanner(System.in);
						switch (na_) {
							case 1:
								int na1 = 0;


								System.out.print("Nome da coruja: ");
								String corujaNome = scanner.nextLine();
								System.out.print("Idade da coruja: ");
								int corujaIdade = scanner.nextInt();
								System.out.print("Genero da coruja (M/F): ");
								char corujaGenero = scanner.next().charAt(0);;
								Coruja coruja = new Coruja(corujaNome, corujaIdade, corujaGenero);

								while (na1 != 3) {
									System.out.println("CORUJA");
									System.out.println("1 - Voar");
									System.out.println("2 - Fazer barulho");
									System.out.println("3 - Voltar");

									na1 = userInput(prompt);
									if      (na1 == 1) coruja.voar();
									else if (na1 == 2) coruja.fazerBarulho();
								}

								break;
							case 2:
								int na2 = 0;

								System.out.print("Nome do golfinho: ");
								String golfinhoNome = scanner.nextLine();
								System.out.print("Idade do golfinho: ");
								int golfinhoIdade = scanner.nextInt();
								System.out.print("Genero do golfinho (M/F): ");
								char golfinhoGenero = scanner.next().charAt(0);;
								Golfinho golfinho = new Golfinho(golfinhoNome, golfinhoIdade, golfinhoGenero);

								while (na2 != 3) {
									System.out.println("GOLFINHO");
									System.out.println("1 - Nadar");
									System.out.println("2 - Fazer barulho");
									System.out.println("3 - Voltar");

									na2 = userInput(prompt);
									if      (na2 == 1) golfinho.nadar();
									else if (na2 == 2) golfinho.fazerBarulho();
								}

								break;
							case 3:
								int na3 = 0;

								System.out.print("Nome do leao: ");
								String leaoNome = scanner.nextLine();
								System.out.print("Idade do leao: ");
								int leaoIdade = scanner.nextInt();
								System.out.print("Genero do leao (M/F): ");
								char leaoGenero = scanner.next().charAt(0);
								Leao leao = new Leao(leaoNome, leaoIdade, leaoGenero);

								while (na3 != 3) {
									System.out.println("LEAO");
									System.out.println("1 - Andar");
									System.out.println("2 - Fazer barulho");
									System.out.println("3 - Voltar");

									na3 = userInput(prompt);
									if      (na3 == 1) leao.andar();
									else if (na3 == 2) leao.fazerBarulho();
								}
								break;
							case 4:
								int na4 = 0;

								System.out.print("Nome do macaco: ");
								String macacoNome = scanner.nextLine();
								System.out.print("Idade do macaco: ");
								int macacoIdade = scanner.nextInt();
								System.out.print("Genero do macaco (M/F): ");
								char macacoGenero = scanner.next().charAt(0);
								Macaco macaco = new Macaco(macacoNome, macacoIdade, macacoGenero);

								while (na4 != 3) {
									System.out.println("MACACO");
									System.out.println("1 - Andar");
									System.out.println("2 - Fazer barulho");
									System.out.println("3 - Voltar");

									na4 = userInput(prompt);
									if      (na4 == 1) macaco.andar();
									else if (na4 == 2) macaco.fazerBarulho();
								}
								break;
							case 5:
								int na5 = 0;

								System.out.print("Nome do flamingo: ");
								String flamingoNome = scanner.nextLine();
								System.out.print("Idade do flamingo: ");
								int flamingoIdade = scanner.nextInt();
								System.out.print("Genero do flamingo (M/F): ");
								char flamingoGenero = scanner.next().charAt(0);
								Flamingo flamingo = new Flamingo(flamingoNome, flamingoIdade, flamingoGenero);

								while (na5 != 3) {
									System.out.println("FLAMINGO");
									System.out.println("1 - Voar");
									System.out.println("2 - Fazer barulho");
									System.out.println("3 - Voltar");

									na5 = userInput(prompt);
									if      (na5 == 1) flamingo.voar();
									else if (na5 == 2) flamingo.fazerBarulho();
								}
								break;
							default:
								break;
						}

					}
					break;

				default:
					break;
			}
		}


	}
}
