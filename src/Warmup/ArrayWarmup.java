package Warmup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayWarmup {
    public static void main(String[] args) {
        int[] numbers = {};
        System.out.println(sumArray(numbers));
        System.out.println(findMax(numbers));
        System.out.println(countEvens(numbers));
        System.out.println(findIndex(numbers, 3));
        System.out.println(Arrays.toString(removeDuplicates(numbers)));
    }

    static int sumArray(int[] numbers){
        int sum = 0;
        for (int i =0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        return sum;
    }

    static int findMax(int [] numbers){
        int max = numbers[0];
        for (int i =1;i<numbers.length;i++){
            if (max<numbers[i]){
                max = numbers[i];
            }
        }

        return max;
    }

    static int countEvens(int[] numbers){
        int evens = 0;
        for(int i = 0;i<numbers.length;i++){
            if (numbers[i]%2==0){
                evens++;
            }
        }
        return evens;
    }

    static int findIndex(int[] numbers, int target){
        for (int i =0;i<numbers.length;i++){
            if (numbers[i]== target){
                return i;
            }
        }

        return -1;
    }

    static int[] removeDuplicates(int[] numbers){
        Set<Integer> setNumbers = new HashSet<>();
        List<Integer> listNumbers = new ArrayList<>();
        for (int i = 0;i<numbers.length;i++){
            if (setNumbers.add(numbers[i])){
                listNumbers.add(numbers[i]);
            }
        }
        
        
        int[] newNumbers = new int[listNumbers.size()];
        for (int i = 0;i<listNumbers.size();i++){
            newNumbers[i] = listNumbers.get(i); 
        }

        return newNumbers;
    }
}


