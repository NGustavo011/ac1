package com.example.ac1.model;

/**
 * Product
 */
public class Product {

    private int codigo;
    private  String nome;
    private double valor;
    private int estoque;

    public Product(int codigo, String nome, double valor, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Product [codigo=" + codigo + ", estoque=" + estoque + ", nome=" + nome + ", valor=" + valor + "]";
    }
}