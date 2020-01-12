package Model;

public class Felidae extends Animal{
    public String sound = "meow meow";

    public Felidae(int age, int weight, boolean running, boolean eating) {
        super(age, weight, running, eating);
        System.out.println(sound);
    }

}
