public class ParesEImpares {
    //determinar que numeros de una cadena son pares e impares
    public static void main(String[] args) {
        String numeros = "133234748956017";
        // la variable numeros es igual a cero; hasta que numeros sea menor a la longitud; incrementar en uno
        //para la variable i igual a cero; hasta que i sea menor que la longitud de numeros; incrementar i en uno

        for (int i = 0; i < numeros.length(); i++) {
            int contenido=Character.getNumericValue(numeros.charAt(i));

            if (contenido%2==0){
                System.out.println(contenido + "es par");
            }
            else {
                System.out.println(contenido +"es impar");
            }

        }
        //recorrer de nuevo e imprimir "tres" cuando sea 3 y siete cuando sea 7
    }
}
