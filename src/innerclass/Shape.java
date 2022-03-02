package innerclass;

public abstract class Shape {
    abstract void getMsg();
}

class ShapeImpl{
    Shape shape = new Shape() {
        int i = 10;
        @Override
        void getMsg() {
            System.out.println("Hiii "+i);
        }
    };

    public static void main(String[] args) {
        ShapeImpl shapeImpl = new ShapeImpl();
        shapeImpl.shape.getMsg();
    }
}