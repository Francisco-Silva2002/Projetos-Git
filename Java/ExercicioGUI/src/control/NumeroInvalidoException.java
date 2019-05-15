/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author franc
 */

/*
*Exceção que impede o cadastro de valores negativos nos campos Altura, Peso e Idade.
*Usado para treinar a criação de Exceções.
*/
public class NumeroInvalidoException extends Exception{
    
    public NumeroInvalidoException(String message)
    {
        super(message);
    }
    
}
