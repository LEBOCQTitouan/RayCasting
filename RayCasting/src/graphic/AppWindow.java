package graphic;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

import linkEngineToGraphic.UpdateChecker;

public class AppWindow extends JFrame implements UpdateChecker {

    /**
     * Jframe serialVersionUID
     */
    private static final long serialVersionUID = 7210001072957076130L;

    private Canvas canvas;

    public AppWindow() {
        super();
        this.setName("3d engine - by LEBOCQ Titouan");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /** Canvas setup */
        this.canvas = new Canvas();
        this.add(canvas);
        this.canvas.setBackground(Color.BLUE);
    }

    public AppWindow(int width, int height) {
        this();
        /** setup size of the window */
        this.setMinimumSize(new Dimension(width, height));
        this.canvas.setMinimumSize(new Dimension(width, height));
    }

    @Override
    public void update(Object o) {
        // TODO
    }
}
