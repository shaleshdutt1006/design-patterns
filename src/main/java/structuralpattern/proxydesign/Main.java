package structuralpattern.proxydesign;


//Simply, proxy means an object representing another object.A Proxy Pattern "provides the control for accessing
// the original object It provides the protection to the original object from the outside world.
public class Main {

    //Proxy is called if it grants access then we can use original object otherwise we cannot use.
    //Proxy is used because we want access for multiple employees so need proxy of internet
    public static void main(String[] args) {
        OfficeInternetAccess access1 = new ProxyInternetAccess("Ashwani Rajput");
        access1.grantInternetAccess();

        OfficeInternetAccess access2 = new ProxyInternetAccess("Dutt Sahab");
        access1.grantInternetAccess();
    }
}

