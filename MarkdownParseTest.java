import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;



import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void MarkdownParseTest1() throws IOException {
        Path fileName = Path.of("newTest.md");
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.add(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();
        res.add("https://test.com");
        res.add("www.facebook.com");

        assertEquals(res, links);


    }
}
