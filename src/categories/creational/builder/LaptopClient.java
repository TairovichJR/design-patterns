package categories.creational.builder;

public class LaptopClient {

    public static void main(String[] args) {


        LaptopBuilder builder = new LaptopBuilder();

        Phone build = new Phone.Builder().setFrontPanel("front").setBackPanel("back").setCamera("camera").build();

        System.out.println(build);

    }
}
