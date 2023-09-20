package org.example;

public class SumCalculator {

    public static int sum(int n){
        if(n == 0 ) {
            throw new IllegalArgumentException("'n' не може бути 0.");
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
