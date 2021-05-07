package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entites.Planos;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Planos> listAtivos = new ArrayList<>();
		List<Planos> listNaoAtivos = new ArrayList<>();
		System.out.println("  ***CADASTRO DE ALUNOS ***  ");
		System.out.println();
		System.out.print("Quantos alunos iremos cadastrar? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			System.out.println("Vamos começar com o aluno Nº" + i);
			System.out.print("Qual o nome do aluno a ser cadastrado? ");
			String nome = sc.next();
			System.out.print("Qual o seu cpf? ");
			long cpf = sc.nextLong();
			System.out.print("Qual o seu peso? " );
			float peso = sc.nextFloat();
			System.out.print("Qual a sua altura? ");
			float altura = sc.nextFloat();
			System.out.println("Digite 1 ou 2");
			System.out.println("1. Ativo");
			System.out.println("2. Não ativo");
			String status = sc.next();
			switch (status) {
			case "1":
				status = "Ativo";
				break;
			case "2":
				status = "Não Ativo";
				break;

			}
			System.out.println("Digite o codigo do plano que deseja");
			System.out.println("1.Diario");
			System.out.println("2.Semanal");
			System.out.println("3.Mensal");
			String plano = sc.next();
			switch (plano) {
			case "1":
				plano = "Diario";
				break;
			case "2":
				plano = "Semanal";
				break;
			case "3":
				plano = "Mensal";
				break;
				
			}
			if (status == "Ativo") {
				System.out.println("O aluno " + nome + " foi cadastrado e está ativo no plano " + plano);
				listAtivos.add(new Planos(nome, cpf, peso, altura, status, plano));

			} else {
				System.out.println("O aluno " + nome + " foi cadastrado, NÃO está ativo no plano " + plano);
				listNaoAtivos.add(new Planos(nome, cpf, peso, altura, status, plano));
			}
			System.out.println();

		}
		sc.close();

		for (Planos a : listAtivos) {
			System.out.println(a);
		}
		System.out.println("Quantidade total de alunos ATIVOS: " + listAtivos.size());
		System.out.println();
		System.out.println("         FIM ATIVOS!!      ");
		System.out.println();
		for (

		Planos b : listNaoAtivos) {
			System.out.println(b);
		}
		System.out.println("Quantidade total de aluno NAO ATIVOS: " + listNaoAtivos.size());
		System.out.println();
		System.out.println("         FIM NAO ATIVOS!!      ");
		System.out.println();
	}
}