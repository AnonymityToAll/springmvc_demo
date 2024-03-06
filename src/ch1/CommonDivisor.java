package ch1;

public class CommonDivisor {
    public int get(int i, int j){
        int res = -1;

        if (i == 0){
            return j;
        }
        if (j == 0){
            return i;
        }
        int r = i % j;

        return get(j, r);
    }
}
