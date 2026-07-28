public class SyntaxWarmup {
    public static void main(String[] args) {
        System.out.println(classifyNumber(-5));
        System.out.println(maxOfThree(4, 9, 2));
        fizzBuzz(15);
        System.out.println(sumToN(5));
    }

    static String classifyNumber(int num){
        if (num==0){
            return "zero";
        }
        else if (num>0){
            return "positive";
        }
        else {
            return "negative";
        }
    }

    //Use variables to store results if needed
    static int maxOfThree(int a, int b, int c){
        int max = a;
        if (max<b){
            max = b;
        }
        if (max<c){
            max = c;
        }

        return max;
    }

    static void fizzBuzz(int n){
        for (int i = 1; i<=n;i++){
            String output = "";
            if (i%3==0){
                output+="Fizz";
            }
            if (i%5==0){
                output+="Buzz";
            }
            if (output.length()==0){
                System.out.println(i);
            }
            else{
                System.out.println(output);
            }

            
        }
    }

    static int sumToN(int n){
        int sum = 0;
        for (int i = 0; i<=n;i++){
            sum+=i;
        }

        return sum;
    }
}