public class Dado extends Lancia {
    @Override
    public int lanciabile(){
        return (int) (Math.random()*7);
    }
}
