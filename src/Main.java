import test.User;

import javax.print.DocFlavor;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.stream.Collectors;

enum ROLE {
    USER,
    CUSTOMER
}

public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
//        System.out.println(ROLE.USER.ordinal());
//        System.out.println(ROLE.CUSTOMER.ordinal());
//        Optional<User> userOptional = Optional.of(new User());
//        userOptional.get();
        String codeError = "#000000001";
        codeError = codeError.replace("#", "");
        System.out.println(Integer.parseInt(codeError, 10) + "======");
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("greg");
//        System.out.println("greg");
//        HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://api.github.com/users/gmogithub")).GET().build();
//        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());
//        var str = "";
//        HttpClient httpClient = HttpClient.newHttpClient();
//        httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenAccept(resp -> System.out.println(resp.body()));
    }
}


interface Test {
    public String getTest();

    public void run();
}


class TestImpl implements Test {


    private String name;
    private String code;
    private String id;

    public String getId() {
        return id;
    }

    @Override
    public String getTest() {
        return null;
    }

    @Override
    public void run() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

class Order {
    String id;
}

class TestImpl2 implements Test {
    private ArrayList<String> idsCmdValidate = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();

    @Override
    public String getTest() {
        return null;
    }

    @Override
    public void run() {
//        ArrayList<Order> orders1 = new ArrayList<>();
        Map<String, Order> orders2 = new HashMap<>();
        //        orders.stream().filter((Order order) -> idsCmd.contains(order.id)).collect(Collectors.toList());
        for (Order order : orders) {
            for (String id : idsCmdValidate) {
                if (orders2.containsKey(id)) orders2.put(id, order);
            }
        }
    }


}

class Service {
    public Test test = new TestImpl2();


    public void init() {
        test.run();
    }
}