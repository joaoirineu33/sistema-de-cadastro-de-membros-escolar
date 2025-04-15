import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        int total = 0;

        while (true) {
            System.out.print("Quantos membros deseja cadastrar? ");
            try {
                total = Integer.parseInt(scanner.nextLine());
                if (total <= 0) throw new NumberFormatException();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido e positivo!");
            }
        }

        for (int i = 0; i < total; i++) {
            System.out.println("\nCadastro do membro #" + (i + 1));

            int tipo = 0;
            while (true) {
                System.out.print("Selecione o tipo (1 - Aluno, 2 - Professor, 3 - Técnico-Administrativo): ");
                try {
                    tipo = Integer.parseInt(scanner.nextLine());
                    if (tipo < 1 || tipo > 3) throw new NumberFormatException();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Opção inválida! Tente novamente.");
                }
            }

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            int idade = 0;
            while (true) {
                System.out.print("Idade: ");
                try {
                    idade = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Digite uma idade válida!");
                }
            }

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();

                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();

                    System.out.print("Turno: ");
                    String turnoAluno = scanner.nextLine();

                    pessoas.add(new Aluno(nome, idade, cpf, matricula, curso,turnoAluno ));
                    break;

                case 2:
                    System.out.print("SIAPE: ");
                    String siape = scanner.nextLine();

                    System.out.print("Disciplina: ");
                    String disciplina = scanner.nextLine();

                    System.out.print("Turno: ");
                    String turnoProfessor = scanner.nextLine();

                    pessoas.add(new Professor(nome, idade, cpf, siape, disciplina, turnoProfessor));
                    break;

                case 3:
                    System.out.print("Setor: ");
                    String setor = scanner.nextLine();

                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();

                    System.out.print("Turno: ");
                    String turnoTecnico = scanner.nextLine();

                    pessoas.add(new TecnicoAdministrativo(nome, idade, cpf, setor, cargo, turnoTecnico));
                    break;
            }
        }

        System.out.println("\n=== RELATÓRIO DE MEMBROS CADASTRADOS ===");
        for (Pessoa p : pessoas) {
            System.out.println(p);
            p.mostrarTurno();
            System.out.println("---------------------------");
        }

        scanner.close();
    }
}
