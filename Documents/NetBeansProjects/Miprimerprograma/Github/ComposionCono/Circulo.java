package ETS.Github.ComposionCono;
/**
 * @see x c
 * @see y dirrecion y
 * @see radio
 * @see cX dirrecion x del circulo  
 * @see r  radio del circulo
 * @see cY dirrecion x del circulo
 */
public class Circulo {
    private float x, y;
    private float radio;
    public Circulo (float cX, float cY, float r) { // constructor
    this.x = cX;
    this.y = cY;
    this.radio = r;
}  
/**
 * @return retorna x
 */
public float getX() { return x; }
/**
 * @param x dirrecion x
 */
public void setX(float x) { this.x = x; }
/**
 * 
 * @return retorna y
 */
public float getY() { return y; }
/**
 * 
 * @param y dirrecion y
 */
public void setY(float y) { this.y = y; }
/**
 * 
 * @return retorna radio
 */
public float getRadio() { return radio; }
/**
 * 
 * @param radio este atributo es el radio del circulo
 */
public void setRadio(float radio) { this.radio = radio; }
/**
 * 
 * @return calcula el area y la retorna
 */
public float area() { return (float)Math.PI*radio*radio; }
/**
 * @see imprimir Este metodo es el encargado de mostrar los datos por pantalla
 * @see A Este atributo es el area
 */
public void imprimir () {
    System.out.print(" x=" + x);
    System.out.print(" y=" + y);
    System.out.print(" r=" + radio);
    System.out.print(" A=" + area());
    }
}
