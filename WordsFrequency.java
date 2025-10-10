import java.util.HashMap;
import java.util.Map;

public class WordsFrequency {
    public static void main(String[] args) {
        String sampleText = "Hello world hello Java world";
        Map<String,Integer> m = new HashMap<>();
        String[] words = sampleText.toLowerCase().split("\\s+");
        for(String word:words){
            m.put(word,m.getOrDefault(word, 0)+1);
        }
        System.out.println(m);

    }

}
