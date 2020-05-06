public class methodsExercises {
    public static void main(String[] args){
        System.out.println(2 == sum(1,1));
        System.out.println(4 ==subtraction(6,2));
        System.out.println(10 == multiplication(5,2));
        System.out.println(5 == Division (10,2));
        System.out.println(1 == modulus(5,2));

    }

    public static double sum (double arg1, double arg2){
        return arg1 + arg2;
    }
    public static double subtraction (double arg1, double arg2){
    return arg1 - arg2;
    }
    public static double multiplication (double arg1, double arg2){
    return arg1 * arg2;
    }
    public static double Division (double arg1, double arg2){
    return arg1 / arg2;
    }
    public static double modulus (double arg1, double arg2){
    return arg1 % arg2;
    }



}
