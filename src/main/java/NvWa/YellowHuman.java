package NvWa;

public class YellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("Yellow");
    }
    @Override
    public void talk() {
        System.out.println("Yellow man");
    }
}
