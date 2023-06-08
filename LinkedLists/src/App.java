public class App {
    public void recall(String name) {
        System.out.println("Hello "+ name);
    }
    public static void main(String[] args) throws Exception {
        HashClass app = new HashClass();
        app.recall("Mike");
    }
}
