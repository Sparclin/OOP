public class Boss extends Employee {

        int nip=35756234;
        int bonus=0;
        int timehour=3;
        int potongan = 0;
        int salary=4000000;
        String name="Mario";
        String status = "Kawin";
        String jobdesk="Boss";

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
            System.out.println("Nip : " + nip);
            System.out.println("Name : " + name);
            System.out.println("Jobdesk : " + jobdesk);
            System.out.println("Status : " + status);
            System.out.println("Salary : " + salary);
            System.out.println("Timehour : " + timehour);
            System.out.println("Potongan : " + potongan);
            System.out.println("Bonus : " + bonus);
        }
    }
