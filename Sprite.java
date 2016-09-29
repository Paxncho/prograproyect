public class Sprite
{
    private String id;
    private String path;
    private int width;
    private int height;
    private Type type;
    
    public Sprite(String id, String path, int width, int height, Type type){
        this.id = id;
        this.path = path;
        this.width = width;
        this.height = height;
        this.type = type;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setPath(String path){
        this.path = path;
    }
    
    public String getPath(){
        return this.path;
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
    
    public void setType(Type type){
        this.type = type;
    }
    
    public Type getType(){
        return this.type;
    }
}
