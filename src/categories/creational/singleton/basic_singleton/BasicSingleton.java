package categories.creational.singleton.basic_singleton;

import java.io.*;

public class BasicSingleton implements Serializable {

    private BasicSingleton(){

    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getInstance(){
        return INSTANCE;
    }

    private int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    protected Object readResolve(){
        return  INSTANCE;
    }
}

class Demo{

    static void saveToFile(BasicSingleton singleton, String fileName) throws Exception{
        try(FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut)){
            objOut.writeObject(singleton);
        }
    }
    static BasicSingleton readFromFile(String fileName) throws  Exception{
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objIn = new ObjectInputStream(fileIn)){
            return (BasicSingleton) objIn.readObject();
        }
    }

    public static void main(String[] args) throws Exception {

        //problems with this basic singleton
        //1. reflection

        //2. serialization
        BasicSingleton singleton = BasicSingleton.getInstance();

        singleton.setValue(111);

        String fileName = "singleton.bin";

        saveToFile(singleton, fileName);

        singleton.setValue(222);

        BasicSingleton singleton2 = readFromFile(fileName);

        System.out.println(singleton == singleton2);

        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());
    }
}
