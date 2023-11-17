import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner (System.in);

        //Solicita ao usuário o limite do cartão
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();

        //Cria um objeto CartãoDeCredito com limite fornecido
        CartaoDeCredito cartao =  new CartaoDeCredito(limite);

        //Variável para controle de loop de compras
        int sair = 1;
        while(sair != 0){

            //Solicita ao usuário a descrição da compra
            System.out.println("Digite a descrição da compra:");
            String descricao =  leitura.next();

            //Solicita ao usuário o valor da compra
            System.out.println("Digite o valor da compra: ");
            double valor = leitura.nextDouble();

            //Cria um objetio Compra com detalhes fornecidos
            Compra compra = new Compra(descricao,valor);

            // Registra a compra no cartão e verifica se foi realizada com sucesso
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada){

                // Solicita ao usuário que digite 0 para sair ou 1 para continuar
                System.out.println("Compra realizada");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            } else{
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        // Apresenta as compras realizadas ordenadas pelo valor
        System.out.println("********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(cartao.getCompras());
        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " +c.getValor());
        }
        System.out.println("\n********************");

        // Exibe o saldo atual do cartão
        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());
    }

}

