package categories.creational.factory.abstractFactory;

import org.javatuples.Pair;
import org.reflections.Reflections;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HotDrinkMachine {

    private List<Pair<String, IHotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() throws  Exception{
        Set<Class<? extends IHotDrinkFactory>> types = new Reflections("categories.creational.factory.abstractFactory")
                .getSubTypesOf(IHotDrinkFactory.class);

        for(Class<? extends IHotDrinkFactory> type: types){
            namedFactories.add(new Pair<>(type.getSimpleName().replace("Factory",""),
            type.getDeclaredConstructor().newInstance()));
        }
    }

    public IHotDrink makeDrink() throws IOException {
        System.out.println("Available Drinks");

        for (int i = 0; i < namedFactories.size(); i++){
            Pair<String,IHotDrinkFactory> item = namedFactories.get(i);
            System.out.println("" + i + ": " + item.getValue0());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String s;
            int i, amount;
            if ((s = reader.readLine()) != null && (i=Integer.parseInt(s))>=0 && i < namedFactories.size()){
                System.out.print("Specify amount: ");
                s =reader.readLine();
                if (s != null && (amount = Integer.parseInt(s))>0){
                    return namedFactories.get(i).getValue1().prepare(amount);
                }
            }
            System.out.println("Incorrect input, try again");
        }
    }
}

class Demo{
    public static void main(String[] args) throws Exception {

        HotDrinkMachine machine = new HotDrinkMachine();


        // interactive
        IHotDrink drink = machine.makeDrink();
        drink.consume();

    }
}




