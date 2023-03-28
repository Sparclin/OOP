
public class EmploRun {
    public static void main(String[] args) {
        Employee ab = new Employee();
        Boss ai = new Boss();
        Manager ba = new Manager();
        Officeboy bi = new Officeboy();
        OJT ia = new OJT();


        ab.inipotongan(ab.timehour);
        ab.inibonus(ab.status);
        ab.Run();

        System.out.println("===============================");

        ai.inipotongan(ai.timehour);
        ai.inibonus(ai.status);
        ai.Run();

        System.out.println("===============================");

        ba.inipotongan(ba.timehour);
        ba.inibonus(ba.status);
        ba.Run();

        System.out.println("===============================");

        bi.inipotongan(bi.timehour);
        bi.inibonus(bi.status);
        bi.Run();

        System.out.println("===============================");

        ia.inipotongan(ia.timehour);
        ia.inibonus(ia.status);
        ia.Run();
    }
}
