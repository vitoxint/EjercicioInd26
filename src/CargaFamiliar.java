public class CargaFamiliar {

    private String run; // run de la carga familiar
    private String nombres;
    private String apellidos;
    private String run_familiar; // del trabajador representado
    private int parentesco;
    private int edad; // 1 conyuge ,  2 hijo ,  3 otro

    public CargaFamiliar(String run_familiar) {
        this.run_familiar = run_familiar;
    }

    public CargaFamiliar(String run, String nombres, String apellidos, String run_familiar, int parentesco, int edad) {
        this.run = run;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run_familiar = run_familiar;
        this.parentesco = parentesco;
        this.edad = edad;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
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

    public String getRun_familiar() {
        return run_familiar;
    }

    public void setRun_familiar(String run_familiar) {
        this.run_familiar = run_familiar;
    }

    public int getParentesco() {
        return parentesco;
    }

    public void setParentesco(int parentesco) {
        this.parentesco = parentesco;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "CargaFamiliar{" +
                "run='" + run + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", run_familiar='" + run_familiar + '\'' +
                ", parentesco=" + parentesco +
                ", edad=" + edad +
                '}';
    }
}
