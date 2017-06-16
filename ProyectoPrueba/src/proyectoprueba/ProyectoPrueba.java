/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class ProyectoPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        int n0 = Input.nextInt();
        int n1 = Input.nextInt();
        Numero A = new Numero(n0);
        Numero B = new Numero(n1);
        Numero C = A.SumarNumero(B);
        System.out.println(A.Numero() + " + " + B.Numero() + " = " + C.Numero());
       
    }
    
}
