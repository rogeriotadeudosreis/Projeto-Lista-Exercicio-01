/*
 Exercícios de Fixação – Lista
1. Implementar uma lista de produtos. Seu programa deverá ler os dados de
vários produtos e inseri-los na lista. A classe Lista deverá ter as seguintes
funcionalidades:
- Ordenar os elementos da lista por uma determinada chave;
- Inserir elemento na lista ordenada;
- Buscar um elemento na lista;
- Retirar um elemento da lista;
- Alterar um elemento na lista. Lembre-se: não pode alterar o campo chave.
Busca pelo campo chave e altera os outros campos. Considere como campo
chave o código do produto.
Obs.: Considere que os produtos possuem código, descrição e preço;
 */
package br.model;

/**
 *
 * @author roger
 */
public class Lista {

    private final int MAXTAM;
    private Produto[] array;
    private int ultimo;

    public Lista(int tamanho) {
        if (tamanho <= 0) {
            throw new RuntimeException("Tamanho deve ser maior de zero!\n");
        }
        MAXTAM = tamanho;
        array = new Produto[MAXTAM];
        ultimo = -1;
    }

    public boolean isEmpty() {
        return ultimo == -1;
    }

    public boolean isFull() {
        return ultimo + 1 == MAXTAM;
    }

    public int size() {
        return ultimo + 1;
    }

    public void inserirNoInicio(Produto produto) {
        if (isFull()) {
            throw new RuntimeException("A lista está cheia!\n");
        }
        ultimo++;
        for (int i = ultimo; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = produto;
    }

    public void ordenarLista() {
        Produto atual;
        int i;
        int j;
        for (i = 1; i < ultimo + 1; i++) {
            atual = array[i];
            j = i - 1;
            while (j >= 0 && atual.getCodigo() < array[j].getCodigo()) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = atual;
        }
        mostrarLista();
    }

    public void inserirDeFormaOrdenada(Produto produto) {
        if (isFull()) {
            throw new RuntimeException("A lista está cheia!\n");
        }
        ultimo++;
        int i = ultimo;
        while ((i > 0) && (produto.getCodigo() < array[i - 1].getCodigo())) {
            array[i] = array[i - 1];
            i--;
        }
        array[i] = produto;
    }

    public void mostrarLista() {
        if (isEmpty()) {
            System.out.println("A lista está vazia!\n");
        } else {
            System.out.println("*****  Produtos da lista  *****\n");
            for (int i = 0; i <= ultimo; i++) {
                System.out.printf("%s", array[i]);
            }
            System.out.println("");
        }
    }

    public void inserirNoFim(Produto produto) {
        if (isFull()) {
            throw new RuntimeException("A lista está cheia!\n");
        }
        ultimo++;
        array[ultimo] = produto;
    }

    public void inserirNaPosicaoInformada(int posicao, Produto produto) {
        if (isFull()) {
            throw new RuntimeException("A lista está cheia!\n");
        }
        if (posicao > ultimo + 1 || posicao < 0) {
            throw new RuntimeException("Posição inválida!\n");
        }
        ultimo++;
        for (int i = ultimo; i > posicao; i--) {
            array[i] = array[i - 1];
        }
        array[posicao] = produto;
    }

    public void removerNoInicio() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        for (int i = 0; i < MAXTAM; i++) {
            array[i] = array[i + 1];
        }
        ultimo--;
    }

    public void removerNoFim() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        ultimo--;
    }

    public void removerProdutoNaPosicaoInformada(int posicao) {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        if (posicao < 0 || posicao > ultimo) {
            throw new RuntimeException("Posição inválida!\n");
        }
        for (int i = posicao; i < ultimo; i++) {
            array[i] = array[i + 1];
        }
        ultimo--;
    }

    public int buscarPosicaoDoProduto(Produto produto) {
        for (int i = 0; i <= ultimo; i++) {
            if (array[i].getCodigo() == produto.getCodigo()) {
                return i;
            }
        }
        return -1;
    }

    public boolean removerProduto(Produto produto) {
        int pos = buscarPosicaoDoProduto(produto);
        if (pos == -1) {
            return false;
        }
        removerProdutoNaPosicaoInformada(pos);
        return true;
    }

    public Produto getProdutoNoInicio() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        return array[0];
    }

    public Produto getProdutoNoFim() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        return array[ultimo];
    }

    public Produto getProdutoNaPosicaoInformata(int posicao) {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        if (posicao > ultimo || posicao < 0) {
            throw new RuntimeException("Posição inválida!\n");
        }
        return array[posicao];
    }

    public void destroy() {
        ultimo = -1;
    }

    public boolean alterarProduto(Produto produto) {

        for (int i = 0; i < size(); i++) {
            if (produto.getCodigo() == array[i].getCodigo()) {
                array[i].setDescricao(produto.getDescricao());
                array[i].setPreco(produto.getPreco());
                return true;
            }

        }
        return false;
    }

}
