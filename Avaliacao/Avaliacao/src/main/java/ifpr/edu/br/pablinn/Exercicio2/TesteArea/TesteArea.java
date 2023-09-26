package ifpr.edu.br.pablinn.Exercicio2.TesteArea;

import ifpr.edu.br.pablinn.Exercicio2.Circulo;
import ifpr.edu.br.pablinn.Exercicio2.Quadrado;
import ifpr.edu.br.pablinn.Exercicio2.Triangulo;
import java.util.Scanner;

public class TesteArea {

    public static void main(String[] args) {
        System.out.println("Qual das áreas você deseja calcular:");
        System.out.println("|           [1] Quadrado           |");
        System.out.println("|           [2] Triangulo          |");
        System.out.println("|           [3] Circulo            |");
        System.out.println("|----------------------------------|");
        System.out.print("Escolha:");
        Scanner entrada = new Scanner(System.in);
        String numeroEscolha = entrada.nextLine();

        if (numeroEscolha.equals("1")) {
            Quadrado quadrado = new Quadrado();
            System.out.print("Base: ");
            Scanner base = new Scanner(System.in);
            Double baseDefine = base.nextDouble();
            quadrado.setBase(baseDefine);

            System.out.print("Altura: ");
            Scanner altura = new Scanner(System.in);
            Double alturaDefine = altura.nextDouble();
            quadrado.setAltura(alturaDefine);

            System.out.println("Área do Quadrado: " + quadrado.calculaQuadrado());

        } else if (numeroEscolha.equals("2")) {
            Triangulo triangulo = new Triangulo();
            System.out.print("Base: ");
            Scanner base = new Scanner(System.in);
            Double baseDefine = base.nextDouble();
            triangulo.setBase(baseDefine);

            System.out.print("Altura: ");
            Scanner altura = new Scanner(System.in);
            Double alturaDefine = altura.nextDouble();
            triangulo.setAltura(alturaDefine);

            System.out.println("Área do Triangulo: " + triangulo.calculaTriangulo());
            
        } else if (numeroEscolha.equals("3")) {
            Circulo circulo = new Circulo();
            System.out.print("Raio: ");
            Scanner raio = new Scanner(System.in);
            Double raioDefine = raio.nextDouble();
            circulo.setRaio(raioDefine);
            
            System.out.println("Área do Circulo: " + circulo.calculaCirculo());
        }else{
            System.out.println("Por favor, digite um número válido!");
        }
    }
}
