package ETS.Github.Prisma;

public class mayoramenor {
    
    /** 
     * @param prisma1 Aqui prisma1 es el area total del prisma que menciona su nombre
     * @param prisma2 Aqui prisma2 es el area total del prisma que menciona su nombre
     * @param prisma3 Aqui prisma3 es el area total del prisma que menciona su nombre
     * @see Ordenar El metodo Ordenar se encarga de ordenar por de mayor a menor el area total de los prisma y los imprime por pantalla
     */
    public static void Ordenar(float prisma1, float prisma2, float prisma3){
        Imprimir.imprimir("Ordenamos de Mayor a Menor");
        if (prisma1>prisma2&&prisma1>prisma3) {
            Imprimir.imprimir("-Prisma1="+prisma1);
            if(prisma2>prisma3){
                Imprimir.imprimir("-Prisma2="+prisma2);
                Imprimir.imprimir("-Prisma3="+prisma3);
            }else{
                Imprimir.imprimir("-Prisma3="+prisma3);
                Imprimir.imprimir("-Prisma2="+prisma2);
            } 
        } else {
            if(prisma2>prisma1&&prisma2>prisma3){
                Imprimir.imprimir("-Prisma2="+prisma2);
                if(prisma1>prisma3){
                    Imprimir.imprimir("-Prisma1="+prisma1);
                    Imprimir.imprimir("-Prisma3="+prisma3);
                }else{
                    Imprimir.imprimir("-Prisma3="+prisma3);
                    Imprimir.imprimir("-Prisma1="+prisma1);
                }
            }else{
                Imprimir.imprimir("-Prisma3="+prisma3);
                if(prisma1>prisma2){
                    Imprimir.imprimir("-Prisma1="+prisma1);
                    Imprimir.imprimir("-Prisma2="+prisma2);
                }else{
                    Imprimir.imprimir("-Prisma2="+prisma2);
                    Imprimir.imprimir("-Prisma1="+prisma1);
                }
            }
        }
    }
}
