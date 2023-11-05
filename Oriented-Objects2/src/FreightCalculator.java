public class FreightCalculator {
    public double calculateFreight(int distance, double weight, String cargoType) {
        double distanceFreight = distance * 0.1;
        double weightFreight = weight * 2.5;

        double typeFreight;
        if (cargoType.equalsIgnoreCase("fragile")) {
            typeFreight = 50.0;
        } else if (cargoType.equalsIgnoreCase("hazardous")) {
            typeFreight = 80.0;
        } else {
            typeFreight = 30.0;
        }

        return distanceFreight + weightFreight + typeFreight;
    }
}
