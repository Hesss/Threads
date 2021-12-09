public class Birth implements Runnable{
    private String name;

    public Birth(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
    }
}
