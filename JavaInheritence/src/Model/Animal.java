package Model;

public class Animal {
    public int age = 3;
    public int weight = 50;
    public boolean running = true;
    public boolean eating = false;

    public Animal(int age, int weight, boolean running, boolean eating){
        this.age = age;
        this.weight = weight;
        this.running = running;
        this.eating = eating;
    }

    public void setAge(int age){
        this.age = age; }
    public void setWeight(int weight){
        this.weight = weight; }
    public void setRunning(boolean running){
        this.running = running; }
    public void setEating(boolean eating){
        this.eating = eating; }
    public int getAge(){
        return age; }
    public int getWeight(){
        return weight; }
    public boolean getRunning(){
        return running; }
    public boolean getEating(){
        return eating; }


    }

