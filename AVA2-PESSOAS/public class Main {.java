public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "111.111.111-11", "Rua A", "C123", 5000.00);
        cliente.mostrarDados();

        System.out.println("\n---\n");

        Vendedor vendedor = new Vendedor("Maria", "222.222.222-22", "Rua B", "M456", "Vendas", 3000.00, 500.00, 10000.00);
        vendedor.mostrarDados();
    }
}