import java.util.*;
import model.Pessoa;
import model.entity.*;
import model.gas.CilindroGas;
import model.gas.ConsumoExcedenteException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua matrícula (somente números): ");
        String matriculaDev = sc.nextLine();

        int soma = 0;
        for (char c : matriculaDev.toCharArray()) {
            if (Character.isDigit(c)) {
                soma += Character.getNumericValue(c);
            }
        }

        int resultado = soma % 3;
        System.out.println("Soma dos dígitos da matrícula: " + soma);
        System.out.println("Soma % 3 = " + resultado);

        Collection<Pessoa> pessoasListSet = null;
        Map<String, Pessoa> pessoasMap = null;
        String estruturaUsada = "";

        switch (resultado) {
            case 0:
                pessoasListSet = new ArrayList<>();
                estruturaUsada = "List (ArrayList)";
                break;
            case 1:
                pessoasListSet = new HashSet<>();
                estruturaUsada = "Set (HashSet)";
                break;
            case 2:
                pessoasMap = new HashMap<>();
                estruturaUsada = "Map (HashMap)";
                break;
        }

        System.out.println("Estrutura de dados utilizada: " + estruturaUsada);
        System.out.println("========================================\n");

        Aluno aluno = new Aluno("João", 19, "111.111.111-11", "20231001", "ADS", "Noite");
        Professor professor = new Professor("Fausto", 45, "222.222.222-22", "56789", "POO", "Noite");
        TecnicoAdministrativo tecnico = new TecnicoAdministrativo("Maria", 35, "333.333.333-33", "RH", "Assistente", "Tarde");

        System.out.println("ALUNO:");
        aluno.exibirDados();
        System.out.println("toString: " + aluno.toString());
        System.out.println("equals (com clone): " + aluno.equals(new Aluno("João", 19, "111.111.111-11", "20231001", "ADS", "Noite")));
        System.out.println("hashCode: " + aluno.hashCode());
        System.out.println();

        System.out.println("PROFESSOR:");
        professor.exibirDados();
        System.out.println("toString: " + professor.toString());
        System.out.println("equals (com clone): " + professor.equals(new Professor("Fausto", 45, "222.222.222-22", "56789", "POO", "Noite")));
        System.out.println("hashCode: " + professor.hashCode());
        System.out.println();

        System.out.println("TÉCNICO-ADMINISTRATIVO:");
        tecnico.exibirDados();
        System.out.println("toString: " + tecnico.toString());
        System.out.println("equals (com clone): " + tecnico.equals(new TecnicoAdministrativo("Maria", 35, "333.333.333-33", "RH", "Assistente", "Tarde")));
        System.out.println("hashCode: " + tecnico.hashCode());
        System.out.println();

        if (pessoasMap != null) {
            pessoasMap.put(aluno.getCpf(), aluno);
            pessoasMap.put(professor.getCpf(), professor);
            pessoasMap.put(tecnico.getCpf(), tecnico);
        } else {
            pessoasListSet.add(aluno);
            pessoasListSet.add(professor);
            pessoasListSet.add(tecnico);
        }

        System.out.println("=== OBJETOS ARMAZENADOS NA COLEÇÃO ===");
        if (pessoasMap != null) {
            for (Map.Entry<String, Pessoa> entry : pessoasMap.entrySet()) {
                System.out.println("CPF: " + entry.getKey());
                entry.getValue().exibirDados();
                System.out.println("---------------------------");
            }
        } else {
            for (Pessoa p : pessoasListSet) {
                p.exibirDados();
                System.out.println("---------------------------");
            }
        }

        System.out.println("\n====== SIMULAÇÃO DO CILINDRO DE GÁS ======");

        CilindroGas cilindro = new CilindroGas(50);
        System.out.println("Cilindro criado: " + cilindro);

        try {
            cilindro.registrarConsumo(10);
        } catch (ConsumoExcedenteException e) {
            System.out.println(e.getMessage());
        }

        try {
            cilindro.registrarConsumo(5);
        } catch (ConsumoExcedenteException e) {
            System.out.println(e.getMessage());
        }

        try {
            cilindro.registrarConsumo(40);
        } catch (ConsumoExcedenteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nEstado final do cilindro:");
        System.out.println("Capacidade Atual: " + cilindro.getCapacidadeAtual() + " unidades.");

        // ============================================

        sc.close();
    }
}
