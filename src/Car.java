public class Car extends Transport implements Competing {
    public enum  bodyType {СЕДАН, ХЕТЧБЕК, КУПЕ, УНИВЕРСАЛ, ВНЕДОРОЖНИК,КРОССОВЕР,ПИКАП,ФУРГОН, МИНИВЕН;

        public static String checkType() {
            if (Car.bodyType != null) {
                System.out.println("Тип авто по кузову " + bodyType);
            } else {
                System.out.println("Недостаточно информации");
            }
            return bodyType;
        }



    }
    public Car(String brand, String model, double engineVolume, bodyType седан) {
        super(brand, model, engineVolume);
    }
    private static String bodyType;

    public Car(String brand, String model, double engineVolume, String bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public static String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
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
        return 0.55;
    }
    @Override
    public double maxSpeed() {
        return 220;
    }


}
