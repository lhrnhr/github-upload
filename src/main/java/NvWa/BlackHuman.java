package NvWa;

public class BlackHuman implements Human {
    public void getColor() {
        System.out.println("Black");
    }
    @Override
    public void talk() {
        System.out.println("Black man");
    }
}
