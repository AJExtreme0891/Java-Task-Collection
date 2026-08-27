
import javax.swing.*;
import java.util.Map;

public class TaskLauncher{

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task Launcher");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        for (Map.Entry<String, Runnable> entry : Task_Registry.getTasks().entrySet()) {
            JButton button = new JButton(entry.getKey());

            button.addActionListener(e -> entry.getValue().run());

            panel.add(button);
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}