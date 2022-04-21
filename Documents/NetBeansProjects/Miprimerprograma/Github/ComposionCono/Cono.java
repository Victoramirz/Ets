package ETS.Github.ComposionCono;

/**
 * 
 */
public class Cono {
    private Circulo base;
    private float altura;
    private String color;
    /**
     * 
     * @param cX dirrecion en x
     * @param cY dirrecion en y
     * @param r radio
     * @param h altura
     * @param color color
     */ 
    public Cono (float cX, float cY, float r, float h, String color) { // constructor
    this.base = new Circulo(cX, cY, r);
    this.altura = h;
    this.color = color;
    } 
    /**
     * 
     * @return se retorna la base
     */
    public Circulo getBase() {
    return base;
    }
    /**
     * 
     * @param base este atributo es la base del cono es decir el circulo
     */
    public void setBase(Circulo base) {
    this.base = base;
    }
    /**
     * 
     * @return se retorna la altura
     */
    public float getAltura() {
    return altura;
    }
    /**
     * 
     * @param altura este atributo es la altura del cono
     */
    public void setAltura(float altura) {
    this.altura = altura;
    }
    /**
     * 
     * @return se retorna el color
     */
    public String getColor() {
    return color;
    }
    /**
     * 
     * @param color este atributo es el color del cono
     */
    public void setColor(String color) {
    this.color = color;
    }
    /**
    * @see imprimir Es el encargado de mostrar el resultado
    */
    public void imprimir () {
        base.imprimir();
        System.out.println(" h=" + altura + " c=" + color);
        }
    }
