package test_001;

public class dog {
    int dogage;

    public dog(String name){
        System.out.println("小狗的名字是:"+name);
    }

    public void setDogage(int a){
        dogage= a;
    }

    public int getDogage(){
        System.out.println("小狗的名字是:"+dogage);
        return  dogage;
    }

    public static void main(String[] args){
        dog mydog = new dog("hhh");
        mydog.setDogage(6);
        mydog.getDogage();
        System.out.println(mydog.dogage);
    }

}
