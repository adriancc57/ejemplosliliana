public class ejercicio1 {
    public static void main(String[] args) {
        //validar si una palabra tiene mas de 10 caracteres
        String r = "veixnt@icu3axtrox";
        //[v][e][i][n][t][i][c][u][a][t][r][o]
        int longitud = 7;
        System.out.println("la longitud es: " + longitud);
        longitud = r.length();
        System.out.println("la longitud es: " + longitud);
        String mayusculas=r.toUpperCase();
        System.out.println("la palabra en mayusculas es:  " + mayusculas);
        for( int i=0; i<longitud; i++) {
            //para una variable i que vale cero; hasta que la i sea menor que la variable longitud; incrementar i en uno
            System.out.print(i + ": " + r.charAt(i) );
            if(r.charAt(i)== 'x') {
                System.out.print(" esto es una x");
            }
            System.out.println("");
        }
        }
    }

