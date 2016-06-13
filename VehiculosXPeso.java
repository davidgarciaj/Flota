
/**
 * Write a description of class VehiculosXPeso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculosXPeso extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int peso;

    /**
     * Constructor for objects of class VehiculosXPeso
     */
    public VehiculosXPeso(Marca marca, int antiguedad, int kilometros, int peso)
    {
        super(marca, antiguedad, kilometros);
        this.peso = peso;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getPeso()
    {
        return peso;
    }
}
