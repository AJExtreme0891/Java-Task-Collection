package Tasks.Recursion.TowersOfHanoi;

import javax.swing.*;


public class TowersOfHanoi {

    public static int[][] tower;
    public static HanoiPanel panel;



    public static void main(String[] args) {

        int n = 7;
        createTower(n);

        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("Towers of Hanoi");

            panel = new HanoiPanel(tower);

            frame.add(panel);
            frame.setSize(800, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            new Thread(() -> hanoi(n, 0, 2, 1)).start();
        });
    }

    public static void showFrame() {

        panel.repaint();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void createTower(int n) {
        tower = new int[3][n];
        int hold = n;
        for (int i = 0; i < tower[0].length; i++) {
            tower[0][i] = hold;
            hold--;
        }
        for (int i = 0; i < tower[0].length; i++) {
            tower[1][i] = 0;
            tower[2][i] = 0;

        }

    }

    public static void drawTower() {

        for (int i = 0; i < tower.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < tower[0].length; j++) {
                System.out.print(tower[i][j] + ", ");
            }
            System.out.println(" ]");
        }
        System.out.println(" ");
    }

    public static void drawTowerUpright() {

        for (int i = (tower[0].length-1); i >= 0; i--) {
            System.out.print(" ");
            for (int j = 0; j < tower.length; j++) {
                System.out.print(tower[j][i] + "  " );
            }
            System.out.println(" ");
        }
        System.out.println(" ");



    }

    public static void hanoi(int n, int von, int nach, int ueber) {
        if (n > 0) {
            hanoi(n - 1, von, ueber, nach);

            bewegeScheibe(von, nach, n);
            drawTowerUpright();
            showFrame();

            hanoi(n - 1, ueber, nach, von);

        }
    }


    public static void bewegeScheibe(int von, int nach, int n) {

        int i = tower[von].length - 1;


        while (tower[von][i] == 0) {
            i--;
        }

        int scheibe = tower[von][i];
        tower[von][i] = 0;


        int j = tower[nach].length - 1;

        while (j >= 0 && tower[nach][j] == 0) {
            j--;
        }

        tower[nach][j + 1] = scheibe;
    }


    public static void bewegeScheibePTT(int von, int nach, int n) {
        int i;
        int j;
        int index = 0;
        int hold = n + 12;
        for (i = 0; i < tower[von].length; i++) {

            if (tower[von][i] != 0 && tower[von][i] < hold){
                hold = tower[von][i];
                index = i;
            }
        }


        tower[von][index] = 0;
        index = 0;
        int hold2 = n + 12;
        for (j = 0; j < tower[nach].length; j++) {

            if (tower[nach][j] != 0 && tower[nach][j] < hold2){
                hold2 = tower[nach][j];
                index = j;
            }
        }
        if (index != 0 || hold2 != n+12 ){
            index++;
        }

        tower[nach][index] = hold;

    }

}
