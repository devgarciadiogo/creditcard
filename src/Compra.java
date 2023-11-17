public class Compra implements Comparable<Compra> {
    // Atributos da classe
    private String descricao; // Descrição da compra
    private double valor; // Valor da compra

    // Construtor da classe
    public Compra(String descricao, double valor) {
        this.descricao = descricao; // Inicializa a descrição da compra
        this.valor = valor; // Inicializa o valor da compra
    }

    // Métodos para obter informações sobre a compra
    public String getDescricao() {
        return descricao; // Retorna a descrição da compra
    }

    public double getValor() {
        return valor; // Retorna o valor da compra
    }

    // Método toString para representação de string da compra
    @Override
    public String toString() {
        return "Compra: descricao = " + descricao +
                " valor =" + valor;
    }

    // Método compareTo para ordenação de compras
    @Override
    public int compareTo(Compra outraCompra) {
        // Compara as compras com base no valor (usado para ordenação)
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}