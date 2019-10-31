import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import java.util.HashMap;

public class processingTest {

    @Test
    public void test1() throws Exception {
        processing test1 = new processing("test2.txt");
        HashMap<String, Integer> actual = new HashMap<String,Integer>();
        actual = test1.fileProcessing();
        HashMap<String,Integer> expected = new HashMap<String,Integer>();
        expected.put("h",4);
        expected.put("q",3);
        expected.put("f",2);
        expected.put("s",1);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test2() throws Exception{
        processing test1 = new processing("testtest.txt");
        HashMap<String, Integer> actual = new HashMap<String,Integer>();
        actual = test1.fileProcessing();
    }

}