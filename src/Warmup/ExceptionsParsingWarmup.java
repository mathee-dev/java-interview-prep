package Warmup;
public class ExceptionsParsingWarmup {

    public static void main(String args[]){
        System.out.println(parseInteger("50"));
        System.out.println(parseInteger("Fail"));
        System.out.println(parseInteger(""));;
        System.out.println(parseInteger("!!"));

        System.out.println(divide(2, 4));
        System.out.println(divide(2, 0));
    }

    static Integer parseInteger(String text){
        try {
            int num = Integer.parseInt(text);
            return num;
        } catch (Exception e) {
            return null;
        }
    }

    static double divide(int numerator, int denominator){
        if (denominator==0){
            throw new IllegalArgumentException("Can't divide by zero");
        }
        return (double)numerator/(double)denominator;
    }
}