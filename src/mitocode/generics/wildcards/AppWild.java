package mitocode.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

/* Clase que imprime una lista de Alumnos.
*/

public class AppWild {

    //Método que recibe una lista de alumnos, la recorre e imprime el nombre.
    public void getList(List<Alumno> alumnoList) {
        for (Alumno alumno : alumnoList) {
            System.out.println(alumno.getName());
        }

    }

    public static void main(String[] args) {

        AppWild appWild = new AppWild();

        Alumno alumno1 = new Alumno("Angela");
        Alumno alumno2 = new Alumno("Maria");
        Alumno alumno3 = new Alumno("Gomez");

        List<Alumno> list = new ArrayList<>();
        list.add(alumno1);
        list.add(alumno2);
        list.add(alumno3);

        appWild.getList(list);

    }
}
