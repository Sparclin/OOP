public class Kerucut extends Shape {
    public int r;
    public int t;
    Kerucut(int r, int t){
        this.r = r;
        this.t = t;
    }
    @Override
    int getArea() {
        return (int) (Math.PI * r * r * t)*1/3;
    }
}
