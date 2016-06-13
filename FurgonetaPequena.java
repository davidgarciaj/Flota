
/**
 * Write a description of class FurgonetaP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaPequena extends VehiculosXPlazas implements MedidasDeSeguridad
{
    /**
     * Constructor for objects of class FurgonetaP
     */
    public FurgonetaPequena(Marca marca, int antiguedad, int kilometros, int plazas)
    {
        super(marca, antiguedad, kilometros, plazas);
    }
    
    public boolean cumpleMedidas(){
        return (getPlazas() <= SEGURIDAD_FURGO) ?true :false;
    }
}
