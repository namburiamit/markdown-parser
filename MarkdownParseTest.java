import static org.junit.Assert.*;

import java.nio.file.Path;
import java.nio.file.*;
import java.util.*;
import java.io.IOException;
import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void MarkdownParseTest0() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test
    public void MarkdownParseTest1() throws IOException {
        String content = Files.readString(Path.of("test-file2.md"));
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(content));
    }

    @Test
    public void MarkdownParseTest2() throws IOException {
        String content = Files.readString(Path.of("test-file3.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void MarkdownParseTest3() throws IOException {
        String content = Files.readString(Path.of("test-file4.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void MarkdownParseTest4() throws IOException {
        String content = Files.readString(Path.of("test-file5.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void MarkdownParseTest5() throws IOException {
        String content = Files.readString(Path.of("test-file6.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void MarkdownParseTest6() throws IOException {
        String content = Files.readString(Path.of("test-file7.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void MarkdownParseTest7() throws IOException {
        String content = Files.readString(Path.of("test-file8.md"));
        assertEquals(List.of("a link on the first line"), MarkdownParse.getLinks(content));
    }

    @Test
    public void testSnippet1() throws IOException {

        String content = Files.readString(Path.of("snippet1.md"));
        assertEquals( "MarkdownParse test on snippet 1",
        List.of("`google.com","google.com", "ucsd.edu"), MarkdownParse.getLinks(content));
    }

    @Test
    public void snippet2() throws IOException {
        String content = Files.readString(Path.of("snippet2.md"));
        assertEquals(
            "MarkdownParse test on snippet 2", List.of("b.com", "a.com(())", "example.com"),
             MarkdownParse.getLinks(content));
    }

    @Test
    public void snippet3() throws IOException {
        String content = Files.readString(Path.of("snippet3.md"));
        assertEquals(
            "MarkdownParse test on snippet 3",
             List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"),
             MarkdownParse.getLinks(content));
    }
    
}