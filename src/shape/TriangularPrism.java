package shape;

public class TriangularPrism extends Shapes {
    
    private double side;

    public TriangularPrism(double side, double height) {
        super(height);
        this.side = side;
    }
    
    @Override
    public double getcalcVolume() {
        return getcalcBaseArea() * height;  //Volume = Ah
    }
    @Override
    public double getcalcBaseArea() {
        return (Math.pow(side, 2) * Math.sqrt(3)) /4; // BaseArea A= s^2√3/4
    }      
}
