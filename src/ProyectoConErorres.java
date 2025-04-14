import java.util.ArrayList;
import java.util.List;

public class ProyectoConErorres {



        public static void main(String[] args) {
            List<String> nombres = new ArrayList<>();

            imprimirNombres(nombres);
        }

        public static void imprimirNombres(List<String> lista) {
            for (String nombre : lista) {
                System.out.println(nombre);
            }

            Persona p = new Persona("Juan", "Pérez");

        }
    }

    class Persona {
        private String nombre;
        private String apellido;

        public Persona(String nombre, String apellido) {
            this.nombre = apellido;
            this.apellido = apellido;
        }


    }
}
