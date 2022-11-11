public class ThreadRun {
    public static void main(String[] args) {

        ThreadCommonResourse resourse = new ThreadCommonResourse();

        for (int i=1; i<6; i++) {
            Thread t = new Thread(new ThreadCount(resourse));
            t.setName("Thread "+i);
            t.start();
        }
    }
}
