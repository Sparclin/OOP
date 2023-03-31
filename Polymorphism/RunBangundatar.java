public class RunBangundatar {
    public static void main(String[] args) {
        Shape a = new Balok(3,4,2);
        Shape b = new Kerucut(3,4);
        Shape c = new Kubus(3);
        Shape d = new Tabung(3,4);
        Shape e = new Lumas(3,4);
        Shape f = new Prisma(3,4,2);
        Shape g = new Bola(3);

        System.out.println("Volume Balok"+a.getArea());
        System.out.println("Volume Kerucut"+b.getArea());
        System.out.println("Volume Kubus"+c.getArea());
        System.out.println("Volume Tabung"+d.getArea());
        System.out.println("Volume Lumas"+e.getArea());
        System.out.println("Volume Prisma"+f.getArea());
        System.out.println("Volume Bola"+g.getArea());
    }
}