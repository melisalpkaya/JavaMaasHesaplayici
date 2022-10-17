public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (this.salary<1000){

            return 0;

        }
        else{
            return (this.salary*3)/100;
        }

    }

    public double bonus() {
        if (this.workHours  > 40) {

            return (this.workHours-40) * 30;

        }else {

            return 0;

        }
    }

    public double raiseSalary() {
        if (2021-this.hireYear>19) {

            return this.salary * 0.15;

        }else if (2021-this.hireYear>9 && 2021-this.hireYear<20) {

            return this.salary * 0.10;

        }else if (2021-this.hireYear>0 && 2021-this.hireYear<10) {
            return this.salary * 0.05;
        }else {
            return 0;
        }
    }

    public String toString(){
        double toplamMaas = salary +bonus(); //çalışanın kendi maaşı + bonus
        double toplamMaas2 = salary -tax() + bonus() + raiseSalary(); // vergi, bonuslar ve çalışanın kendi maaşı

        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + toplamMaas2);
        System.out.println("Toplam Maaş : " + toplamMaas);

        return null;
    }

}
