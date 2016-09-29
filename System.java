import java.util.ArrayList;

public class System
{
    private ArrayList<Scene> scenes;

    public System()
    {
        this.scenes = new ArrayList<Scene>();
    }

    public void addScene(Scene scene){
        this.scenes.add(scene);
    }
    
    public void removeScene(String name){
        for(Scene existent : this.scenes){
            if(existent.getName() == name){
                this.scenes.remove(existent);
            }
        }
    }
    
    public int totalScenes(){
        return this.scenes.size();
    }
    
    public Scene getScene(String name){
        for(Scene existent : this.scenes){
            if(existent.getName() == name){
                return existent;
            }
        }
        return null;
    }
}
