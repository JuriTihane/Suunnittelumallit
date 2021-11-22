package ChainOfResponsibility;

public class Ceo extends Firm {
    public Ceo () {}

    @Override
    public void response(Worker asking) {
        if (asking.getAsking() >= 5) {
            System.out.println("Ceo has accepted the requested for raise of worker: " + asking.getAsking() + "%");
        } else {
            System.out.println("Ceo has denied the request for raise of worker: " + asking.getAsking() + "%");
        }
    }
}
