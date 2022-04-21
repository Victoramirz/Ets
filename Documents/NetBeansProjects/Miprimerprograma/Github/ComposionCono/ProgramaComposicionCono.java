package ETS.Github.ComposionCono;

public class ProgramaComposicionCono {
    /**
     * @see datos La variable datos es la encarga de recibir el texto y de ser mostrado por pantalla
     * 
     */
    private static void imprimir (Object datos) {
    System.out.println(datos);
    }
    /**
     *
     * @param args En este metodo creamos el radio apartir de aletario ademas de crear el meto cono, que posteriormente se mostrara
     * @see aleatorio Este atributo genera un numero aleatorio
     */ 
    public static void main (String[] args) {
    java.util.Random aleatorio = new java.util.Random();
        for (int i=1; i<=5; i++) {
            int radio = aleatorio.nextInt(9)+1;
            Cono cono = new Cono(0, 0, radio, i, "Azul");
            cono.imprimir();
        }
    } 
}