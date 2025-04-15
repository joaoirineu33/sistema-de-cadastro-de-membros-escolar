package model.entity;

import model.Pessoa;

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

    @Override
    public void exibirDados() {
        System.out.println("Técnico-Administrativo:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("Setor: " + setor);
        System.out.println("Cargo: " + cargo);
        mostrarTurno();
    }

    @Override
    public void mostrarTurno() {
        System.out.println("Turno: " + turno);
    }
}
