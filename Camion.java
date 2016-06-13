
/**
 * Write a description of class Camion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camion extends VehiculosXPeso implements MedidasDeSeguridad
{

    /**
     * Constructor for objects of class Camion
     */
    public Camion(Marca marca, int antiguedad, int kilometros, int peso)
    {
        super(marca, antiguedad, kilometros, peso);
    }
    
    public boolean articulado(){
        return (getMarca() == Marca.FORD || getMarca() == Marca.FIAT) ?true :false;
    }
    
    public boolean cumpleMedidas(){
        boolean cumple;
        if(articulado())
            cumple = (getPeso() <= SEGURIDAD_CAMION_NO_ARTICULADO) ?true :false;
        else
            cumple = (getPeso()  <= SEGURIDAD_CAMION_ARTICULADO) ?true :false;
        return cumple;
    }
}
