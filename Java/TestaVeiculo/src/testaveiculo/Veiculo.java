/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaveiculo;

/**
 *
 * @author franc
 */
public class Veiculo {
    private int velocidade;
    private String cor;
    
    /*Construtor*/
    public Veiculo(int v, String c){
        velocidade = v;
        cor = c;
    }
    
    /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void giraEsquerda(){
        System.out.println("Virando a esquerda");
    }
    
    public void giraDireita(){
        System.out.println("Virando a direita");
    }
}
