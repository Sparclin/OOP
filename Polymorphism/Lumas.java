public class Lumas extends Shape {
    int s;
    int t;
    Lumas(int s, int t){
        this.s=s;
        this.t=t;
    }
    @Override
    int getArea() {
        return (int)(s*s*t)*1/3;
    }
}
