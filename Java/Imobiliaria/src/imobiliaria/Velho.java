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
public class Velho extends Imovel{
    private final float desconto;
    
    /**
     * @return the desconto
     */
    public float getDesconto() {
        return desconto;
    }
    
    public Velho(String e,float p, float desc)
    {
        super(e, (p-desc));
        desconto = desc;
    }
    
    @Override
    public void imprimeDados()
    {
        System.out.printf("Endereço: %s\nValor Desconto: R$%.2f\nPreço Total: R$%.2f",
                super.getEndereco(), desconto, super.getPreco());
    }
}
