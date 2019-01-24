package frontend.hellobruno;


import example.HelloWorld;
import example.HelloWorldService;

/**
 * Created by davidevincenzodilecce on 22/01/2019.
 */
public class EntryPoint {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorldService().getHelloWorldPort();
        System.out.println(helloWorld.sayHelloWorldFrom("bruno"));
    }

}
