package single_responsibility_principle;

import java.awt.*;
import java.io.File;

public class Runner {
    public static void main(String[] args) throws Exception{


        Journal journal = new Journal();
        journal.addEntry("I am very motivated");
        journal.addEntry("I like Mr.Robot");

        Persistence persistence = new Persistence();
        String fileName = "journal.txt";
        persistence.saveToFile(journal, fileName, true);

        String cmd = "/Applications/TextEdit.app";

        Desktop.getDesktop().edit(new File(fileName));

    }
}
