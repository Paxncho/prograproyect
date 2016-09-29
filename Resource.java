public class Resource
{
    private String id;
    private String spriteId;
    private Point point;
    private int width;
    private int height;
    private int rotationAngle;
    private String tag;
    
    public Resource(String id, String spriteId, int x, int y, int width, int height, int rotationAngle, String tag){
        this.id = id;
        this.spriteId = spriteId;
        this.point = new Point(x, y);
        this.width = width;
        this.height = height;
        this.rotationAngle = rotationAngle;
        this.tag = tag;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setSpriteId(String spriteId){
        this.spriteId = spriteId;
    }
    
    public String getSpriteId(){
        return this.spriteId;
    }
    
    public void setX(int x){
        this.point.setX(x);
    }
    
    public int getX(){
        return this.point.getX();
    }
    
    public void setY(int y){
        this.point.setY(y);
    }
    
    public int getY(){
        return this.point.getY();
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
    
    public void setRotationAngle(int rotationAngle){
        this.rotationAngle = rotationAngle;
    }
    
    public int getRotationAngle(){
        return this.rotationAngle;
    }
    
    public void setTag(String tag){
        this.tag = tag;
    }
    
    public String getTag(){
        return this.tag;
    }
    
    /*    
    HashMap<k,v>
    poligonos.put(e1, p1);
    Poligono p = poligonos.get(e1);
    
    Map
    x ---> y
    "Ignacio" ---> Regalo
    */
    
}
