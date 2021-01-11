package duotai;

public class Triangle extends Shape {
    float higth;
    float low;

    public Triangle(float higth, float low) {
        this.higth = higth;
        this.low = low;
    }

    public float calculateAreas() {
        System.out.println("长方形面积:");
        return (higth*low)/2;
    }
}
