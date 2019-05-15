/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaconta;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class ContaBancaria {
    private String cliente;
    private int numConta;
    private double saldo;
    
    public ContaBancaria(String c, int n, double s){
        cliente = c;
        numConta = n;
        saldo = s;
    }
    
    public void Imprime(){
        System.out.println("Cliente:"+cliente);
        System.out.println("Número da Conta:"+numConta);
        System.out.printf("Saldo:R$%.2f",saldo);
    }
    
    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the numConta
     */
    public int getNumConta() {
        return numConta;
    }

    /**
     * @param numConta the numConta to set
     */
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void saquar(double saque){
        if(saldo<0){
            System.out.println("Saldo Negativo");
        } else {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite a quantidade a ser sacada: ");
            saque = input.nextDouble();
            if(saque>saldo){
                System.out.println("Não é possível saquar.Quantidade insuficiente.");
            } else {
                saldo -= saque;
            }
        }
    }
    
    public void depositar(double dep){
        saldo += dep;
    }  
}
