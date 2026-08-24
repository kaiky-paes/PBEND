package org.example;

public class Venda {
    //aceita valores nulos
    private Integer id;
    private String produto;
    private String categoria;
    private  double valorUnitario;
    private int quantidade;

    //construtor vazio para o banco
    public Venda(){}

    public Venda(String produto, String categoria, double valorUnitario, int quantidade){
        this.categoria = categoria;
        this.produto = produto;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public  double getValorTotal(){
        return this.valorUnitario = this.quantidade;
    }
}
