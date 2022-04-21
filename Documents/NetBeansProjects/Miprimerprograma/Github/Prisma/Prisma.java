package ETS.Github.Prisma;

public class Prisma {
    int baseTriangulo;int alturaPrisma;
    public Prisma(){
        baseTriangulo=0;
        alturaPrisma=0;
    }
    
    /** 
     * @return int para poner obtener desde el main el dato
     */
    public int getAlturaPrisma() {
        return alturaPrisma;
    }
    
    /** 
     * @return int para poner obtener desde el main el dato
     */
    public int getBaseTriangulo() { 
        return baseTriangulo;
    }
    
    /** 
     * @param alturaPrisma para poner almacenar procedente el main
     */
    public void setAlturaPrisma(int alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }
    
    /** 
     * @param baseTriangulo para poner almacenar procedente el main
     */
    public void setBaseTriangulo(int baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }
    
    /** 
     * @return float calculo la altura del triangulo 
     */
    public float alturaTriangulo () {
        float altura=(float) ((Math.sqrt(3)/2)*baseTriangulo);//Math.sqrt()=raiz cuadrada;
        return altura;
    }
    
    /** 
     * @return float calculo el perimetro de la base
     */
    public float perimetro () {
        float perimetro=3*baseTriangulo;
        return perimetro;
    }
    
    /** 
     * @return float calculo el area la base
     */
    public float areaBase () {
        float areabase=((baseTriangulo*alturaTriangulo())/2);
        return areabase;
    }
    
    /** 
     * @return float calculo el area lateral
     */
    public float areaLateral () {
        float arealateral=(perimetro()*alturaPrisma);
        return arealateral;
    }
    
    /** 
     * @return float calculo el area totalz
     */
    public float areaTotal () {
        float areatotal=2*areaBase()+areaLateral();
        return areatotal;
    }
}
