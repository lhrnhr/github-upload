package test_001;

public class Logger {
    private String format;  //改变量使用private修饰，子类无法直接访问该变量，只能使用该类里面的public方法
    public String getFormat(){
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
