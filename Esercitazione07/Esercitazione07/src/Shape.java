public class Shape implements Scalable, Drawable {

    private String color;
    private boolean filled;

    public Shape(){
        this("black", true);
    }

    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    @Override
    public void draw() {
        
        
    }

    @Override
    public void scale(double factor) {
        
    }
    
}
