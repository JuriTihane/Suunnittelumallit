package Builder;

public class McDonalds implements HamburgerChain {
    public DataStructure cookHamburger(){
        DataStructureStringBuilder meal = new DataStructureStringBuilder();
        meal.addHamburgerPart("Patty, ");
        meal.addHamburgerPart("jaavuori salad, ");
        meal.addHamburgerPart("mayonnaise");
        return meal;
    }
}
