package ifpr.edu.br.pablinn.Exercicio2;

public class Triangulo extends FormaGeometrica {

    public double calculaTriangulo() {
        double resultado = (getBase() * getAltura()/2);
        return resultado;
    }

    public Triangulo() {
    }

}
