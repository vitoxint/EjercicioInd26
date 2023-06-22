public class Trabajador {

    private String nombres;
    private String apellidos;
    private String run; // se debe almacenar con guión
    private String telefono;
    private int edad;

    public Trabajador() {
    }

    public Trabajador(String nombres, String apellidos, String run, String telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", run='" + run + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }

    public String nombreCompleto(){
        return this.nombres + " " + this.apellidos;
    }

    public int descomponerRun(){
        // se parte el texto antes de encontrar un guión y se toma el primer elemento que resulta el run antes del guión y luego se retorna convertido en número entero
        return Integer.valueOf( this.run.split("-")[0] ) ;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
