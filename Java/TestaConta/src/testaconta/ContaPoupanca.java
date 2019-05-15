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
public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;
    
    public ContaPoupanca(String c, int n, float s, int d){
        super(c,n,s);
        diaRendimento = d;
    }
    
    @Override
    public void Imprime(){
        super.Imprime();
        System.out.println("Dias de Rendimento:"+diaRendimento);
    }
    
    public int getDiaRendimento(){
        return diaRendimento;
    }
    
    public void setDiaRendimento(int dia){
        diaRendimento = dia;
    }
    
    public void calculaNovoSaldo(float rend){
        rend /= 100;
        double b = super.getSaldo();
        b += diaRendimento*rend;
        super.setSaldo(b);
    }
}
