package duotai;

public class Square extends Shape {
    public Square(float lengthside) {
        this.lengthside = lengthside;
    }
    float lengthside;
    public float calculateAreas() {
        System.out.println("正方形面积：");
        return lengthside*lengthside;
    }
}
