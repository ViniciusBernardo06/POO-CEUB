public class Cliente extends Pessoa {
    private String codigoCliente;
    private double limiteCredito;

    public Cliente(String nome, String cpf, String endereco, String codigoCliente, double limiteCredito) {
        super(nome, cpf, endereco);
        this.codigoCliente = codigoCliente;
        this.limiteCredito = limiteCredito;
    }

    public String getCodigoCliente() { return codigoCliente; }
    public void setCodigoCliente(String codigoCliente) { this.codigoCliente = codigoCliente; }

    public double getLimiteCredito() { return limiteCredito; }
    public void setLimiteCredito(double limiteCredito) { this.limiteCredito = limiteCredito; }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Código do Cliente: " + codigoCliente);
        System.out.println("Limite de Crédito: R$ " + limiteCredito);
    }
}