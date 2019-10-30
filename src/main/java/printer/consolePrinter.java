package printer;

public class consolePrinter implements IPrinter{
    @Override
    public void print(String a, Integer b) {
        System.out.println(a +" - "+ b);
    }
}
