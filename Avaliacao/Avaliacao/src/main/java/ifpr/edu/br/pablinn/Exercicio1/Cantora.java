package ifpr.edu.br.pablinn.Exercicio1;

public class Cantora extends Pessoa {

    private String banda;
    private String[] estilosMusicais;

    @Override
    public void aprender() {
        System.out.println("Cantora aprende!");
    }

    @Override
    public void caminhar() {
        System.out.println("Cantora caminha!");

    }

    @Override
    public void comer() {
        System.out.println("Cantora come!");
    }

    public void cantar() {
        System.out.println("Cantora, canta!");
    }

    public Cantora() {
    }

    public Cantora(String banda, String[] estilosMusicais, String nome, String cpf, String dataDeNascimento) {
        super(nome, cpf, dataDeNascimento);
        this.banda = banda;
        this.estilosMusicais = estilosMusicais;
    }

    public String getBanda() {
        return this.banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String[] getEstilosMusicais() {
        return this.estilosMusicais;
    }

    public void setEstilosMusicais(String[] estilosMusicais) {
        this.estilosMusicais = estilosMusicais;
    }

    
}
