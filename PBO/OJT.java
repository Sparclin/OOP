public class OJT extends Employee {
        int nip=87654321;
        int timehour=6;
        double bonus = 0;
        double potongan = 0;
        double salary=4000000;
        String name="Watduhell";
        String status = "Kawin";
        String jobdesk="OJT";

        @Override
        double inipotongan(int a){
            if (a < 8){
                this.potongan += (8 - a) *50000;
            }
            return this.potongan;
        }

        @Override
        double inibonus(String b){
            if (b.equalsIgnoreCase("kawin")){
                this.bonus+=1000000;
            }
            return this.bonus;
        }

    void Run(){
        System.out.println("Nip : "+nip);
        System.out.println("Name : "+name);
        System.out.println("Jobdesk : "+jobdesk);
        System.out.println("Status : "+status);
        System.out.println("Salary : "+salary);
        System.out.println("Timehour : "+timehour);
        System.out.println("Potongan : "+potongan);
        System.out.println("Bonus : "+bonus);
    }
}
