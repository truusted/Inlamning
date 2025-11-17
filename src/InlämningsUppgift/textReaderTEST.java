package InlämningsUppgift;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class textReaderTEST {


    @Test
    public void testAddLine() {
        textReader reader = new textReader();

        String line = "Detta är en testrad";
        reader.addLine(line);

        assertEquals(1, reader.AntalRader());

    }


    @Test
    public void testLongestWord() {
        textReader reader = new textReader();

        reader.addLine("Hej world");
        reader.addLine("Det här är en längre ord");


        assertEquals("längre", reader.longestWord());

    }

    @Test

    public void testAntalTecken() {
        textReader reader = new textReader();

        String line1 = "Första raden";
        String line2 = "Andra raden med längre ord";
        String line3 = "Kort";

        reader.addLine(line1);
        reader.addLine(line2);
        reader.addLine(line3);

        int expectedChars = line1.length() + line2.length() + line3.length();
        assertEquals(expectedChars, reader.AntalTecken());


    }
}
