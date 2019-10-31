import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class processing {

    private final String file;

    public processing(String file) {
        this.file = file;
    }

    public HashMap<String, Integer> fileProcessing() throws Exception{

        HashMap<String,Integer> mymap = new HashMap<String, Integer>();
        HashMap <String,Integer> result = new HashMap<String,Integer>();

        try {
            Files.lines(Paths.get(file))
                    .flatMap(s-> Stream.of(s.split(" ")))
                    .collect(HashMap<String,Integer> ::new, (m, c)->{
                        if (m.containsKey(c))
                            m.put(c, m.get(c)+1);
                        else
                            m.put(c, 1);
                    }, HashMap::putAll)
                    .forEach(mymap::put);

            result = mymap.entrySet()
                    .stream()
                    .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                    .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (oldValue, newValue)->newValue, LinkedHashMap::new));

        } catch (IOException e) {
            System.out.println("File not found");
        }
        return result;
    }
}
