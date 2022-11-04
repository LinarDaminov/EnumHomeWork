public  class Driver  <T extends Transport & Competing> {
    private final String driversName;
    private String driversLicense;
    private int experience;

    public Driver(String driversName, String driversLicense, int experience) {
        this.driversName = driversName;
        this.driversLicense = driversLicense;
        this.experience = experience;
    }
    public void startMove() {
        System.out.println(" I am starting move");
   }
    public   void stopMove() {
        System.out.println(" i am stopping move");
    }
    public  void reFull() {
        System.out.println(" I am full my car ");
    }
    @Override
    public String toString() {
        return "Водитель: "  + driversName + ", Категория прав: " + driversLicense  +
                ", опыт вождения: " + experience ;
    }
}

