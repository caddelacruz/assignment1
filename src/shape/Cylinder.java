package shape;

public class Cylinder extends Shapes {
    
    private double radius;

    public Cylinder(double radius, double height) {
        super(height);
        this.radius = radius;
    }
    
    @Override
    public double getcalcVolume() {
        return getcalcBaseArea() * height;  //Volume=𝜋r^2h
    }
    @Override
    public double getcalcBaseArea() {
        return Math.PI * Math.pow(radius, 2); // BaseArea = 𝜋r^2
    }
}
