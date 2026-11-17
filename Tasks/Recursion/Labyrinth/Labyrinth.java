package Tasks.Recursion.Labyrinth;

import Tasks.Recursion.MazePanel;

import javax.swing.*;
import java.awt.*;

public class Labyrinth {

    static MazePanel panel;

    static String[][] rawLabyrinth =
            {
                    {"██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██"},
                    {"██", "  ", "  ", "  ", "██", "██", "██", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "██", "██", "██", "  ", "██", "██", "██", "  ", "  ", "  ", "  ", "  ", "  ", "██", "██", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "██", "██", "██", "██", "██", "██", "██"},
                    {"██", "  ", "██", "  ", "  ", "  ", "  ", "██", "██", "  ", "██", "  ", "██", "██", "  ", "██", "  ", "  ", "  ", "██", "██", "██", "  ", "██", "██", "██", "██", "  ", "██", "██", "  ", "██", "██", "██", "██", "██", "  ", "██", "  ", "██", "██", "██", "  ", " E"},
                    {"██", "  ", "██", "  ", "██", "██", "  ", "██", "██", "  ", "██", "  ", "██", "██", "  ", "██", "  ", "██", "  ", "  ", "  ", "██", "  ", "  ", "  ", "██", "██", "  ", "██", "██", "  ", "██", "██", "██", "██", "██", "  ", "██", "  ", "██", "  ", "██", "  ", "██"},
                    {"██", "  ", "  ", "  ", "██", "██", "  ", "  ", "  ", "██", "  ", "  ", "██", "██", "  ", "  ", "  ", "██", "  ", "██", "  ", "██", "  ", "██", "██", "  ", "  ", "  ", "██", "██", "  ", "  ", "  ", "  ", "  ", "██", "  ", "██", "  ", "██", "  ", "██", "  ", "██"},
                    {"██", "  ", "██", "██", "██", "██", "██", "██", "  ", "██", "██", "██", "██", "██", "  ", "██", "██", "██", "  ", "██", "  ", "██", "  ", "██", "██", "██", "██", "  ", "  ", "  ", "  ", "██", "██", "██", "██", "██", "  ", "██", "  ", "  ", "  ", "██", "  ", "██"},
                    {"██", "  ", "██", "██", "  ", "  ", "  ", "██", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "██", "██", "██", "  ", "  ", "  ", "██", "  ", "██", "██", "██", "██", "  ", "██", "██", "  ", "██", "██", "██", "██", "██", "  ", "██", "██", "██", "  ", "██", "  ", "██"},
                    {"██", "  ", "██", "██", "██", "██", "  ", "██", "  ", "██", "██", "██", "  ", "██", "██", "██", "██", "██", "██", "██", "██", "██", "  ", "  ", "  ", "  ", "██", "  ", "██", "██", "  ", "██", "██", "  ", "██", "██", "██", "██", "██", "██", "  ", "  ", "  ", "██"},
                    {"██", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "██", "██", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "██", "██", "  ", "██", "  ", "██", "██", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "██", "██", "██"},
                    {"██", "O ", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██", "██"},


            };

    public static Cell[][] Labyrinth = convertMaze(rawLabyrinth);

    public static Cell[][] convertMaze(String[][] rawMaze) {

        Cell[][] result = new Cell[rawMaze.length][rawMaze[0].length];

        for (int row = 0; row < rawMaze.length; row++) {
            for (int col = 0; col < rawMaze[row].length; col++) {

                CellType type = switch (rawMaze[row][col]) {
                    case "██" -> CellType.WALL;
                    case " E" -> CellType.END;
                    case "O " -> CellType.START;
                    default -> CellType.EMPTY;
                };

                result[row][col] = new Cell(type, 25);
            }
        }

        return result;
    }


    public static void createWindow() {

        JFrame frame = new JFrame("Recursive Labyrinth");

        panel = new MazePanel();

        frame.add(panel);

        frame.pack();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }


    public static void drawMaze(Graphics g) {

        for (int row = 0; row < Labyrinth.length; row++) {

            for (int col = 0; col < Labyrinth[row].length; col++) {

                Cell cell = Labyrinth[row][col];

                int x = col * cell.size;
                int y = row * cell.size;

                switch (cell.type) {

                    case WALL -> g.setColor(Color.DARK_GRAY);
                    case EMPTY -> g.setColor(Color.WHITE);
                    case MARK -> g.setColor(Color.ORANGE);
                    case END -> g.setColor(Color.GREEN);
                    case START -> g.setColor(Color.CYAN);

                }

                g.fillRect(x, y, cell.size, cell.size);

                g.setColor(Color.LIGHT_GRAY);

                g.drawRect(x, y, cell.size, cell.size);
            }
        }
    }


    public static void drawLabyrinth() {

        panel.repaint();

        try {
            Thread.sleep(120);
        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            createWindow();

            new Thread(() -> {

                drawLabyrinth();

                findPath(9, 1);

            }).start();

        });

    }

//    public static void createLabyrinth(int height, int width){
//        Labyrinth = new String[height][width];
//    }

    public static void drawLabyrinthConsole() {

        for (int i = 0; i < Labyrinth.length; i++) {
            System.out.print("");
            for (int j = 0; j < Labyrinth[0].length; j++) {
                System.out.print(Labyrinth[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static boolean findPath(int row, int column) {

        if (Labyrinth[row][column].type == CellType.END) {
            return true;
        }

        if (Labyrinth[row][column].type == CellType.WALL ||
                Labyrinth[row][column].type == CellType.MARK) {

            return false;
        }

        mark(row, column);

        drawLabyrinth();

        if (findPath(row - 1, column)) { return true; }
        if (findPath(row + 1, column)) { return true; }
        if (findPath(row, column - 1)) { return true; }
        if (findPath(row, column + 1)) { return true; }

        removeMark(row, column);

        drawLabyrinth();

        return false;
    }

    public static void mark(int row, int column) {
        Labyrinth[row][column].type = CellType.MARK;
    }

    public static void removeMark(int row, int column) {
        Labyrinth[row][column].type = CellType.EMPTY;

    }


}
