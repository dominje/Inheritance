public class Felidae extends Animal {

    private String sound = "meowing meowing";

    public Felidae(boolean running, int age, double weight, boolean eating) {
        super(running, age, weight, eating);
    }

    public String getSound() {
        return this.sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
