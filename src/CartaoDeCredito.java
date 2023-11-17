import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    // Atributos (ou propriedades) da classe
    private double limite; // Limite de crédito disponível no cartão
    private double saldo; // Saldo atual do cartão
    private List<Compra> compras; // Lista de compras realizadas com o cartão

    // Construtor da classe
    public CartaoDeCredito(double limite) {
        this.limite = limite; // Inicializa o limite do cartão com o valor fornecido
        this.saldo = limite; // Inicializa o saldo com o mesmo valor do limite no início
        this.compras = new ArrayList<>(); // Inicializa a lista de compras como uma nova ArrayList
    }

    // Método para registrar uma nova compra
    public boolean lancaCompra(Compra compra) {
        // Verifica se o saldo é suficiente para a compra
        if(this.saldo > compra.getValor()){
            this.saldo -= compra.getValor(); // Atualiza o saldo subtraindo o valor da compra
            this.compras.add(compra); // Adiciona a compra à lista de compras
            return true; // Retorna true se a compra for registrada com sucesso
        }

        return false; // Retorna false se o saldo não for suficiente para a compra
    }

    // Métodos para obter informações sobre o cartão
    public double getLimite() {
        return limite; // Retorna o limite do cartão
    }

    public double getSaldo() {
        return saldo; // Retorna o saldo atual do cartão
    }

    public List<Compra> getCompras() {
        return compras; // Retorna a lista de compras realizadas com o cartão
    }
}
