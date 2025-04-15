package model.entity;

import model.Pessoa;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    private String turno;

    public Aluno(String nome, int idade, String cpf, String matricula, String curso, String turno) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.curso = curso;
        this.turno = turno;
    }

    @Override
    public void exibirDados() {
        System.out.println("Aluno:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        mostrarTurno();
    }

    @Override
    public void mostrarTurno() {
        System.out.println("Turno: " + turno);
    }
}
