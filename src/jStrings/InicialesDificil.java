package jStrings;

import libs.Input;

public class InicialesDificil {

    public static void main(String[] args) {

        Input.print("Ingresa Nombre Completo:");
        String nombre1 = Input.get_string();
        String nombrec = nombre1.trim().replaceAll("\\s+", " ");

        String nombres[] = nombrec.split(" ");

       for (int i=0; i<nombres.length; i++){

           char actual= nombres[i].charAt(0);
           char actualmayuscula=Character.toUpperCase(actual);
           Input.print(actualmayuscula);

           }
       }
    }
