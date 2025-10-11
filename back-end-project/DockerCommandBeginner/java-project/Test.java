import java.util.Properties;

class Test{

    public static void printMyFunc(){
        System.out.println("Ok, I am fine bro!");
        Properties props=System.getProperties();
        System.out.println(props);
    }
    public static void main(String[] args) {
        System.out.println("Hello, Hi Zee!!!");
        printMyFunc();
    }
}