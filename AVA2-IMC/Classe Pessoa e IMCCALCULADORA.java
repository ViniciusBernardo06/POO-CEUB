public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Vinicius", 70, 1.85);
        IMCCalculadora c = new IMCCalculadora();

        System.out.printf("IMC: %.2f (%s)", c.calcularIMC(p), c.classificarIMC(p));
    }
}

class Pessoa {
    String nome;
    float peso, altura;

    Pessoa(String nome, float peso, float altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
}

class IMCCalculadora {
    double calcularIMC(Pessoa p) {
        return p.peso / Math.pow(p.altura, 2);
    }

    String classificarIMC(Pessoa p) {
        double imc = calcularIMC(p);
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 25) return "Normal";
        else if (imc < 30) return "Sobrepeso";
        else return "Obesidade";
    }
}