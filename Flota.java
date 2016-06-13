import java.util.ArrayList;

/**
 * Write a description of class Flota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flota
{
    private ArrayList<Vehiculo> vehiculos;

    /**
     * Constructor for objects of class Flota
     */
    public Flota()
    {
        // initialise instance variables
        vehiculos = new ArrayList<>();
    }

    /**
     * 
     * @return     an vehiculo in the position pos
     */
    public Vehiculo getVehiculo(int pos)
    {
        return vehiculos.get(pos);
    }

    public boolean addVehiculo(Vehiculo vehiculo){
        return vehiculos.add(vehiculo);
    }

    public boolean removeVehiculo(int id){
        int i = 0;
        Vehiculo vehiculo = null;
        boolean notFind = true;
        while(i < vehiculos.size() && notFind){
            if(vehiculos.get(i).getId() == id){
                vehiculo = vehiculos.get(i);
                notFind = false;
            }
        }
        return vehiculos.remove(vehiculo);
    }

    public Marca marcaMayoritaria(){
        Marca marca = null;
        if(Vehiculo.numVehiculosFiat < Vehiculo.numVehiculosFord){
            if(Vehiculo.numVehiculosFord < Vehiculo.numVehiculosOpel){
                if(Vehiculo.numVehiculosOpel < Vehiculo.numVehiculosCitroen)
                    marca = Marca.CITROEN;
                else
                if(Vehiculo.numVehiculosOpel != Vehiculo.numVehiculosCitroen)
                    marca = Marca.OPEL;
            }
            else{
                if(Vehiculo.numVehiculosFord < Vehiculo.numVehiculosCitroen)
                    marca = Marca.CITROEN;
                else
                if(Vehiculo.numVehiculosFord != Vehiculo.numVehiculosCitroen)
                    marca = Marca.FORD;
            }
        }
        else{
            if(Vehiculo.numVehiculosFiat < Vehiculo.numVehiculosOpel){
                if(Vehiculo.numVehiculosOpel < Vehiculo.numVehiculosCitroen)
                    marca = Marca.CITROEN;
                else
                if(Vehiculo.numVehiculosOpel != Vehiculo.numVehiculosCitroen)
                    marca = Marca.OPEL;
            }
            else{
                if(Vehiculo.numVehiculosFiat < Vehiculo.numVehiculosCitroen)
                    marca = Marca.CITROEN;
                else
                if(Vehiculo.numVehiculosFiat != Vehiculo.numVehiculosCitroen)
                    marca = Marca.FIAT;
            }
        }
        return marca;
    }

    public boolean cumplenMedidas(){
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo instanceof MedidasDeSeguridad){
                MedidasDeSeguridad ve = (MedidasDeSeguridad) vehiculo;
                if(!ve.cumpleMedidas())
                    return false;
            }
        }
        return true;
    }

    public int[] getDatosVehiculo(int id){
        int[] datos = null;
        int i = 0;
        Vehiculo vehiculo = null;
        boolean notFind = true;
        while(i < vehiculos.size() && notFind){
            if(vehiculos.get(i).getId() == id){
                vehiculo = vehiculos.get(i);
                notFind = false;
            }
        }
        if(vehiculo != null){
            if(vehiculo instanceof Coche){
                datos = new int[5];
                datos[4] = ((Coche)vehiculo).aniosXRevision();
            }
            else
                datos = new int[4];            
            datos[0] = vehiculo.getId();
            datos[1] = vehiculo.getAntiguedad();
            datos[2] = vehiculo.getKilometraje();
            if(vehiculo instanceof VehiculosXPlazas)
                datos[3] = ((VehiculosXPlazas)vehiculo).getPlazas();
            else if (vehiculo instanceof VehiculosXPeso)
                datos[3] = ((VehiculosXPeso)vehiculo).getPeso();            
        }
        return datos;
    }
}
