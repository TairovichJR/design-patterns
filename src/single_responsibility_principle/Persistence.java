package single_responsibility_principle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persistence {

    public void saveToFile(Journal journal, String fileName, boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(fileName).exists()){
            try(PrintStream out = new PrintStream(fileName)){
                out.println(journal.toString());
            }
        }
    }

    public Journal load(String fileName){
        return null;
    }

}
