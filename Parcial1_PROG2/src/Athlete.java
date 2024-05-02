public class Athlete extends Person implements Contract {
    private double height;
    private int age;
    private double weight;

    public Athlete(int dni, String name, double height, int age, double weight) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateBMI() {
        double bmi = getWeight() / Math.pow(getHeight(), 2);
        return bmi;
    }

    @Override
    public boolean hasExtraWeight(double bmi) {
        if (bmi >= 18.5 && bmi <= 24.9){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public double takePulse() {
        return 0;
    }
}
