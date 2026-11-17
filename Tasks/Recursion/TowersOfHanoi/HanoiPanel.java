
package Tasks.Recursion.TowersOfHanoi;

import javax.swing.*;
import java.awt.*;

public class HanoiPanel extends JPanel {

    private int[][] tower;

    public HanoiPanel(int[][] tower) {
        this.tower = tower;
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        int n = tower[0].length;

        int baseY = getHeight() - 60;
        int diskHeight = 30;

        for (int j = 0; j < 3; j++) {

            int centerX = (j + 1) * getWidth() / 4;

            // Tower pole
            g2.setColor(Color.GRAY);
            g2.fillRect(centerX - 3, baseY - n * diskHeight - 20,
                    6, n * diskHeight + 20);

            // Discs
            for (int i = 0; i < n; i++) {

                int value = tower[j][i];

                if (value == 0) continue;

                int width = 30 + value * 25;
                int x = centerX - width / 2;
                int y = baseY - (i + 1) * diskHeight;

                g2.setColor(Color.orange);

                g2.fillRoundRect(x, y, width, diskHeight - 2, 10, 10);
            }
        }

        // Base
        g2.setColor(Color.DARK_GRAY);
        g2.fillRect(50, baseY, getWidth() - 100, 8);
    }
}
