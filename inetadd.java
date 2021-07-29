import java.net.InetAddress;
import java.net.UnknownHostException;

public class inetadd {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress myaddress = InetAddress.getByName("google.com");
        if (myaddress.isLinkLocalAddress()){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        
    }
}
