package Builder;

public class BuilderMain {
    public static void main(String[] args) {

        HamburgerChain chain = new Hesburger();
        chain.cookHamburger().getBurger();
        System.out.println("Prize : " +chain.cookHamburger().getPrize());

        chain = new McDonalds();

        chain.cookHamburger().getBurger();
        System.out.println("Prize : " +chain.cookHamburger().getPrize());
    }
}
