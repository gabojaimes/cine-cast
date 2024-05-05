import modelo.Pelicula;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Pelicula matrix = new Pelicula();

            matrix.setNombre("MATRIX");
            matrix.setEvaluacion(5.0);
            matrix.setFechaDELanzamiento(1999);
            matrix.setIncluidoEnElPlanBasico(true);
            matrix.setSinopsis("EL FUTURO");
            matrix.setTiempoDuracionEnMinutos(123);

            matrix.muestraFichaPelicula();
            }


        }

