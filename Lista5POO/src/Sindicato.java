import java.util.ArrayList;
import java.util.Scanner;

public class Sindicato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Professor> professores = new ArrayList<>();
        double totalArrecadado = 0;
        int mestres = 0;

        while (true) {
            System.out.println("Digite o nome do professor (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) break;

            System.out.println("Digite o CPF: ");
            String cpf = scanner.nextLine();

            System.out.println("Digite a titulação (Doutor, Mestre, Especialista): ");
            String titulacao = scanner.nextLine();

            System.out.println("Digite o salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();  // Limpar buffer

            Professor professor = new Professor(nome, cpf, titulacao, salario);
            professores.add(professor);

            totalArrecadado += professor.calcularContribuicao();
            if (titulacao.equalsIgnoreCase("mestre")) {
                mestres++;
            }
        }

        System.out.println("Total arrecadado pelo sindicato: R$ " + totalArrecadado);
        System.out.println("Quantidade de professores Mestres: " + mestres);
    }
}