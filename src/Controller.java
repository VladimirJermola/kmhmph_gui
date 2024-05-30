public class Controller {
    public Controller(Model model, View view) {
        view.registerButtonListener(new MyListener(model,view));
    }
}
