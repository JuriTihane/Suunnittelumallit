package ChainOfResponsibility;

public class UnitManager extends Firm {
    public UnitManager () {}

    @Override
    public void response(Worker worker) {
        int asking = worker.getAsking();
        if (asking >= 2 && asking < 5) {
            System.out.println("Unit manager has accepted the requested for raise of worker: " + asking + "%");
        } else {
            System.out.println("Unit Manager has send the request to ceo: " + asking + "%");
            super.response(worker);
        }
    }
}