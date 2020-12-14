package categories.creational.builder.challenge;

import java.util.HashMap;
import java.util.Map;

public class CodeBuilder {

    private String className;
    private HashMap<String,String> fields = new HashMap<>();
    public CodeBuilder(String className)
    {
        this.className =   "public class " +  className;
    }

    public CodeBuilder addField(String name, String type)
    {
        fields.put(name, type);
        return this;
    }

    public String constructFields() {
        String result = "";
        for (Map.Entry<String, String> entry: fields.entrySet()) {
            result += "  public " + entry.getValue() + " " +  entry.getKey() + ";\n";
        }
        return result;
    }

    @Override
    public String toString() {
        return className + "\n" + "{\n" + constructFields() + "}";
    }

}

class Demo{
    public static void main(String[] args) {

        CodeBuilder cb = new CodeBuilder("Person")
                .addField("name","String")
                .addField("age","int")
                .addField("position","String")
                .addField("name","String");
        System.out.println(cb.toString());

    }
}
