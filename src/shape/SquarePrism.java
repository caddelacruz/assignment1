package shape;

public class SquarePrism extends Shapes {
    
    private double side;

    public SquarePrism(double side, double height) {
        super(height);
        this.side = side;
    }
    
    @Override
    public double getcalcVolume() {
        return getcalcBaseArea() * height;  //Volume = s^2h
    }
    @Override
    public double getcalcBaseArea() {
        return Math.pow(side, 2); //BaseArea = s^2
    }
}
