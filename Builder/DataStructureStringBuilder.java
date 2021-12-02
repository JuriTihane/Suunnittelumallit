package Builder;

public class DataStructureStringBuilder implements DataStructure {
    private StringBuilder hamburger;

    public DataStructureStringBuilder(){
        hamburger = new StringBuilder();
    }

    public void addHamburgerPart(String part){
        hamburger.append(part);
    }

    public void getBurger(){
        System.out.println("McDonalds floor hamburger:");
        System.out.println("Contains: " +hamburger);
    }

    public float getPrize(){
        return (float) 9.0;
    }
}
