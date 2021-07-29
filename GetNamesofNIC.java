import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;

class Test{
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            Enumeration<NetworkInterface> networkInterface = NetworkInterface.getNetworkInterfaces();
            System.out.println("Network Display \n");
            for(NetworkInterface element : Collections.list(networkInterface)){
                System.out.printf("%-8s %-32s \n", element.getName(),element.getDisplayName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}