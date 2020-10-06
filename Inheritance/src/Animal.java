public class Animal {

    private boolean running;
    private int age;
    private double weight;
    private boolean eating;

    public Animal(boolean running, int age, double weight, boolean eating){
        this.running = running;
        this.age = age;
        this.weight = weight;
        this.eating = eating;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
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

    public boolean isEating() {
        return eating;
    }

    public void setEating(boolean eating) {
        this.eating = eating;
    }

}
