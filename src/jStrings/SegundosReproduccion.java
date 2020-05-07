package jStrings;

import libs.Input;

public class SegundosReproduccion {

    public static void main(String[] args) {

        //1.  imprimo mensaje "durancion del video: (mm:ss)"
        System.out.println("Introducir duracion del video");
        //2.  capturar el dato del usuario guardarlo en un string
        String duracion = Input.get_string();
        //3.  partir la informacion en dos:  el primero es minutos, el otro es segundos
        String num[] = (duracion.split(":"));
        //4.  multiplicar los minutos por sesenta y sumarle los segundos.
        int minutos = Integer.parseInt(num[0]);
        int segundos = Integer.parseInt(num[1]);
        int total = minutos*60 + segundos;

        //5. imprimir el resultado
        System.out.println("Duracion del video en segundos: " + total);

        }
    }

