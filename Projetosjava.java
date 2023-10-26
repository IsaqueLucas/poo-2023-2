abstract class Figura {
    abstract double calcularArea();
    abstract double calcularPerimetro();
}

class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }

    double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

class Retangulo extends Figura {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return largura * altura;
    }

    double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }
    
    double calcularPerimetro() {
        return lado1 + lado2 + base;
    }
}

public class CalculadoraArea {
    public static double calcularAreaTotal(FormaGeometrica[] formas) {
        double areaTotal = 0;
        for (FormaGeometrica forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(7.3);
        Retangulo retangulo = new Retangulo(3.0, 4.0);
        Triangulo triangulo = new Triangulo(6.0, 3.0);


        FormaGeometrica[] formas = {circulo, retangulo, triangulo};

        double areaTotal = calcularAreaTotal(formas);
        System.out.println("Área total das formas: " + areaTotal);
    }
}
