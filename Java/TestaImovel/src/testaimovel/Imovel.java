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
public class Imovel {
    private int codigo;
    private String endereco;
    private float preco;
    
    /*Contrutor*/
   public Imovel(int c, String e, float p){
        codigo = c;
        endereco = e;
        preco = p;
    }
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public void Imprime(){
        System.out.println("Código:"+codigo);
        System.out.println("Endereço:"+endereco);
        System.out.printf("Preço:R$%.2f\n",preco);
    }
}
