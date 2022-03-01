package innerclass;

public abstract class Shape {
    abstract void getMsg();
}

class ShapeImpl{
    Shape shape = new Shape() {
        @Override
        void getMsg() {
            System.out.println("Hiii");
        }
    };

    public static void main(String[] args) {
        ShapeImpl shapeImpl = new ShapeImpl();
        shapeImpl.shape.getMsg();
    }
}