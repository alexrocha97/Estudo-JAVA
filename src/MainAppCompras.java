import br.com.alura.screenmatch.modelos.CartaoDeCredito;
import br.com.alura.screenmatch.modelos.Compra;
import java.util.*;

public class MainAppCompras
{
    public static void main(String[] args)
    {
        Scanner resposta = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limiteCartao = resposta.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limiteCartao);

        boolean continuar = true;
        while (continuar)
        {
            System.out.println("Digite a descrição da compra: ");
            String descricaoCompra = resposta.next();

            System.out.println("Digite o valor da compra: ");
            double valorDoProduto = resposta.nextDouble();

            Compra compra = new Compra(descricaoCompra, valorDoProduto);
            boolean compraRealizada = cartao.LancaCompra(compra);

            if(compraRealizada)
            {
                System.out.println("Compra realizada com sucesso!");
                continuar = ContinuarApp();
            }
            else
            {
                System.out.println("Saldo insuficiente!");
                continuar = false;
            }

            if(!continuar)
            {
                System.out.println("*******************************");
                System.out.println("COMPRAS REALIZADAS");
                Collections.sort(cartao.getCompras());
                for (Compra item : cartao.getCompras())
                {
                    System.out.println(item.getDescricao() + " - " + item.getValor());
                }
                System.out.println("Seu saldo restante: " + cartao.getSaldo());
                System.out.println("*******************************");
            }
        }
    }


    public static boolean ContinuarApp()
    {
        Scanner resposta = new Scanner(System.in);
        System.out.println("Digite 0 para sair ou 1 para continuar: ");
        int escolha = resposta.nextInt();
        boolean continuarApp = (escolha != 0);

        if (continuarApp)
        {
            return continuarApp;
        } else
        {
            return continuarApp;
        }
    }
}
