package ifpr.edu.br.pablinn.Exercicio2;

public class Circulo extends FormaGeometrica {

    public Double calculaCirculo() {
        double resultado = (Math.PI * Math.pow(getRaio(), 2));
        return resultado;
    }

    public Circulo() {
    }

}
