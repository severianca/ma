import printer.IPrinter;
import printer.consolePrinter;

public class main {
    public static void main(String[] args) throws Exception {

        final IPrinter printer = new consolePrinter();
        processing data = new processing("text.txt", printer);
        data.fileProcessing();
    }
}
