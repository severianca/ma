import org.junit.jupiter.api.Test;
import printer.IPrinter;
import printer.consolePrinter;

import static org.junit.jupiter.api.Assertions.*;

class processingTest {

    @Test
    void fileProcessing() throws Exception {
        final IPrinter printer = new consolePrinter();
        processing test1 = new processing("test1.txt",printer);
        test1.fileProcessing();
    }
}