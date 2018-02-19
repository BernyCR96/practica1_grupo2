/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_grupo2;

/**
 *
 * @author ROBIN SALVATIERRA
 */
public class Calculadora {

    public int factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return (int) (numero * factorial(numero - 1));
        }
    }   
}
