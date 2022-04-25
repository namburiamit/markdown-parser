import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void getLinksTest() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedArray = new ArrayList<>();
        expectedArray.add("https://something.com");
        expectedArray.add("some-thing.html");

        assertEquals(expectedArray, MarkdownParse.getLinks(content));
    }
    @Test
    public void getLinksTest2() throws IOException {
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedArray = new ArrayList<>();
        expectedArray.add("https://something.com");
        expectedArray.add("some-page.html");

        assertEquals(expectedArray, MarkdownParse.getLinks(content));
    }
    @Test
    public void getLinksTest3() throws IOException {
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedArray = new ArrayList<>();

        assertEquals(expectedArray, MarkdownParse.getLinks(content));
    }
    @Test
    public void getLinksTest4() throws IOException {
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedArray = new ArrayList<>();

        assertEquals(expectedArray, MarkdownParse.getLinks(content));
    }
    @Test
    public void getLinksTest5() throws IOException {
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedArray = new ArrayList<>();
        expectedArray.add("stuff");
        expectedArray.add("page.com");

        assertEquals(expectedArray, MarkdownParse.getLinks(content));
    }
}

    public void getLinksTest6() throws IOException {
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedArray = new ArrayList<>();
        expectedArray.add("https://something.com");
        expectedArray.add("some-page.html");
        assertEquals(expectedArray, MarkdownParse.getLinks(content));
    }
    @Test
    public void getLinksTest7() throws IOException {
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedArray = new ArrayList<>();
        expectedArray.add("https://something.com");
        expectedArray.add("some-page.html");

        assertEquals(expectedArray, MarkdownParse.getLinks(content));
    }
    @Test
    public void getLinksTest8() throws IOException {
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> expectedArray = new ArrayList<>();
        expectedArray.add("https://something.com");
        expectedArray.add("some-page.html");

        assertEquals(expectedArray, MarkdownParse.getLinks(content));
    }
