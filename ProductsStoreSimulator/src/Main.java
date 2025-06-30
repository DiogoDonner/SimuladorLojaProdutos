//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Bem Vindo a Loja de Produtos!\n");
        Produto camiseta = new Produto();
        camiseta.nome = "Regata GG Tommy";
        camiseta.preço = 219.99;
        camiseta.quantidade = 10;
        camiseta.exibirDetalhes();

        Produto calça = new Produto();
        calça.nome = "Calça 44 Levis";
        calça.preço = 272.93;
        calça.quantidade = 4;
        calça.exibirDetalhes();
        System.out.println("");
        camiseta.venderProduto(5);
        System.out.println("");
        camiseta.exibirDetalhes();
        System.out.println();
        calça.reporProdutos(10);
        calça.exibirDetalhes();

    }
}