package Presentation;

import Models.Model;
import View.View;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void handler() {
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Sum: ");
    }
}