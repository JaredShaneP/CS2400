public class Circle {
    private double radius;

    public Circle() {
        this(Math.PI);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(Circle copy) {
        if (copy != null) {
            this.radius = copy.radius;
        }
    }

    @Override
    public String toString() {
        return String.format("Circle[radius=%.2f]", radius);
    }

    public boolean equals(Circle rhs) {
        return this == rhs || (rhs != null && radius == rhs.radius);
    }

    // Preferred:
    @Override
    public boolean equals(Object rhs) {
        if (rhs == this) {
            return true;
        }
        if (rhs instanceof Circle) {
            Circle circle = (Circle) rhs;
            return radius == circle.radius;
        }
        return false;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle[] circles = new Circle[10];

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i + 1);
        }

        for (Circle circle : circles) {
            System.out.println(circle.getArea());
        }
    }
}
