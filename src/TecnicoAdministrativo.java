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

    public void mostrarTurno() {
        System.out.println("Turno do técnico-administrativo: " + turno);
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
}
