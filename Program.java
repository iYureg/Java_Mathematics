
/*
 * entry point
 * class Program
 */

import Models.Differ;
import Models.Multipliy;
import Models.Sum;
import Presentation.Presenter;
import View.View;

public class Program {
    public static void main(String[] args) {
        Presenter sum = new Presenter(new Sum(), new View());
        Presenter diff = new Presenter(new Differ(), new View());
        Presenter mult = new Presenter(new Multipliy(), new View());

        sum.handler();
        diff.handler();
        mult.handler();
    }
}