public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
    }

    public enum Capacity {
        ESPECIALLY_SMALL(0,10), SMALL (10,25), MEDIUM(40,50),
        LARGE (60,80), VERY_LARGE(100,120);
        private int minPlace;
        private int maxPlace;

         Capacity(int minPlace, int maxPlace){
             this.minPlace = minPlace;
             this.maxPlace = maxPlace;
        }

        public int getMinPlace() {
            return minPlace;
        }

        public void setMinPlace(int minPlace) {
            this.minPlace = minPlace;
        }

        public int getMaxPlace() {
            return maxPlace;
        }

        public void setMaxPlace(int maxPlace) {
            this.maxPlace = maxPlace;
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
        return 1.05;
    }
    @Override
    public double maxSpeed() {
        return 150;
    }

}
