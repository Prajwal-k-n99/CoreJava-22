public class GettterSetter {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfacearea(){
        return 2*3.141*radius*radius + 2*3.141*radius*height;
    }
    public double volume(){
        return 3.141*radius*radius*height;
    }
}
    class Demo{
    public static void main(String[] args) {
        GettterSetter gs = new GettterSetter();
        gs.setRadius(15);
        System.out.println(gs.getRadius());
        gs.setHeight(10);
        System.out.println(gs.getHeight());
        System.out.println(" Surface area is " + gs.surfacearea());
        System.out.println(" Volume is " + gs.volume());
    }
}
