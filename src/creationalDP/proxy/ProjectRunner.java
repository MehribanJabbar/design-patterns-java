package creationalDP.proxy;

import java.net.Proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        var project= new ProxyProject( " https://test-url.com");
        project.run();
    }
}
