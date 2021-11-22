package ChainOfResponsibility;

public class Manager extends Firm {
    public Manager () {}

    @Override
    public void response(Worker asking) {
        if (asking.getAsking() <= 2) {
            System.out.println("Manager has accepted the requested for raise of worker: " + asking.getAsking() + "%");
        } else {
            System.out.println("Manager has send the request to unit manager: " + asking.getAsking() + "%");
            super.response(asking);
        }
    }
}
