package shape;

public class Pyramid extends Shapes {
    
    private double side;

    public Pyramid(double side, double height) {
        super(height);
        this.side = side;
    }
    
    @Override
    public double getcalcVolume() {
        return (1/3) * getcalcBaseArea() * height;  //Volume=1/3s^2h
    }
    @Override
    public double getcalcBaseArea() {
        return Math.pow(side, 2); // BaseArea = s^2
    }
}
