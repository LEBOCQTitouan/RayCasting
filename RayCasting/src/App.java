import engine.Engine;
import graphic.AppWindow;

public class App {

    private AppWindow window;
    private Engine engine;

    public App() {
        this.engine = new Engine();
        this.window = new AppWindow(400, 400);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Starting the App");

        App app = new App();
        app.start();
    }

    public void start() {
        this.window.setVisible(true);
        this.window.pack();
    }
}
