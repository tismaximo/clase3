import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //punto A

        String oracion = "Esta es una oracion innecesariamente larga que no tiene ningun proposito ademas de ser usada como oracion de ejemplo para el repaso de la clase 3 del curso Argentina Programa de Java";
        char aBuscar = 'e';
        int i;
        int contador = 0;
        for (i = 0; oracion.length() > i; i++) {

            char actual = oracion.charAt(i);
            if (actual == aBuscar) {
                contador++;
            }


        }
        System.out.println(oracion);
        System.out.println(contador);

        //punto B
        int num1 = 10;
        int num2 = 20;
        int num3 = 9;
        boolean ascendiente = false;
        int[] ordenados = new int[3];
            if (num1 > num2 && num1 > num3) {
                if (num2 > num3) {
                    ordenados = new int[]{num3, num2, num1};
                }
                else {
                    ordenados = new int[]{num2, num3, num1};
                }
            }
            if (num2 > num1 && num2> num3) {
                if (num3 > num1) {
                    ordenados =new int[] {num1, num3, num2};
                }
                else {
                    ordenados = new int[]{num3, num1, num2};
                }
            }
            if (num3 > num2 && num3 > num1) {
                if (num2>num3){
                    ordenados = new int[]{num1, num3, num2};
                }
            else {
                    ordenados = new int[]{num1, num2, num3};
                }

            }
            System.out.println(Arrays.toString(ordenados));
            if (ascendiente) {}
            else {
                for (i = 0; i<ordenados.length / 2; i++) {
                    int temp = ordenados[i];
                    ordenados[i] = ordenados[ordenados.length - i -1] ;
                    ordenados[ordenados.length - i -1] = temp;
                }
            }
        System.out.println(Arrays.toString(ordenados));
        //punto C
        int[] numeros = new int[] {2,5,10,35,1,499,7};
        int x = 10;
        int cont2 = 0;
        for(int h = 0;h<numeros.length;h++){
            if (numeros[h]>10) {
                cont2 += numeros[h];
            }
        }
        System.out.println(cont2);

        //ejercicio 2
        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        int indice;
        String aReemplazar;
        String nuevaOracion = oracion.toLowerCase();
        String[] yaReemplazados = new String[oracion.length()];
        for (i = 0; i < oracion.length(); i++) {
            indice = abecedario.indexOf(oracion.charAt(i));
            aReemplazar = String.valueOf(oracion.charAt(i));


            if (Arrays.asList(yaReemplazados).contains(aReemplazar)){}
            else {
                nuevaOracion = nuevaOracion.replace(aReemplazar, String.valueOf(abecedario.charAt(indice + 1)));
                System.out.println(nuevaOracion);
                yaReemplazados[i] = aReemplazar;
            }


        }






    }




}

