public class Circle {
    private double radius;

    public Circle() {
        this(Math.PI);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(Circle copy) {
        this.radius = copy.radius;
    }

    @Override
    public String toString() {
        return String.format("Circle[radius=%.2f]", radius);
    }

    public boolean equals(Circle rhs) {
        return radius == rhs.radius;
    }

    // or, preferred:

    @Override
    public boolean equals(Object rhs) {
        return rhs == this
                || rhs instanceof Circle circle && radius == circle.radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }}

    Circle[] circles = new Circle[10];

    for(
    int i = 0;i<circles.length;i++)
    {
        circles[i] = new Circle(i + 1);
    }

    for(
    Circle circle:circles)
    {
    System.out.println(circle.getArea());
}
