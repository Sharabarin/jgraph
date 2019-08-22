public class DizelEngine implements Engine{

    private boolean temp;

    @Override
    public void start() {
        temp = true;
        System.out.println("start");
    }

    @Override
    public void stop() {
        temp = false;
        System.out.println("stop");
    }

    @Override
    public boolean getStatus() {
        return temp;
    }
}
