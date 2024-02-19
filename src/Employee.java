public class Employee {
    String name;
    double salary;
    int workHours;//Haftalık çalışma saati
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {//Vergi
        if (this.salary >= 1000) {
            return this.salary * 0.03;
        }
        return 0;
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        int minus = 2021 - this.hireYear;
        if (minus < 10) {
            return this.salary * 0.05;
        } else if (minus < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }

    }

    void calcSalary() {
        System.out.println("Adı:  " + this.name + "\n" + "Maaşı:  " + this.salary + "\n" + "Çalışma Saati:  " + this.workHours + "\n" +
        "Başlangıç Yılı:  "+hireYear+"\n"+"Vergi:  "+tax()+"\n"+"Bonus:  "+bonus()+"\n"+"Yıl Zamı:  "+raiseSalary()+"\n"+
                "Vergi ve bonuslarla birlikte maaş:  "+(this.salary-tax()+bonus())+"\n"+
                "Toplam Maaş:  "+(this.salary-tax()+bonus()+raiseSalary()));
    }
}
