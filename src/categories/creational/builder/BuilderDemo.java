package categories.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {


        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChildFluent("li","hello").addChildFluent("li","world");
        System.out.println(builder);

    }
}
