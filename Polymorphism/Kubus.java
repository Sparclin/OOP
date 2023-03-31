public class Kubus extends Shape {
    int s;
    Kubus(int s){
        this.s = s;
    }

    @Override
    int getArea() {
        return (int) (s*s*s);
    }
}
