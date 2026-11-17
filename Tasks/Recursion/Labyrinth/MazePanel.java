
package Tasks.Recursion;

import Tasks.Recursion.Labyrinth.Labyrinth;

import javax.swing.*;
import java.awt.*;

public class MazePanel extends JPanel {

    public MazePanel() {
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Labyrinth.drawMaze(g);
    }

    @Override
    public Dimension getPreferredSize() {

        return new Dimension(
                Labyrinth.Labyrinth[0].length * 25,
                Labyrinth.Labyrinth.length * 25
        );
    }
}
