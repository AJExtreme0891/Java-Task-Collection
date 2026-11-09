package Tasks.Recursion;

import java.util.Arrays;

public class TowersOfHanoi {

    public static Integer[][] tower;

    public static void main(String[] args) {
        int n = 7;
        createTower(n);
        hanoi(n, 0, 2, 1);
    }

    public static void createTower(int n) {
        tower = new Integer[3][n];
        int hold = 7;
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

    public static void hanoi(int n, int von, int nach, int ueber) {
        if (n > 0) {
            hanoi(n - 1, von, ueber, nach);
            drawTower();
            //bewege oberste Scheibe von 'von' nach 'nach'
            bewegeScheibe(von, nach, n);
            hanoi(n - 1, ueber, nach, von);
        }
    }

    public static void bewegeScheibe(int von, int nach, int n) {
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
