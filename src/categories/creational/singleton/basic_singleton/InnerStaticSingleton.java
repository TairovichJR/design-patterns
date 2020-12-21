package categories.creational.singleton.basic_singleton;
/*
    This is called the initialization-on-demand holder idiom.
    In Java, encapsulating classes do not automatically initialize inner classes.
    So the inner class only gets initialized by getInstance().
    Then again, class initialization is guaranteed to be sequential in Java,
    so the JVM implicitly renders it thread-safe.
 */
public class InnerStaticSingleton {

    public static int age;
    private InnerStaticSingleton(){ }

    private static class Inner{
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInstance(){
        return Inner.INSTANCE;
    }

}
class DemoInnerStatic{
    public static void main(String[] args) {


        InnerStaticSingleton instance = InnerStaticSingleton.getInstance();

    }
}
