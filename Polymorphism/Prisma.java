public class Prisma extends Shape{
    int a;
    int ta;
    int tp;
    Prisma(int a,int ta,int tp){
        this.a=a;
        this.tp=tp;
        this.ta=ta;
    }
    @Override
    int getArea() {
        return (int)(((a*ta)*1/2)*tp);
    }
}
