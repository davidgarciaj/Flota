
/**
 * Abstract class Vehiculo - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Vehiculo
{
    public static int numVehiculos;    
    public static int numVehiculosFiat;
    public static int numVehiculosFord;
    public static int numVehiculosOpel;
    public static int numVehiculosCitroen;
    private Marca marca;
    private int antiguedad;
    private int kilometraje;
    private int id;
    
    static{
        numVehiculos = -1;
        numVehiculosFiat = 0;
        numVehiculosFord = 0;
        numVehiculosOpel = 0;
        numVehiculosCitroen = 0;
    }
    
    public Vehiculo(Marca marca, int antiguedad, int kilometros){
        numVehiculos++;
        id = numVehiculos;
        if(marca == Marca.FIAT)
            numVehiculosFiat++;
        else if(marca == Marca.FORD)
            numVehiculosFord++;
        else if(marca == Marca.OPEL)
            numVehiculosOpel++;
        else if(marca == Marca.CITROEN)
            numVehiculosCitroen++;
        this.marca = marca;
        this.antiguedad = antiguedad;
        this.kilometraje = kilometros;
    }

    /**
     * 
     * @return        id of the vehiculo 
     */
    public int getId()
    {
        return id;
    }

    /**
     * 
     * @return        marca of the vehiculo 
     */
    public Marca getMarca()
    {
        return marca;
    }

    /**
     * 
     * @return        antiguedad of the vehiculo 
     */
    public int getAntiguedad()
    {
        return antiguedad;
    }

    /**
     * 
     * @return        kilometraje of the vehiculo 
     */
    public int getKilometraje()
    {
        return kilometraje;
    }
}
