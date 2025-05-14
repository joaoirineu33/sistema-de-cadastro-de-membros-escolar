package model.entity;

import model.Pessoa;
import java.util.Objects;

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

    public String getSiape() { return siape; }
    public void setSiape(String siape) { this.siape = siape; }

    public String getDisciplina() { return disciplina; }
    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    public void exibirDados() {
        System.out.println(this);
    }

    public void mostrarTurno() {
        System.out.println("Turno: " + turno);
    }

    public String toString() {
        return "Professor:\n" +
                "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "SIAPE: " + siape + "\n" +
                "Disciplina: " + disciplina + "\n" +
                "Turno: " + turno;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        if (!super.equals(o)) return false;
        Professor that = (Professor) o;
        return Objects.equals(siape, that.siape) &&
               Objects.equals(disciplina, that.disciplina) &&
               Objects.equals(turno, that.turno);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), siape, disciplina, turno);
    }
}
