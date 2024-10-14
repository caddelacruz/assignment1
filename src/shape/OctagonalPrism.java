package shape;

public class OctagonalPrism extends Shapes {
    
    private double side;

    public OctagonalPrism(double side, double height) {
        super(height);
        this.side = side;
    }
    
    @Override
    public double getcalcVolume() {
        return getcalcBaseArea() * height;  //Volume = Ah
    }
    @Override
    public double getcalcBaseArea() {
        return 2 *(1 + Math.sqrt(2)) * Math.pow(side, 2); //BaseArea A = 2(1+√2)s^2
    }
}
