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

    // @Test
    // public void snippet1Test() throws IOException{
    //     Path fileName = Path.of("/Users/andy/Desktop/cse15l/markdown-parser/Lab4MarkdownSnippets/snippet1.md"); 
    //     String content = Files.readString(fileName);
    //     String[] split = content.split("\n");
    //     ArrayList<String> links = new ArrayList<String>();
    //     for(String s: split){
    //         String link = MarkdownParse.getLinks(s);
    //         if(link != null && MarkdownParse.isValidLink(link)){
    //             links.add(MarkdownParse.getLinks(s));
    //         }
    //     }

    //     ArrayList<String> res = new ArrayList<String>();
    //     res.add("'google.com");
    //     res.add("google.com");
    //     res.add("ucsd.edu");
    //     assertEquals(res, links);
    // }

    // @Test
    // public void snippet1ReviewTest() throws IOException{
    //     Path fileName = Path.of("/Users/andy/Desktop/cse15l/markdown-parser/Lab4MarkdownSnippets/snippet1.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParseReview.getLinks(content);

    //     ArrayList<String> res = new ArrayList<String>();
    //     res.add("'google.com");
    //     res.add("google.com");
    //     res.add("ucsd.edu");
    //     assertEquals(res, links);
    // }

    // @Test
    // public void snippet2Test() throws IOException{
    //     Path fileName = Path.of("/Users/andy/Desktop/cse15l/markdown-parser/Lab4MarkdownSnippets/snippet2.md"); 
    //     String content = Files.readString(fileName);
    //     String[] split = content.split("\n");
    //     ArrayList<String> links = new ArrayList<String>();
    //     for(String s: split){
    //         String link = MarkdownParse.getLinks(s);
    //         if(link != null && MarkdownParse.isValidLink(link)){
    //             links.add(MarkdownParse.getLinks(s));
    //         }
    //     }

    //     ArrayList<String> res = new ArrayList<String>();
    //     res.add("a.com");
    //     res.add("a.com((");
    //     res.add("example.com");
    //     assertEquals(res, links);
    // }

    // @Test
    // public void snippet2ReviewTest() throws IOException{
    //     Path fileName = Path.of("/Users/andy/Desktop/cse15l/markdown-parser/Lab4MarkdownSnippets/snippet2.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParseReview.getLinks(content);

    //     ArrayList<String> res = new ArrayList<String>();
    //     res.add("a.com");
    //     res.add("a.com((");
    //     res.add("example.com");
    //     assertEquals(res, links);
    // }

    // @Test
    // public void snippet3Test() throws Exception{
    //     Path fileName = Path.of("/Users/andy/Desktop/cse15l/markdown-parser/Lab4MarkdownSnippets/snippet3.md"); 
    //     String content = Files.readString(fileName);
    //     String[] split = content.split("\n");
    //     ArrayList<String> links = new ArrayList<String>();
    //     for(String s: split){
    //         String link = MarkdownParse.getLinks(s);
    //         if(link != null && MarkdownParse.isValidLink(link)){
    //             links.add(MarkdownParse.getLinks(s));
    //         }
    //     }

    //     ArrayList<String> res = new ArrayList<String>();
    //     res.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
    //     assertEquals(res, links);

    // }

    // @Test
    // public void snippet3ReviewTest()throws Exception{
    //     Path fileName = Path.of("/Users/andy/Desktop/cse15l/markdown-parser/Lab4MarkdownSnippets/snippet3.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParseReview.getLinks(content);

    //     ArrayList<String> res = new ArrayList<String>();
    //     res.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
    //     assertEquals(res, links);
    // }

   
}
