
package iLoops;

public class CancionElefantes {
    public static void main(String args[]){
        int numElefante=1;

        while(numElefante<=100){
            if(numElefante==100){
                System.out.println("Son " + numElefante + " elefantes y ya no los aguntamos");

            }else if(numElefante==1){
                System.out.println(numElefante + " elefante se columpiaba sobre la tela de una araña, como veía que resistia, fue a llamar a otro elefante");

            }
            else{
                System.out.println(numElefante + " elefantes se columpiaban sobre la tela de una araña, como veía que resistia, fue a llamar a otro elefante");

            }
            numElefante++;
        }
    }
}
