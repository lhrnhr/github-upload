package test_001;

public class LoggerTest {
    public static void main(String[] args){
        Logger logger =new Logger();

        logger.setFormat("hh");
        System.out.println(logger.getFormat());

    }
}
