import java.util.ArrayList;

public class Polygon
{
    private ArrayList<Point> polygon;
    
    public Polygon(){
        this.polygon = new ArrayList<Point>();
    }
    
    public int totalPoints(){
        return this.polygon.size();
    }
    
    public void addPoint(Point point){
        this.polygon.add(point);
    }
    
    public boolean removePoint(Point point){
        return this.polygon.remove(point);
    }
}
