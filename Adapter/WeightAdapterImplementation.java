package Adapter;

public class WeightAdapterImplementation implements WeightAdapter {
    private Weight finnish;

    public WeightAdapterImplementation(Weight finnish) {
        super();
        this.finnish = finnish;
    }

    @Override
    public double getWeight() {
        return convertToPounds(finnish.getWeight());
    }

    private double convertToPounds(double weight) {
        return weight * 2.205;
    }
}
