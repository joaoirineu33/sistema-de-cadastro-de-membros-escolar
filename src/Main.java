import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.Pessoa;
import model.entity.Aluno;
import model.entity.Professor;
import model.entity.TecnicoAdministrativo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            List<Pessoa> pessoas = new ArrayList<>();

            System.out.print("Quantos membros deseja cadastrar? ");
            int total = 0;
            try {
                total = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Reiniciando...");
                sc.nextLine();
                continue;
            }

            for (int i = 0; i < total; i++) {
                System.out.println("\nCadastro do membro #" + (i + 1));
                System.out.print("Selecione o tipo (1 - Aluno, 2 - Professor, 3 - Técnico-Administrativo): ");
                int tipo = sc.nextInt();
                sc.nextLine();

                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();
                System.out.print("CPF: ");
                String cpf = sc.nextLine();

                switch (tipo) {
                    case 1:
                        System.out.print("Matrícula: ");
                        String matricula = sc.nextLine();
                        System.out.print("Curso: ");
                        String curso = sc.nextLine();
                        System.out.print("Turno: ");
                        String turnoAluno = sc.nextLine();
                        pessoas.add(new Aluno(nome, idade, cpf, matricula, curso, turnoAluno));
                        break;
                    case 2:
                        System.out.print("SIAPE: ");
                        String siape = sc.nextLine();
                        System.out.print("Disciplina: ");
                        String disciplina = sc.nextLine();
                        System.out.print("Turno: ");
                        String turnoProfessor = sc.nextLine();
                        pessoas.add(new Professor(nome, idade, cpf, siape, disciplina, turnoProfessor));
                        break;
                    case 3:
                        System.out.print("Setor: ");
                        String setor = sc.nextLine();
                        System.out.print("Cargo: ");
                        String cargo = sc.nextLine();
                        System.out.print("Turno: ");
                        String turnoTA = sc.nextLine();
                        pessoas.add(new TecnicoAdministrativo(nome, idade, cpf, setor, cargo, turnoTA));
                        break;
                    default:
                        System.out.println("Tipo inválido. Pulando cadastro.");
                        break;
                }
            }

            System.out.println("\n=== RELATÓRIO DE MEMBROS CADASTRADOS ===");
            for (Pessoa membro : pessoas) {
                membro.exibirDados();
                System.out.println("---------------------------");
            }

            System.out.print("Deseja realizar outro cadastro? (s/n): ");
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
                System.out.println("Encerrando o programa. Até mais!");
            }
        }

        sc.close(); 
    }
}
