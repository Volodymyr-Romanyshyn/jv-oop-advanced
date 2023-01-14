package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(Color color, int sideA, int sideB) {
        super(color);
        this.sideA = getRandom().nextInt(Max_Value);
        this.sideB = getRandom().nextInt(Max_Value);
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "sideA: " + sideA + " units" +
                ", sideB: " + sideB + " units" +
                ", color: " + color +
                ", area: " + getArea() + " sq.units" +
                '}';
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
