package shape;

public class Cone extends Shapes {
    
    private double radius;

    public Cone(double radius, double height) {
        super(height);
        this.radius = radius;
    }
    
    @Override
    public double getcalcVolume() {
        return (1/3) * getcalcBaseArea() * height;  //Volume= 1/3𝜋r^2h
    }
    @Override
    public double getcalcBaseArea() {
        return Math.PI * Math.pow(radius, 2); // BaseArea = 𝜋r^2
    }
}
