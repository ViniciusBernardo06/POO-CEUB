public class Vendedor extends Empregado {
    private double comissao;
    private double metaVendas;

    public Vendedor(String nome, String cpf, String endereco, String matricula, String cargo, double salario, double comissao, double metaVendas) {
        super(nome, cpf, endereco, matricula, cargo, salario);
        this.comissao = comissao;
        this.metaVendas = metaVendas;
    }

    public double getComissao() { return comissao; }
    public void setComissao(double comissao) { this.comissao = comissao; }

    public double getMetaVendas() { return metaVendas; }
    public void setMetaVendas(double metaVendas) { this.metaVendas = metaVendas; }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Comissão: R$ " + comissao);
        System.out.println("Meta de Vendas: R$ " + metaVendas);
    }
}