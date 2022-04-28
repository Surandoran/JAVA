package test;

import java.util.Scanner;

class TTTT{

    public static int get_sum(int[] arr, int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

}

public class test {

    public static void main(String[] args) {

        new TTTT();
        TTTT.get_sum([5],5);


    }


}
