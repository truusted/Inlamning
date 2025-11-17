package InlämningsUppgift;

public class textReader {
    private int totalTecken;
    private int totalRader;
    private String longestWord;

    public textReader() {
        this.totalTecken = 0;
        this.totalRader = 0;
        this.longestWord = "";

    }

    public void addLine(String line) {
        totalRader++;
        totalTecken += line.length();

        String[] words = line.split("\\s+");
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
    }


    public int AntalTecken() {
        return totalTecken;
    }

    public int AntalRader() {
        return totalRader;
    }

    public String longestWord() {
        return longestWord;
    }

}
