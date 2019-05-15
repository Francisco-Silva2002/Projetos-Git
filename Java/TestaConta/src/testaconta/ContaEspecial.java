/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaconta;

/**
 *
 * @author franc
 */
public class ContaEspecial extends ContaBancaria{
    private float limite;
    
    public ContaEspecial(String c, int n, double s, float l){
        super(c,n,s);
        limite = l;
    }
    
    @Override
    public void Imprime(){
        super.Imprime();
        System.out.printf("Limite:R$%.2f",limite);
    }
    
    public float getLimite(){
        return limite;
    }
    
    public void setLimite(float l){
        limite = l;
    }
    
    @Override
    public void saquar(double saque){
       double b = super.getSaldo();
       if(b<limite){
           System.out.println("Valor abaixo do limite.");
       } else{
           b -= saque;
           super.setSaldo(b);
       }
    }    
}
