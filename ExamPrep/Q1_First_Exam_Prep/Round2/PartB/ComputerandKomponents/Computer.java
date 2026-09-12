package ExamPrep.Q1_First_Exam_Prep.Round2.PartB.ComputerandKomponents;

import java.util.ArrayList;

public class Computer {
    private MainBoard mainBoard;
    private CPU cpu;
    private ArrayList<RAMmodule> ram;
    private ArrayList<StorageDevice> storageDevice;


    protected Computer(MainBoard mainBoard, CPU cpu){
        this.cpu = cpu;
        this.mainBoard = mainBoard;

    }

}
