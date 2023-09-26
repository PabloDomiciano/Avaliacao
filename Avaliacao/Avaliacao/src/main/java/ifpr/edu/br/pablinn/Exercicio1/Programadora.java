package ifpr.edu.br.pablinn.Exercicio1;

public class Programadora extends Pessoa {

    private String empresa;
    private String[] linguagensDeProgramacao;

    @Override
    public void aprender() {
        System.out.println("Progamadora aprende!");
    }

    @Override
    public void caminhar() {
        System.out.println("Programadora caminha!");

    }

    @Override
    public void comer() {
        System.out.println("Programadora come!");
    }

    public void codificar() {
        System.out.println("Progamadora codifica!");
    }

    public Programadora() {
    }

    public Programadora(String empresa, String[] linguagensDeProgramacao, String nome, String cpf, String dataDeNascimento) {
        super(nome, cpf, dataDeNascimento);
        this.empresa = empresa;
        this.linguagensDeProgramacao = linguagensDeProgramacao;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String[] getLinguagensDeProgramacao() {
        return linguagensDeProgramacao;
    }

    public void setLinguagensDeProgramacao(String[] linguagensDeProgramacao) {
        this.linguagensDeProgramacao = linguagensDeProgramacao;
    }
}
