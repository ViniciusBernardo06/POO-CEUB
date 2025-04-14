public class IMCCalculadora {

    double calcularIMC(Pessoa p) {
        double imc = p.peso / Math.pow(p.altura, 2);
        return imc;
    }

    String classificarIMC(Pessoa p) {
        double imc = calcularIMC(p);
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 25) return "Normal";
        else if (imc < 30) return "Sobrepeso";
        else return "Obesidade";
    }
}