package stringProblem;

import java.io.*;
import java.util.StringTokenizer;

public class WordOccurencesInLargeFile {

	public static int countWordsBufferedReaderInputStreamReader(String filePath, String searchText){
		int counter=0;
		long start = System.currentTimeMillis();
		String path=new File("").getAbsoluteFile().getAbsolutePath()+"\\"+filePath;
		try(BufferedReader bufferReader=new BufferedReader(new InputStreamReader(new FileInputStream(path)))){
			counter = readAndCountSearchText(bufferReader, searchText, counter);
		}catch (IOException ex) {
            ex.printStackTrace();
        }
		long end = System.currentTimeMillis();
        long total = end - start;
        System.out.println("Total time (ms): " + total);
        System.out.println("Count of searchText: " + counter);
        return counter;
    }
	
	public static int countWordsBufferedReaderFileReader(String filePath, String searchText) {
        long start = System.currentTimeMillis();
        int counter = 0;
        String path = new File("").getAbsoluteFile().getAbsolutePath() + "\\" + filePath;
        // try-with-resources. We dont have to explicitly close the file using finally block.
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            counter = readAndCountSearchText(bufferedReader, searchText, counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        long total = end - start;
        System.out.println("Total time (ms): " + total);
        System.out.println("Count of searchText: " + counter);
        return counter;
    }
	
	private static int readAndCountSearchText(BufferedReader bufferedReader, String searchText, int counter) throws IOException {
        String line;
        String token;
        while ((line = bufferedReader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line, " ().\"");
            while (tokenizer.hasMoreTokens()) {
                token = tokenizer.nextToken();
                if (token.equalsIgnoreCase(searchText)) {
                    counter++;
                }
            }
        }
        return counter;
	}
	public static void main(String[] args) {
          countWordsBufferedReaderFileReader("/largefile.txt", "foo");
          countWordsBufferedReaderInputStreamReader("/largefile.txt", "foo");
    }
}
