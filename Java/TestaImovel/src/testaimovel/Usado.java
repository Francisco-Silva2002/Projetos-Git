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
public class Usado extends Imovel{
    private float descontoM;
    
    /*Contrutor*/
    public Usado(int c, String e, float p, float d){
        super(c,e,p);
        descontoM = d;
    }
    
    public void setDescontoM(float d){
        descontoM = d;
    }
    
    @Override
    public void Imprime(){
        super.Imprime();
        System.out.printf("Valor do desconto: R$%.2f\n",descontoM);
    }
    
    public void novoValor(){
        float r = super.getPreco();
        super.setPreco(r-descontoM);
    }
}
