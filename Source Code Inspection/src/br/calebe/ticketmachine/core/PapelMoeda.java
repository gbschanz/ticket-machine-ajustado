package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoeda {

    protected int valor;
    protected int quantidade;

     public PapelMoeda(int valor, int quantidade) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor da nota deve ser positivo.");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade de notas deve ser positiva.");
        }
        this.valor = valor;
        this.quantidade = quantidade;
    }


    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
