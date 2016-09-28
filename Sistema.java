import java.util.ArrayList;

public class Sistema
{
    private ArrayList<Escena> scenes;

    public Sistema()
    {
        this.scenes = new ArrayList<Escena>();
    }

    public void agregarEscena(Escena escena){
        this.scenes.add(escena);
    }
    
    public void eliminarEscena(String name){
        for(Escena existente : this.scenes){
            if(existente.getName() == name){
                this.scenes.remove(existente);
            }
        }
    }
    
    public int cantidadEscenas(){
        return this.scenes.size();
    }
    
    public Escena obtenerEscena(String name){
        for(Escena existente : this.scenes){
            if(existente.getName() == name){
                return existente;
            }
        }
        return null;
    }
}
