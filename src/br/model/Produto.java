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

import com.sun.javafx.binding.StringFormatter;

/**
 *
 * @author roger
 */
public class Produto {

    private int codigo;
    private String descricao;
    private double preco;

    public Produto() {
    }

    public Produto(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(codigo+ "\t" + descricao.toUpperCase() + "\t\t" + String.format("%.2f", preco)+
                "\n");
        return sb.toString();
        
    }
}
