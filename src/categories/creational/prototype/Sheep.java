package categories.creational.prototype;

public class Sheep implements Animal {

    private String name;
    public Sheep(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is being made");
        Sheep sheep = null;

        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }

    public String toString(){
        return "My name is " + this.name + ", baaa!";
    }

}
