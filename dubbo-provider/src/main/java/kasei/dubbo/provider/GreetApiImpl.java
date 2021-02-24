package kasei.dubbo.provider;

import kasei.dubbo.api.GreetApi;

public class GreetApiImpl implements GreetApi {


    @Override
    public String sayHello(String name) {
        return "hi, " + name;
    }
}
