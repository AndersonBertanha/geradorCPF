/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package geradorCpf;

import java.util.ArrayList;

public class geradorCpf {

    static ArrayList<Integer> listaNumAleatorios = new ArrayList<Integer>();

    public static void main(String[] args) {
        System.out.println("s");
        for (int i = 0; i <= 8; i++) {
            listaNumAleatorios.add(geraNumeroAleatorio());
        }
    /* listaNumAleatorios.add(0);    
     listaNumAleatorios.add(3);    
     listaNumAleatorios.add(6);    
     listaNumAleatorios.add(5);    
     listaNumAleatorios.add(5);    
     listaNumAleatorios.add(5);    
     listaNumAleatorios.add(2);    
     listaNumAleatorios.add(5);    
     listaNumAleatorios.add(9);*/
    System.out.println(listaNumAleatorios);
    validadorDigitos validador= new validadorDigitos();
    listaNumAleatorios = validador.ValidarDigitos(listaNumAleatorios);
   
        System.out.println(listaNumAleatorios);     
    
    }

    public static int geraNumeroAleatorio() {
        int numero = (int) (Math.random() * 10);
        return numero;

    }

}
