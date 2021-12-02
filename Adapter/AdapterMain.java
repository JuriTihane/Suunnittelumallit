package Adapter;

public class AdapterMain {
    public static void main (String args[]) {
        Weight finnish = new AverageFinnish();
        System.out.println("Weight in kg: "+ finnish.getWeight());
        WeightAdapter american = new WeightAdapterImplementation(finnish);
        System.out.println("Weight in pounds: "+ american.getWeight());
    }
}
