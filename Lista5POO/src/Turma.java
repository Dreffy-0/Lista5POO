import java.util.Scanner;

public class Turma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite a matrícula do aluno (ou 'sair' para encerrar): ");
            String matricula = scanner.nextLine();
            if (matricula.equalsIgnoreCase("sair")) break;

            System.out.println("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();
            scanner.nextLine();  // Limpar buffer

            Aluno aluno = new Aluno(matricula, nota);
            System.out.println("Matrícula: " + aluno.getMatricula() + " - Conceito: " + aluno.getConceito());
        }
    }
}