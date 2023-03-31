public class Tabung extends Shape {
    int r;
    int t;
    Tabung(int r,int t){
        this.r = r;
        this.t = t;
    }
    @Override
    int getArea() {
        return (int) (Math.PI * r * r *t);
    }
}

