package categories.creational.singleton.basic_singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){
        System.out.println("Initializing a lazy singleton");
    }

    //potential threat is if two threads are trying to access getInstance(),
    //they both see that instance is null, so both will create an object of LazySingleton
    //One solution is make this method synchronized, but again it will cause performance issues
//    public static synchronized LazySingleton getInstance(){
//        if (instance == null){
//            instance = new LazySingleton();
//        }
//        return instance;
//    }

    //double-check locking
    //this is both lazy as well as thread-safe.
    public static LazySingleton getInstance(){
        if (instance == null){
            synchronized (LazySingleton.class){
                if (instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
