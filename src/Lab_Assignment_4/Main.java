package Lab_Assignment_4;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Tree Olive = new Tree("Olive", "A", true, 5.5, true);
        Tree Pine = new Tree("pine", "B", false, 14, false);
        Tree Apple = new Tree("Apple", "X", false, 5, true);
        Tree Lemon = new Tree("Lemon", "C", true, 8, true);
        Tree Grape = new Tree("Grape", "E", false, 20, true);
        Tree Orange = new Tree("Orange", "C", false, 10, true);
        Olive.Print();
        Forest _Wadi_Rum = new Forest("Wadi Rum", "peopeope");
        _Wadi_Rum.AddTree(Olive);
        _Wadi_Rum.AddTree(Pine);
        _Wadi_Rum.AddTree(Apple);
        _Wadi_Rum.AddTree(Lemon);
        _Wadi_Rum.AddTree(Grape);
        _Wadi_Rum.FindTree(Lemon);
        _Wadi_Rum.FindTree(Orange);
        for (int i = 0; i < _Wadi_Rum.getTrees().size(); i++) {
            System.out.println(_Wadi_Rum.getTrees().get(i).getName());
        }
        _Wadi_Rum.RemoveFruitfulTrees();
        for (int i = 0; i < _Wadi_Rum.getTrees().size(); i++) {
            System.out.println("--" + _Wadi_Rum.getTrees().get(i).getName());
        }

    }
}
