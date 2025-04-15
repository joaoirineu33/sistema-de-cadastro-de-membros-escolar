package model.entity;

import model.Pessoa;

public class Professor extends Pessoa {
    private String siape;
    private String disciplina;
    private String turno;

    public Professor(String nome, int idade, String cpf, String siape, String disciplina, String turno) {
        super(nome, idade, cpf);
        this.siape = siape;
        this.disciplina = disciplina;
        this.turno = turno;
    }

    public void exibirDados() {
        System.out.println("Professor:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("SIAPE: " + siape);
        System.out.println("Disciplina: " + disciplina);
        mostrarTurno();
    }

    public void mostrarTurno() {
        System.out.println("Turno: " + turno);
    }
}
