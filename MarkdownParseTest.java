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

    @Test
    public void MarkdownParseTest2() throws IOException {
        Path fileName = Path.of("testFiles/test-file2.md"); 
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.add(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();
        res.add("https://something.com");
        res.add("some-page.html");

        assertEquals(res, links);
    }

    @Test
    public void MarkdownParseTest3() throws IOException {
        Path fileName = Path.of("testFiles/test-file3.md"); 
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.add(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();


        assertEquals(res, links);
    }

    @Test
    public void MarkdownParseTest4() throws IOException {
        Path fileName = Path.of("testFiles/test-file4.md"); 
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.add(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();

        assertEquals(res, links);
    }

    @Test
    public void MarkdownParseTest5() throws IOException {
        Path fileName = Path.of("testFiles/test-file5.md"); 
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.add(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();


        assertEquals(res, links);
    }

    @Test
    public void MarkdownParseTest6() throws IOException {
        Path fileName = Path.of("testFiles/test-file6.md"); 
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.add(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();

        assertEquals(res, links);
    }

    @Test
    public void MarkdownParseTest7() throws IOException {
        Path fileName = Path.of("testFiles/test-file7.md"); 
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.add(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();


        assertEquals(res, links);
    }

    @Test
    public void MarkdownParseTest8() throws IOException {
        Path fileName = Path.of("testFiles/test-file8.md"); 
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            if(MarkdownParse.getLinks(s) != null){
                links.add(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();

        assertEquals(res, links);
    }

    @Test
    public void MarkdownParseTest9() throws IOException {
        Path fileName = Path.of("testFiles/test-file9.md"); 
        String content = Files.readString(fileName);
        String[] split = content.split("\n");
        ArrayList<String> links = new ArrayList<String>();
        for(String s: split){
            String link = MarkdownParse.getLinks(s);
            if(link != null && MarkdownParse.isValidLink(link)){
                links.add(MarkdownParse.getLinks(s));
            }
        }

        ArrayList<String> res = new ArrayList<String>();
        assertEquals(res, links);
    }








}
