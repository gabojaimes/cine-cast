import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

                System.out.println("Bienvenidos a curso JAVA");
                //  System.out.println("PELICULA NARANJA MECANICA");

                int fechaDeLanzamiento = 1999 ;
                double evaluacion = 4.5;
                boolean incluido_sucripcion = true;

                String nombre = "MATRIX";

                System.out.println("titulo: "+nombre);
                System.out.println("Fecha Rodaje: "+fechaDeLanzamiento);
                System.out.println("Calificacion: "+evaluacion);
                System.out.println("Se incluye el contenido en tu suscripcion: "+ incluido_sucripcion);

                double mediaEvaluacionUsuario = 0 ;
                System.out.println("Calificacion Media de "+nombre+" "+mediaEvaluacionUsuario);

                if(fechaDeLanzamiento != 2023){
                    System.out.println("Pelicula Reciente :D");

                }else{
                    System.out.println("PELICULA RETRO QUE VALE LA EPENA VER ;");
                }

                for( int i=0; i<3; i++){

                    Scanner teclado = new Scanner(System.in);
                    System.out.println("Ingrese su calificacion de cine: ");
                    double notaMatrix = teclado.nextDouble();
                    mediaEvaluacionUsuario = mediaEvaluacionUsuario +notaMatrix;

                }
                System.out.println("la calificacion media de la pelicula  MATRIX"+
                        "calculada por el usuario es: " +mediaEvaluacionUsuario/3);
            }


        }

