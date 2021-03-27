package Stack;

import javax.swing.*;
import java.util.Stack;

public class BackStack {
    private static BackStack instance;
    private final Stack<JPanel> backStack;

    private BackStack() {
        this.backStack = new Stack<>();
    }

    public static synchronized BackStack getInstance() {
        if (instance == null) {
            instance = new BackStack();
        }
        return instance;
    }

    public Stack<JPanel> getBackStack() {
        return backStack;
    }
}
