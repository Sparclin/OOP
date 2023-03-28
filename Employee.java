public class Employee {
     int nip;
    double bonus;
     int timehour;
     double potongan;
     double salary;
     String name;
     String status;
     String jobdesk;

    /*public int getNip() {
        return nip;
    }

    public int setNip(int nip) {
        this.nip = nip;
        return nip;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getTimehour() {
        return timehour;
    }

    public void setTimehour(int timehour) {
        this.timehour = timehour;
    }

    public int getPotongan() {
        return potongan;
    }

    public void setPotongan(int potongan) {
        this.potongan = potongan;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJobdesk() {
        return jobdesk;
    }

    public void setJobdesk(String jobdesk) {
        this.jobdesk = jobdesk;
    }

    public Employee() {
    }*/



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

    double inipotongan(int a){
        if (a < 8){
            this.potongan += (8 - a) *50000;
        }
        return this.potongan;
    }

    double inibonus(String b){
        if ("Kawin".equalsIgnoreCase("kawin")){
            this.bonus+=1000000;
        }
        return this.bonus;
    }

}
