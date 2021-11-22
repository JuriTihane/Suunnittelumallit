package ChainOfResponsibility;

import java.util.Scanner;

public class Worker {
    private double salary;
    private int asking;

    public Worker(double salary) {
        super();
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAsking() {
        return asking;
    }

    public void setAsking() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Give asking raise in integer numbers: ");

        String asking = myObj.nextLine();
        this.asking = Integer.parseInt(asking);
    }
}