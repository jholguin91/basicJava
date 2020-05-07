package jStrings;

import libs.Input;

public class InicialesFacil {

    public static void main(String[] args) {

        Input.print("Ingresa Nombre Completo:");
        String nombre1 = Input.get_string();

        String nombres[] = nombre1.split(" ");

        int i=0;
        int j=0;

       while (i<nombres.length){

           if (nombres[i].charAt(j) >= 'A' && nombres[i].charAt(j) <= 'Z'){
               Input.print(nombres[i].charAt(j));
               i++;
           }
           else {
               j++;

           }
       }
    }
}
