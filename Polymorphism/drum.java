public class drum extends AlatMusik {
    @Override
    void jenis() {
        System.out.println("Jenis drum : \n1.snare drum\n" +
                "2.bass drum" +
                "\n3.tom-tom");
    }

    @Override
    void caramain() {
        System.out.println("Dipukul dengan tangan atau sebuah batang atau biasanya disebut Stick drum");
    }

    @Override
    void type() {
        System.out.println("Drum");
    }
}
