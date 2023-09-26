package ifpr.edu.br.pablinn.Exercicio1;

public class Dancarina extends Pessoa{
    private String grupo;
    private String[] estilosDeDanca;
    
    public void dancar(){
        System.out.println("Dancarina, dança!");
    }

        @Override
    public void aprender() {
        System.out.println("Dancarina aprende!");
    }

    @Override
    public void caminhar() {
        System.out.println("Dancarina caminha!");

    }

    @Override
    public void comer() {
        System.out.println("Dancarina come!");
    }
    
    public Dancarina() {
        
    }

    public Dancarina(String grupo, String[] estilosDeDanca, String nome, String cpf, String dataDeNascimento) {
        super(nome, cpf, dataDeNascimento);
        this.grupo = grupo;
        this.estilosDeDanca = estilosDeDanca;
    }

    public String getGrupo() {
        return this.grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String[] getEstilosDeDanca() {
        return this.estilosDeDanca;
    }

    public void setEstilosDeDanca(String[] estilosDeDanca) {
        this.estilosDeDanca = estilosDeDanca;
    }   
}
