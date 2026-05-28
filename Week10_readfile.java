package weeklyassign;

import java.io.*;

public class Week10_readfile {

    public static void main(String[] args) {

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        String st = "";
        String longestWord = "";

        File file = new File("C:\\Users\\haris\\OneDrive\\Desktop\\Read.txt");

        try {

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((st = br.readLine()) != null) {

                System.out.println(st);

                lineCount++;

                // Count characters
                charCount += st.length();

                // Split words
                String[] words = st.trim().split("\\s+");

                // Count words
                wordCount += words.length;

                // Find longest word
                for (String word : words) {

                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }

            // Print results
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters: " + charCount);
            System.out.println("Longest Word: " + longestWord);

            br.close();

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}