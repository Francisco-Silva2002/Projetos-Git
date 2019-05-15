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
public class Novo extends Imovel{
    private final float pAd;
    
        /**
     * @return the pAd
     */
    public float getpAd() {
        return pAd;
    }
    
    public Novo(String end, float p, float pa)
    {
        super(end,(p+pa));
        pAd = pa;
    }
    
    @Override
    public void imprimeDados()
    {
        System.out.printf("Endereço: %s\nPreço Adicional: R$%.2f\nPreço do Imóvel: R$%.2f\n", 
                super.getEndereco(), pAd, super.getPreco());
    }
}
