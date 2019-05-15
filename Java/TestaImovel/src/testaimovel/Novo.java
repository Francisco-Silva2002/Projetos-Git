/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaimovel;

/**
 *
 * @author franc
 */
public class Novo extends Imovel{
    private float precoAdd;
    
    /*Contrutor*/
    public Novo(int c,String e,float p, float pa){
        super(c,e,p);
        precoAdd = pa;
    }
    
    public void setPrecoAdd(float pa){
        precoAdd = pa;
    }
    
    public float getPrecoAdd(){
        return precoAdd;
    }
    
    @Override
    public void Imprime(){
        super.Imprime();
        System.out.printf("Preço adicional do imóvel: R$%.2f\n",precoAdd);
    }
    
    public void novoValor(){
        float r = super.getPreco();
        super.setPreco(precoAdd+r);
    }
}
