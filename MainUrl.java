
import java.net.MalformedURLException;
import java.net.URL;

class MainUrl {

    public static void main(String[] args) throws MalformedURLException {
        System.out.println("hello");
        String web = "https://www.udemy.com/course/network-programming-java-network-programming-nio-tcpip-sockets/learn/lecture/27228358#notes";
        URL url = new URL(web);
        getURL(url);
    }
     
    static void getURL(URL url){
        System.out.println("HOST = " + url.getHost());
        System.out.println("PATH = " + url.getPath());
        System.out.println("REF = " + url.getRef());
        System.out.println("PORT = " + url.getPort());
    }
}

