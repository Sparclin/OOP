

public class Bola extends Shape {
    float r;

    Bola(float r){
        this.r=r;
    }

    @Override
    int getArea() {
        return (int)(4/3*Math.PI*r*r);
    }
}
