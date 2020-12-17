package categories.creational.prototype;

import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;

public class Foo implements Serializable {

    public int stuff;
    public String whatever;

    public Foo(int stuff, String whatever) {
        this.stuff = stuff;
        this.whatever = whatever;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "stuff=" + stuff +
                ", whatever='" + whatever + '\'' +
                '}';
    }
}

class Bar implements Serializable {
    public String color;
    Foo foo;

    public Bar(String color, Foo foo) {
        this.color = color;
        this.foo = foo;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "color='" + color + '\'' +
                ", foo=" + foo +
                '}';
    }
}

class PrototypeSerialization{
    public static void main(String[] args) {

        Bar bar1 = new Bar("White",new Foo(123,"hey"));

        Bar bar2 = SerializationUtils.roundtrip(bar1);
        bar2.color = "red";
        bar2.foo.whatever = "hi there";

        System.out.println(bar1);
        System.out.println(bar2);

    }
}