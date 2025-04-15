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

    public void mostrarTurno() {
        System.out.println("Turno do aluno: " + turno);
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
}
