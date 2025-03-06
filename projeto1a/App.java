package projeto1a;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nHello!");
        String version = System.getProperty("java.version");
        String user = System.getProperty("user.name");
        String dir = System.getProperty("user.dir");
        System.out.println("Running Java Version "+version+" in the following working directory"+dir+" as User "+user+"\n");
    }  
}
