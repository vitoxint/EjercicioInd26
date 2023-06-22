public class Main {
    public static void main(String[] args) {

        Trabajador uno = new Trabajador("Victor Manuel" , "Rivas Monsalves" , "16763029-4" , "898984356" ,33);


        Trabajador dos = new Trabajador("Maria Angelica" , "Fuentes Ruiz" , "19854324-9" , "658974566" ,29);


        Trabajador tres = new Trabajador("Carlos Alberto" , "Molina Contreras" , "14865447-8" , "856422399" ,46);


        System.out.println("*** LISTA DE TRABAJADORES ***");

        System.out.println("\nTrabajador 1");

        System.out.println(uno.descomponerRun());
        System.out.println(uno.nombreCompleto());
        System.out.println(uno.toString());

        System.out.println("\nTrabajador 2");

        System.out.println(dos.descomponerRun());
        System.out.println(dos.nombreCompleto());
        System.out.println(dos.toString());

        System.out.println("\nTrabajador 3");

        System.out.println(tres.descomponerRun());
        System.out.println(tres.nombreCompleto());
        System.out.println(tres.toString());





    }
}