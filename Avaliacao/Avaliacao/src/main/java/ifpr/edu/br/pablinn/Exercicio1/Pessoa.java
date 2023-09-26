package ifpr.edu.br.pablinn.Exercicio1;

public class Pessoa {

    private String nome;
    private String cpf;
    private String dataDeNascimento;

    public void aprender() {
        System.out.println("Pessoa aprende!");
    }

    public void caminhar() {
        System.out.println("Pessoa caminha!");

    }

    public void comer() {
        System.out.println("Pessoa come!");
    }

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

}
