public class ThreadCount implements Runnable{
    ThreadCommonResourse res;
    ThreadCount(ThreadCommonResourse res) {
        this.res = res;
    }

    public void run () {
        res.increment();
    }
}
