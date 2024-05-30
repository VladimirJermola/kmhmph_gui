import javax.swing.*;

public class App {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View(); // Tee JFrame

        //JFrame view = new JFrame();
        //view.setTitle("Tekst");
        new Controller(model, view);//Loome kontrolleri(Nupu jaoks)



        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //view.setResizable(false);//Frame suurust muuta ei saa
        view.pack(); //Paiguta komponendid kohale
        view.setLocationRelativeTo(null); //Ekraani keskele
        view.setVisible(true);

    }
}
