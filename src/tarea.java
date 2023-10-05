// Online Java Compiler
// Use this editor to write, compile and run your Java code online


public class tarea {

    public static void main(String[] args) {

        String cadena="veinticuatro";
        String cadenaAuxiliar="-";
        int contador=1;

        cadena=cadena.toUpperCase();

        int longitud=cadena.length()-1;


        System.out.print(cadena);

        for (int c=longitud;c>=0;c--,contador++){

            cadenaAuxiliar="-";

            int contador2=cadena.length()-1;

            for (int s=0;s<contador;s++,contador2--){

                cadenaAuxiliar=cadena.charAt(contador2)+cadenaAuxiliar;

            }
            for (int s=0;s<c;s++,contador2--){

                cadenaAuxiliar=cadenaAuxiliar+cadena.charAt(s);

            }

            System.out.print("-"+cadenaAuxiliar);
        }

    }

}