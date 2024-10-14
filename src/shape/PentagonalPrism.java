package shape;

public class PentagonalPrism extends Shapes {
    
    private double side;

    public PentagonalPrism(double side, double height) {
        super(height);
        this.side = side;
    }
    
    @Override
    public double getcalcVolume() {
        return getcalcBaseArea() * height;  //Volume = Ah
    }
    @Override
    public double getcalcBaseArea() {
        return (5 * Math.pow(side, 2) * Math.tan(Math.toRadians(54))) /4; // BaseArea A= 5s^2tan(54 degree)/4
    }       
}
