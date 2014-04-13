package rhx.tut.thread._02mutual_exclusion;

/**
 * Created by rhinox on 2014-04-13.
 */
public class PersonLock implements Lock {

    private int victim;
    private boolean[] flag = new boolean[2];

    @Override
    public void lock() {
        int i = (int) Thread.currentThread().getId();
        int j = 1 - i;
        flag[i] = true;
        victim = i;
        while (flag[j] && victim == i) {
        }
    }

    @Override
    public void unlock() {
        int i = (int) Thread.currentThread().getId();
        flag[i] = false;
    }
}
