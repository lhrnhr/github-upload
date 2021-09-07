package NvWa;

public class FactoryTest {
    public static void main(String[] args) {
        AbstractHumanFactory bagualu = new HumanFactory();
        Human blackMan = bagualu.createHuman(BlackHuman.class); //黑人诞生了
        Human yellowMan = bagualu.createHuman(YellowHuman.class); //黄人诞生了
        Human whiteMan = bagualu.createHuman(WhiteHuman.class); //白人诞生了
        whiteMan.getColor();

    }

}
