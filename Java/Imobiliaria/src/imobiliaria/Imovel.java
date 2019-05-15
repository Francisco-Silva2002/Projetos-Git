/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobiliaria;

/**
 *
 * @author franc
 */
public class Imovel {
    private final String endereco;
    private final float preco;
    
    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }
    
    public Imovel(String end, float p)
    {
        endereco = end;
        preco = p;
    }
    
    public void imprimeDados()
    {
        System.out.printf("Endereço: %s\nPreço: R$%.2f\n", getEndereco(), getPreco());
    }
}
