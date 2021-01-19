public  class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent){
        this.radius *= Math.round(((percent / 100)*100)/100) ;
    }

    public static void main(String[] args) {
        Circle[] circles=new Circle[3];
        circles[0]=new Circle(5);
        circles[1]=new Circle(10);
        circles[2]=new Circle(20,"red",false);
        System.out.println(circles);


    }
}
