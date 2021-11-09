package Singleton;

public class AconcreteTehdas extends AbstractTehdas {
    private AconcreteTehdas(){}

    private static final AbstractSingleton<AconcreteTehdas> objHolder = new AbstractSingleton<AconcreteTehdas>() {
        @Override
        protected AconcreteTehdas newObj() {
            return new AconcreteTehdas();
        }
    };

    // Täällä luodaan vain ATuotteen
    @Override
    public ATuote makeProduct() {
        return new ATuote();
    }

    public static AconcreteTehdas getInstance(){
        return objHolder.getInstance();
    }
}
