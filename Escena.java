import java.util.ArrayList;

public class Escena
{
    private String name;
    private int width;
    private int height;
    private ArrayList<Recurso> resources;
    
    public Escena(String name, int width, int height){
        this.name = name;
        this.width = width;
        this.height = height;
        this.resources = new ArrayList<Recurso>();
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setWidth(int width){
        this.width = width;
    }
    
    public int getWidth(){
        return this.width;
    }
    
    public void setHeight(int height){
        this.height = height;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public void agregarRecurso(Recurso recurso){
        this.resources.add(recurso);
    }
    
    public void eliminarRecurso(int index){
        this.resources.remove(index);
    }
    
    public int cantidadRecursos(){
        return this.resources.size();
    }
    
    public Recurso obtenerRecurso(int index){
        return this.resources.get(index);
    }
}
