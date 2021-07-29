import java.net.InetAddress;
import java.net.UnknownHostException;

public class inet {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress names[]= InetAddress.getAllByName("google.com");

        for (InetAddress name : names){
            System.out.println(name);
        }

    }
}
