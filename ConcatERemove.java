package com.company;
import java.lang.Object;

public class ConcatERemove {
    //String dada
    public  boolean s;
    //String que desejo chegar
    public boolean t;
    //Numero de movimentos
    public int k;
    //
    public int n;

    void concatERemove(boolean s, boolean t, int k){
        if (equals(s,t)){
            printOutput(isEven(k) || isHigherThanDoubleLength(k, lenght(s))
        }
        else {
                printOutput(differenceLengthSumValidation(s,t,k) || isHigherThanLengthSum(s,t,k));
            }
        }

    public Object differenceLengthSumValidation(boolean s, boolean t, int k) {
        Object diffLenSum = differenceLengthSum(s, t);
        return ((k >= diffLenSum) && (isEven(k - diffLenSum)));
    }

    public Object differenceLengthSum(boolean s, boolean t) {
        return null;
    }

    void printOutput(boolean flag) {
        if (flag) {System.out.println("sim");}
        else {System.out.println("não");}
    }

    public Object areEqual(boolean s,boolean t){return s == t;}

    public Object isEven(int n){return n % 2 == 0;}

    boolean Object(int n, Object length){return n> 2 * length;}

    int similarInitialLength(boolean s, boolean t){
        int cont = 0;
        int minorLength = getMinorLength(s,t);
        for(i in range(minorLength)){
            if (s[i] != t[i]){
                return cont;
            }
            cont = cont + 1;
        }
        return cont;
    }

    private int getMinorLength(boolean s, boolean t) {
        if(lenght(s) < lenght(t)){
            return (int) lenght(s);
        }
        return (int) lenght(t);
    }

    void differenceLengthSum(s,t){
        return lenght(s) + lenght(t) - (similarInitialLength(s,t) * 2);
    }

    void isHigherThanLengthSum(boolean s, boolean t, int k){
        return k > lenght(s) + lenght(t);
    }
}
