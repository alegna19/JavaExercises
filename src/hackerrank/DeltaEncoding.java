package hackerrank;

/*
1. Se tiene una lista de números y se debe sacar la diferencia de la resta entre el primer número de la lista con el segundo.
Ejemplo: 25626 - 25757 = -131 ese valor se debe cargar a una nueva lista para luego imprimir las diferencias.
2. si las diferencias(Delta) estan son mayores a 127 y menores o menores a -127 se debe agregar a la lista el número -128.
 */

public class DeltaEncoding {
    public static void main(String[] args) {
        int newLength = 0;
        int array[] = {25626,25757,24367, 24267};
        int length = array.length;
        newLength = length;
        int newArray[] = new int[length];

        newArray[0] = array[0];
        System.out.println(newArray[0]);
        for (int i = 0; i <length -1; i++) {
            int value = array[i + 1] - array[i];
            if(value > 127 || value < -127){
                newLength++;
            }
            System.out.println(value);
            newArray[i] = value;
        }

        System.out.println("+++++++ new leng"+ newLength);
        int otherArray[] = new int[newLength];
        otherArray[0] = array[0];
        int j = 1;
        System.out.println(otherArray[0]);
        for (int i = 0; i <length; i++) {
            if(newArray[i] > 127 || newArray[i] < -127){
                otherArray[j] = -128;
                System.out.println(otherArray[j]);
                j++;

            }
            if(j < otherArray.length){
                otherArray[j] = newArray[i];
                j++;
            }

        }
    }
}
