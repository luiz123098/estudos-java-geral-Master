package BackEndCoding.JavaCoding.Class.GetSet.ProdutosClasses;
 import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Today is a holiday?(y/n):          "); String feriadoConfirmacao = ler.nextLine();

        if(feriadoConfirmacao.equals("y")){
            System.out.print("\nEnter a product:                   ");
            String nome1F = ler.nextLine();
            Produto p1Feriado =  new Produto(nome1F);

            System.out.print("Enter the product price:           ");
            p1Feriado.preco =  ler.nextDouble();
            System.out.print("Enter the discount of the holiday: ");
            p1Feriado.descontof =  ler.nextDouble();
            System.out.print("Enter a manager discount:          ");
            double  descontoGFeriado = ler.nextDouble();
            System.out.println("The product:                       "+p1Feriado.nome);
            System.out.println("The price:                         "+p1Feriado.preco);
            System.out.println("We offer a discount in holiday of: "+p1Feriado.descontof);
            System.out.printf("The final price is:                %.2f",p1Feriado.precoComDescontoNoFeriado(descontoGFeriado));
            Double Produto1TotFeriado = p1Feriado.precoComDescontoNoFeriado(descontoGFeriado);

//SEPARAR PRODUTOS
            System.out.print("\nEnter a product:                   ");
            String nome2F = ler.nextLine();
            Produto p2Feriado =  new Produto(nome2F);

            System.out.print("\nEnter the product price:           ");
            p2Feriado.preco =  ler.nextDouble();
            System.out.print("\nEnter the discount of the holiday: ");
            p2Feriado.descontof =  ler.nextDouble();
            System.out.println("Enter a manager discount:          ");
            double  descontoGFeriado2 = ler.nextDouble();

            System.out.println("The product:                      "+p2Feriado.nome);
            System.out.println("The price:                        "+p2Feriado.preco);
            System.out.println("We offer a discount in holiday of:"+p2Feriado.descontof);
            System.out.printf("The final price is:               %.2f",p2Feriado.precoComDescontoNoFeriado(descontoGFeriado2));
            Double Produto2TotFeriado = p2Feriado.precoComDescontoNoFeriado(descontoGFeriado2);
            double totalCarrinho = Produto1TotFeriado+ Produto2TotFeriado;

            System.out.printf("\n\nTotal do carrinho:                %.2f"
                    ,totalCarrinho);


        } else if (feriadoConfirmacao.equals("n")) {
            System.out.print("\nEnter a product:                   ");
            String nome1 = ler.nextLine();

            Produto p1 = new Produto(nome1);
//ALOCANDO VALORES NAS VARIAVEIS DA OUTRA CLASSE

            System.out.print("Enter the product price: ");
            p1.preco =  ler.nextDouble();
            System.out.println("Enter a manager discount: ");
            double  descontoG = ler.nextDouble();
//Imprimindo os resultados
            System.out.println("The product:                      "+p1.nome);
            System.out.println("The price:                        "+p1.preco);
            System.out.println("We offer a discount of:        "+p1.desconto);
            System.out.printf("\nThe final price is:           %.2f",p1.precoComDescontoGerente(descontoG));
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            System.out.print("\nEnter a product:                   ");
            String nome2 = ler.nextLine();

            Produto p2 =  new Produto(nome2);

            System.out.print("Enter the product price:         ");
            p2.preco =  ler.nextDouble();
            System.out.print("Enter a manager discount:       ");
            double  descontoG2 = ler.nextDouble();

            System.out.println("The product:                      "+p2.nome);
            System.out.println("The price:                        "+p2.preco);
            System.out.println("We offer a discount of:        "+p2.desconto);
            System.out.printf("\nThe final price is:           %.2f",p2.precoComDescontoGerente(descontoG2));

            double totalCarrinho = p1.precoComDescontoGerente(descontoG) + p2.precoComDescontoGerente(descontoG2);
            System.out.printf("\n\nTotal do carrinho:              %.2f"
                    ,totalCarrinho);
        }
    }
}