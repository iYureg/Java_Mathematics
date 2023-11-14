
/*
 * entry point
 * class Program
 */

import Models.Sum;
import Presentation.Presenter;
import View.View;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new Sum(), new View());

        p.handler();
        p.handler();
        p.handler();
    }
}