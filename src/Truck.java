public class Truck extends Transport implements Competing{

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity ) {
        super(brand, model, engineVolume);
    }

    public enum LoadCapacity {
        N1(0,3.5), N2 (3.5,12), N3(12,100);
        private final double minWeight;
        private final double maxWeight;

        public double getMinWeight() {
            return minWeight;
        }

        public double getMaxWeight() {
            return maxWeight;
        }

        LoadCapacity(double minWeight, double maxWeight) {
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }


   }
       @Override
    public void startMove() {
    }

    @Override
    public void finishMove() {
    }

    @Override
    public String pitStop() {
        return "Пит стоп";
    }

    @Override
    public double bestTime() {
        System.out.println();
        return 1.12;
    }
    @Override
    public double maxSpeed() {
        return 175;
    }
}
