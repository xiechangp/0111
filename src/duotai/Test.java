package duotai;

public class Test {
    public static void main(String[] args) {
        Shape sz = new Square(5);
        System.out.println(sz.calculateAreas());
        Shape ss = new Triangle(5,6);
        System.out.println(ss.calculateAreas());
    }
}
