package ChainOfResponsibility;

public abstract class Firm {
    protected Firm chain;

    public void sendAskingToNext(Firm chain) {
        this.chain = chain;
    }

    public void response(Worker asking) {
        if (chain != null) {
            chain.response(asking);
        }
    }
}
