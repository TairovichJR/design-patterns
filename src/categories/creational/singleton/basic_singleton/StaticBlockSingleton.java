package categories.creational.singleton.basic_singleton;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {

    private StaticBlockSingleton() throws IOException {
        System.out.println("Singleton is initializing");
        File.createTempFile(".",".");
    }

    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        }catch (Exception e){
            System.err.println("Failed to create a singleton");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
class StaticBlockSingletonDemo{

    public static void main(String[] args) {

        StaticBlockSingleton instance = null;
        try{
           instance  = StaticBlockSingleton.getInstance();
        }catch (Exception e){
            System.out.println("exception caught");
        }

        instance.setValue(1);
        System.out.println(instance.getValue());

    }
}