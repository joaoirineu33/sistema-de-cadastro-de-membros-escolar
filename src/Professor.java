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

    public void mostrarTurno() {
        System.out.println("Turno do professor: " + turno);
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
}
