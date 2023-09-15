/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Alex
 */
public class ItemCompra {

    private Compra compra;
    private Produto produto;    
    private double qtd;
    private double valorProduto;
    private double subTotal;
    
    public ItemCompra(Compra compra, Produto produto, double qtd, double valorProduto) {
        this.compra = compra;
        this.produto = produto;
        this.qtd = qtd;
        this.valorProduto = valorProduto;
        this.subTotal = qtd * valorProduto;
        
    }
    
    
    public Compra getCompra() {
        return compra;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getQtd() {
        return qtd;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public double getSubTotal() {
        return subTotal;
    }
  
  
    
}
