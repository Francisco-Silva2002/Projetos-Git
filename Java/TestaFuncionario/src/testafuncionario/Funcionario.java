/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testafuncionario;

/**
 *
 * @author franc
 */
public class Funcionario {
    private String nome;
    private float salario;
    
    /*Contrutor*/
    public Funcionario(String n, float s){
        nome = n;
        salario = s;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void mostraDados(){
        System.out.println("Nome:"+nome);
        System.out.printf("Salário:R$%.2f",salario);
    }
    
    public void calculaBonificacao(){
        salario *= 1.1;
    }
}
