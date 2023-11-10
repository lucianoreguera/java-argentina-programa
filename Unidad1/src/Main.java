public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno(1, "Juan");
        Materia algoritmos = new Materia(1, "Algoritmos");
        Materia paradigmas = new Materia(2, "Paradigmas de Programación");
        Materia diseñoSistemas = new Materia(3, "Diseño de Sistemas");

        algoritmos.agregarCorrelativa(paradigmas);
        paradigmas.agregarCorrelativa(diseñoSistemas);

        Inscripcion inscripcionAlgoritmos = alumno.inscribir(algoritmos);
        Inscripcion inscripcionParadigmas = alumno.inscribir(paradigmas);
        Inscripcion inscripcionDiseñoSistemas = alumno.inscribir(diseñoSistemas);

        System.out.println("¿Algoritmos aprobada? " + inscripcionAlgoritmos.aprobada());
        System.out.println("¿Paradigmas aprobada? " + inscripcionParadigmas.aprobada());
        System.out.println("¿Diseño de Sistemas aprobada? " + inscripcionDiseñoSistemas.aprobada());
    }
}