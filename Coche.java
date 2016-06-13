
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche extends VehiculosXPlazas implements MedidasDeSeguridad
{
    /**
     * Constructor for objects of class Coche
     */
    public Coche(Marca marca, int antiguedad, int kilometros, int plazas)
    {
        super(marca, antiguedad, kilometros, plazas);
    }
    
    public int aniosXRevision(){
        return (getMarca() == Marca.FORD) ?2 : 1;
    }
    
    public boolean cumpleMedidas(){
        return (getPlazas() <= SEGURIDAD_COCHE) ?true :false;
    }
}
