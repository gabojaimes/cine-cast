package modelo;

public class Titulo {
    private String nombre;
    private int fechaDELanzamiento;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;
    private String sinopsis;
    private int tiempoDuracionEnMinutos;

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDELanzamiento() {
        return fechaDELanzamiento;
    }

    public void setFechaDELanzamiento(int fechaDELanzamiento) {
        this.fechaDELanzamiento = fechaDELanzamiento;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public int getTiempoDuracionEnMinutos() {
        return tiempoDuracionEnMinutos;
    }

    public void setTiempoDuracionEnMinutos(int tiempoDuracionEnMinutos) {
        this.tiempoDuracionEnMinutos = tiempoDuracionEnMinutos;
    }

    public void muestraFichaPelicula() {
        System.out.println("FICHA PELICULA");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha: " + fechaDELanzamiento);
        System.out.println("Evaluacion: " + evaluacion);
        System.out.println("IncluidoEnElPlanBasico: " + incluidoEnElPlanBasico);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Duracion: " + tiempoDuracionEnMinutos);

    }

}
