import javax.script.ScriptException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;

enum ROLE {
    USER,
    CUSTOMER
}

public class Main {

    public static <T> List<T> concact(List<T>... lists) {
//        return Arrays.stream(lists).reduce(new ArrayList<>(), (acc, list) -> {
//            acc.addAll(list);
//            return acc;
//        });

        return Arrays.stream(lists).reduce((acc, list) -> {
            acc.addAll(list);
            return acc;
        }).orElse(new ArrayList<>());
    }

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException, NoSuchFieldException, ScriptException {

        Optional.empty();

//        List<Integer> list = new ArrayList<>();

        String code = "0123456";
        String codeApe = code.substring(0, 5);
        System.out.println(codeApe);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(6);

        concact(list, list2, list3).forEach(System.out::println);


//        System.out.println(ROLE.USER.ordinal());
//        System.out.println(ROLE.CUSTOMER.ordinal());
//        Optional<User> userOptional = Optional.of(new User());
//        userOptional.get();
//        String path = "/api/v25/localhost/users/4/";
//        Pattern pattern = Pattern.compile("/api/v[0-9]+/([^/]+)");
//        Matcher matcher = pattern.matcher(path);
//        if(matcher.find()) {
//            System.out.println(matcher.group(1));
//        }

//        String[] PATHS_BLOCKER_IGNORE = {"GET:/users/token/refresh", "PUT:/users/[0-9]+/accounting_statement", "POST:/users/[0-9]+/confirm"};
//        String method = "GET";
//        long count = 0;
//        String uri = "/users/1/accounting_statement";
//        count = Arrays.stream(PATHS_BLOCKER_IGNORE).filter(regex -> {
//            String[] paths = regex.split(":");
//            String methodReg = paths[0];
//            String pathReg = paths[1];
//            Pattern pattern1 = Pattern.compile(pathReg);
//            Matcher matcher1 = pattern1.matcher(uri);
//            return methodReg.equals(method) &&  matcher1.find();
//        }).count();
//
//
//        System.out.println("count => " + count);

//        String path = "/api/v25/localhost/users/4?fetch_cabinet=true";
//        Pattern pattern = Pattern.compile("/api/v[0-9]+/.+/users/([0-9]+)");
//        Matcher matcher = pattern.matcher(path);
//
////        System.out.println(matcher.group(1));
////        System.out.println(matcher.find());
//        if (matcher.find()) {
//            System.out.println(matcher.group(1));
//        }
//        String[] PATHS_BLOCKER_IGNORE = {"/users/token/refresh", "/users/[0-9]+/accounting_statement"};
////        Pattern pattern1 = Pattern.compile("");
////
//        String path2 = "/api/v1/localhost/users/1/accounting_statement";
//        Long count = Arrays.stream(PATHS_BLOCKER_IGNORE).filter(regex -> {
//            Pattern pattern1 = Pattern.compile(regex);
//            Matcher matcher1 = pattern1.matcher(path2);
//            return matcher1.find();
//        }).count();
//        System.out.println(count + " count ");
//        IntStream.rangeClosed(2017, 2019).forEach(System.out::println);
//                .filter(pattern.asPredicate())
//                .collect(Collectors.toList());

//        String[] paths = path.split("/", 3);
//        System.out.println(path.substring(0, path.indexOf("/", 8)));
//        String codeError = "#000000001";
//        codeError = codeError.replace("#", "");
//        System.out.println(Integer.parseInt(codeError, 10) + "======");
//        class Test {
//            public String name;
//        }
//        ScriptEngineManager manager = new ScriptEngineManager(ClassLoader.getPlatformClassLoader());
//        ScriptEngine engine =manager.getEngineByExtension("js");
//        Object o = engine.eval("let order = new Order();");
//        System.out.println(o);
//        System.out.println(Test.class.getDeclaredField("name").getType().equals(Object.class) + " ============================");
//        System.out.println(Test.class.getSuperclass().equals(Object.class));
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
    private String test;

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