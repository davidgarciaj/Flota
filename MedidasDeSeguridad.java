
/**
 * Write a description of interface MedidasDeSeguridad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface MedidasDeSeguridad
{
    public static final int SEGURIDAD_COCHE = 5;
    public static final int SEGURIDAD_FURGO = 7;
    public static final int SEGURIDAD_CAMION_NO_ARTICULADO = 2000;
    public static final int SEGURIDAD_CAMION_ARTICULADO = 3000;
    
    /**
     * 
     * @return        the result produced by sampleMethod 
     */
    boolean cumpleMedidas();
}
