package model.entity;

import model.Pessoa;
import java.util.Objects;

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

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    public void exibirDados() {
        System.out.println(this);
    }

    public void mostrarTurno() {
        System.out.println("Turno: " + turno);
    }

    public String toString() {
        return "Aluno:\n" +
                "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Matrícula: " + matricula + "\n" +
                "Curso: " + curso + "\n" +
                "Turno: " + turno;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        if (!super.equals(o)) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula) &&
               Objects.equals(curso, aluno.curso) &&
               Objects.equals(turno, aluno.turno);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), matricula, curso, turno);
    }
}
 