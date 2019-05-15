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
public class Moto extends Veiculo_Motor{
    public Moto(int v, String c){
        super(v,c,0,0);
    }
    
    public void verMotor(){
        System.out.println("MOTOOOOOOOOOOOOOOOOOOOOOOOOOOR");
    }
}
