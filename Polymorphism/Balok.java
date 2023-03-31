public class Balok extends Shape{
    int p;
    int l;
    int t;
    Balok(int p,int l,int t){
        this.p=p;
        this.l=l;
        this.t=t;
    }
    @Override
    int getArea() {
        return (int)(p*l*t);
    }
}
