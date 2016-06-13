
/**
 * Write a description of class VehiculosXPlazas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculosXPlazas extends Vehiculo
{
    private int plazas;

    /**
     * Constructor for objects of class VehiculosXPlazas
     */
    public VehiculosXPlazas(Marca marca, int antiguedad, int kilometros, int plazas)
    {
        super(marca, antiguedad, kilometros);
        this.plazas = plazas;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getPlazas()
    {
        return plazas;
    }
}
