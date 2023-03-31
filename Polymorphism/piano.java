public class piano extends AlatMusik{
    @Override
    void type() {
        System.out.println("Nama alat : Piano");
    }
    @Override
    void jenis() {
        System.out.println("Jenis Piano : "+
                "\n1.digital piano.\n" +
                "2.keyboard.\n" +
                "3.Organ.\n");
    }
    @Override
    void caramain() {
        System.out.println("Cara bermain : " +
                "dengan cara ditekan dengan jari tangan dan juga kaki, yaitu menginjak pedal piano");
    }
}
