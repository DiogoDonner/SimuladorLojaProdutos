public class Produto {
    String nome;
    Double preço;
    int quantidade;

    void exibirDetalhes() {
        System.out.println(nome + " R$" + preço + " - " + quantidade + " unidades " + nome);
    }

    void venderProduto(Integer unidades) {
        quantidade = quantidade - unidades;
        System.out.println("Vendendo " + unidades + " unidades de: " + nome);
    }

    void reporProdutos(Integer unidades) {
        quantidade += unidades;
        System.out.println("Repondo " + unidades + " unidades de: " + nome);

    }
}
