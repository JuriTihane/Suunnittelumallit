package ChainOfResponsibility;

public class CORMain {
    public static void main(String[] args) {
        Worker worker = new Worker(10);
        Manager manager = new Manager();
        UnitManager unitManager = new UnitManager();
        Ceo ceo = new Ceo();

        manager.sendAskingToNext(unitManager);
        unitManager.sendAskingToNext(ceo);

        worker.setAsking();
        manager.response(worker);

        double salary = worker.getSalary();
        salary = salary + salary * worker.getAsking() * 0.01;
        worker.setSalary(salary);
        System.out.println("Workers new per hour pay is: " + worker.getSalary());
    }
}
