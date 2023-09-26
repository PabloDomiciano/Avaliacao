package ifpr.edu.br.pablinn.Exercicio2;

public class FormaGeometrica {
    private double base;
    private double altura;
    private double raio;
            
    public FormaGeometrica() {
    }

    public FormaGeometrica(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public FormaGeometrica(double raio){
        this.raio = raio;
    }
    

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
}
