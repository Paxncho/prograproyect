import java.util.ArrayList;

public class World
{
    private ArrayList<Scene> scenes;

    public World()
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
