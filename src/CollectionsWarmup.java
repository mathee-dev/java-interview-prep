import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsWarmup {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 4, 2, 4, 3, 1));
        System.out.println(counterWords("java is good and java is useful"));
        System.out.println(findDuplicates(num));
        System.out.println(filterLongNames(Arrays.asList("Java", "is","good", "and", "Java", "is", "useful"),2));
    }

    static Map<String, Integer> counterWords (String sentence){
        LinkedHashMap<String, Integer> count = new LinkedHashMap<>();
        String[] words = sentence.split(" ");
        for (int i = 0;i<words.length;i++){
            //Could assign a variable for Character.toString but need to consider space complexity
            if (count.containsKey(words[i])){
                count.put(words[i],(count.get(words[i])+1));
            }
            else{
                count.put(words[i],1);
            }
        }

        return count;
        
    }

/* 
    static HashSet<Integer> findDuplicates(List<Integer> numbers){
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 0; i<numbers.size();i++){
            if (Collections.frequency(numbers,numbers.get(i))>1){
                uniqueNumbers.add(numbers.get(i));
            }
        }

        return uniqueNumbers;
    }    */

    static HashSet<Integer> findDuplicates(List<Integer> numbers){
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        HashSet<Integer> duplicateNumbers = new HashSet<>();
        for (int i = 0; i<numbers.size();i++){
            if (!uniqueNumbers.add(numbers.get(i))){
                duplicateNumbers.add(numbers.get(i));
            }
        }

        return duplicateNumbers;
        
    }


    //Normal loop solution
    static List<String> filterLongNames(List<String> names, int minimumLength){
        ArrayList<String> filteredNames = new ArrayList<>();
        for (int i = 0; i<names.size();i++){
            if (names.get(i).length() >= minimumLength){
                filteredNames.add(names.get(i));
            }
        }

        return filteredNames;
    }
}
