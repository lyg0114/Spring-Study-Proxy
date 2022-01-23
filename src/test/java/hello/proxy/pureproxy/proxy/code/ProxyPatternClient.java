package hello.proxy.pureproxy.proxy.code;

public class ProxyPatternClient {

    private Subjetc subjetc;

    public ProxyPatternClient(Subjetc subjetc) {
        this.subjetc = subjetc;
    }

    public void execute(){
        subjetc.operation();
    }




}
