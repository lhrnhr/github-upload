package NvWa;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> clazz) {
        Human human = null;
        try {
            human = (Human) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) { //异常处理
            System.out.println("人种产 生错误");
        }
        return (T) human;
    }

}
