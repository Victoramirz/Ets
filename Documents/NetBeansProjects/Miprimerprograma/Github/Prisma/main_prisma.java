package ETS.Github.Prisma;

public class main_prisma {
    /**
     * @see cont El contador es para poder ahorrar codigo a la hora de mostrar al usuario final 
     * Main principal donde creo el titulo,los prismas,hago que pasen los prismas por un metodo operaciones con un contador para saber que prisma y por ultimo mando a ordenar las areas
     */
    public static void main(String[] args) {
        Imprimir.imprimir("-----------------------------------------------------------------------");
        Imprimir.imprimir("-----------------------------------------------------------------------");
        Imprimir.imprimir("                    CREACION DE OBJECTO PRISMA");
        Imprimir.imprimir("-----------------------------------------------------------------------");
        Imprimir.imprimir("-----------------------------------------------------------------------");
        Prisma prisma1= new Prisma();
        Prisma prisma2= new Prisma();
        Prisma prisma3= new Prisma();
        int cont=0;
        Operaciones(prisma1,cont);
        Operaciones(prisma2,cont); 
        Operaciones(prisma3,cont);
        Imprimir.imprimir("-----------------------------------------------------------------------");
        Imprimir.imprimir("-----------------------------------------------------------------------");
        mayoramenor.Ordenar(prisma1.areaTotal(),prisma2.areaTotal(),prisma3.areaTotal());
    }
    /**
     * 
     * @param prisma Es el resultado prisma que nos manda el prisma principal
     * @see basetriangulo Estamos llamando al metodo Math.random para generar un numero random el cual va a tener esta variable y posteriormente le mandamos ese dato al Prisma.java
     * @see alturaprisma Estamos llamando al metodo Math.random para generar un numero random el cual va a tener esta variable y posteriormente le mandamos ese dato al Prisma.java
     */
    private static void Operaciones(Prisma prisma, int cont) {
        int basetriangulo=(int)(Math.random()*50);
        int alturaprisma=(int)(Math.random()*50);
        prisma.setBaseTriangulo(basetriangulo);
        prisma.setAlturaPrisma(alturaprisma);
        cont++;
        Interfaz(prisma,cont);
    }
    
    /** 
     * @param prisma Es el resultado prisma que nos manda el prisma principal
     * @param cont El contador es para poder ahorrar codigo a la hora de mostrar al usuario final
     * @see Imprimir Esta clase se encarga de mandar imprimir por pantalla el contenido del parentesis
     */
    private static void Interfaz(Prisma prisma,int cont) {
        Imprimir.imprimir("-----------------------------------------------------------------------");
        Imprimir.imprimir("Creado el objeto Prisma"+cont+" con:");
        Imprimir.imprimir("La base del triangulo es de: "+prisma.getBaseTriangulo());
        Imprimir.imprimir("La altura del prisma es de: "+prisma.getAlturaPrisma());
        Imprimir.imprimir("El area total del prima es de: "+String.valueOf(prisma.areaTotal()));
    }
}
