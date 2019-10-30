import printer.IPrinter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.stream.Stream;

public class processing {

    private final String file;
    private final IPrinter printer;

    public processing(String file, IPrinter printer) {
        this.file = file;
        this.printer = printer;
    }

    public void fileProcessing() throws Exception{
        try {
            Files.lines(Paths.get(file))
                    .flatMap(s-> Stream.of(s.split(" ")))
                    .collect(HashMap<String,Integer>::new, (m, c)->{
                        if (m.containsKey(c))
                            m.put(c, m.get(c)+1);
                        else
                            m.put(c, 1);
                    }, HashMap::putAll)
                    .forEach((e,s)->printer.print(e,s));
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
