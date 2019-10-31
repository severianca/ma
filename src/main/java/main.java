import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) throws Exception {

        processing data = new processing("test1.txt");

        Map<String,Integer> map = new HashMap<String, Integer>();
        map = data.fileProcessing();

        for (Map.Entry<String, Integer> entry: map.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());
    }
}
