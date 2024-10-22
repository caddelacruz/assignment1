package shape;

public abstract class Shapes implements Comparable<Shapes>{
    double height;

    public Shapes(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    
    public abstract double getcalcVolume();
    public abstract double getcalcBaseArea();
    
    
    @Override
    public int compareTo(Shapes other) {
        if (this.getHeight() > other.getHeight())
            return 1;
        else if (this.getHeight() < other.getHeight())
            return -1;
        else
            return 0;
    }
}
