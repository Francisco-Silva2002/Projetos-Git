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
public class AppContas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBancaria cb1 = new ContaBancaria("Francisco", 2564, 1500);
        ContaPoupanca cp1 = new ContaPoupanca("Francisco", 2564, 1500,10);
        ContaEspecial ce1 = new ContaEspecial("Francisco", 2564, 1500,200);
        
        
        
        cb1.depositar(100);
        cp1.depositar(2000);
        ce1.depositar(500);
        
        cb1.saquar(500);
        cp1.saquar(3750);
        ce1.saquar(450);
        
    }
    
}
