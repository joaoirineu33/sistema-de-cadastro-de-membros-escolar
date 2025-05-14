package model.entity;

import model.Pessoa;
import java.util.Objects;

public class TecnicoAdministrativo extends Pessoa {
    private String setor;
    private String cargo;
    private String turno;

    public TecnicoAdministrativo(String nome, int idade, String cpf, String setor, String cargo, String turno) {
        super(nome, idade, cpf);
        this.setor = setor;
        this.cargo = cargo;
        this.turno = turno;
    }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    public void exibirDados() {
        System.out.println(this);
    }

    public void mostrarTurno() {
        System.out.println("Turno: " + turno);
    }

    public String toString() {
        return "Técnico-Administrativo:\n" +
                "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Setor: " + setor + "\n" +
                "Cargo: " + cargo + "\n" +
                "Turno: " + turno;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TecnicoAdministrativo)) return false;
        if (!super.equals(o)) return false;
        TecnicoAdministrativo that = (TecnicoAdministrativo) o;
        return Objects.equals(setor, that.setor) &&
               Objects.equals(cargo, that.cargo) &&
               Objects.equals(turno, that.turno);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), setor, cargo, turno);
    }
}
