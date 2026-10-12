package aula3;

public class ex3 {

    public interface SortingPolicy {
        boolean isBefore(int a, int b);
    }

    static void sort(int[] v, SortingPolicy policy) {
        for (int i=0; i!=v.length; i++)
            for (int j=1; j!=v.length-i; j++)
                if (policy.isBefore(v[j], v[j-1])) {
                    int aux = v[j-1];
                    v[j-1] = v[j];
                    v[j] = aux;
                }
    }

    public static void main(String[] args) {

    }


}
