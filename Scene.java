import java.util.ArrayList;
import java.util.HashMap;

public class Scene
{
    private String name;
    private int width;
    private int height;
    private ArrayList<Resource> resources;
    private HashMap<Resource, Polygon> polygons;
    
    public Scene(String name, int width, int height){
        this.name = name;
        this.width = width;
        this.height = height;
        this.resources = new ArrayList<Resource>();
        this.polygons = new HashMap<Resource, Polygon>();
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
    
    public void addResource(Resource resource){
        this.resources.add(resource);
    }
    
    public void removeResource(String id){
        for(Resource existent : this.resources){
            if(existent.getId() == id){
                this.resources.remove(existent);
            }
        }
    }
    
    public int totalResources(){
        return this.resources.size();
    }
    
    public Resource getResource(String id){
        for(Resource existent : this.resources){
            if(existent.getId() == id){
                return existent;
            }
        }
        return null;
    }
    
    public void addPolygon(Resource resource, Polygon polygon){
        this.polygons.put(resource, polygon);
    }
    
    public boolean hasPolygon(Resource resource){
        if (polygons.get(resource) != null){
            return true;
        }
        return false;
    }
    
    //Creo que esto puede dar excepción, analizar.
    public void replacePolygon(Resource resource, Polygon polygon){
        this.polygons.replace(resource, polygon);
    }
}
