public class CalculadoraArea  extends FormaGeometrica {

    static calcularAreaTotal() {

    }
    
}
public class Figura {
    static calcularAreaTotal() {
    }
    static calcularPerimetroTotal() {
    }

}

public class Quadrado extends Figura {
    int lado;
    double calcularAreaTotal() {
        return lado*lado;
    };
}

public class Triangulo extends Figura {
    double lado1;
    double lado2;
    double base;
    double altura;

    double calcularAreaTotal() {
        return altura*base/2;
    }
    double calcularPerimetroTotal() {
        return lado1+lado2+base;
    }
}

public class Circulo extends Figura {
    int raio;
    double calcularAreaTotal() {
        return raio*2*3.14;
    }
    double calcularPerimetroTotal() {
        return raio*2*3.14;
    }
}

public class Retangulo extends Quadrado {
    int altura;
    double calcularAreaTotal() {
        return lado*altura;
    }
    double calcularPerimetroTotal() {
        return (lado+altura)*2;
    }
}