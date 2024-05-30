import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private final GameBoard gameBoard;
    public View() {
        super("Kmh <-> Mph");// JFrame konstruktor
        //setResizable(false);//Frame suurust muuta ei saa

        gameBoard = new GameBoard();

        JPanel container = new JPanel(new BorderLayout());
        // container peale paneme gameBoard
        container.add(gameBoard, BorderLayout.CENTER);

        add(container); //Lisa container JFrame peale

        this.add(container);
    }

    //Registreerime nupu Näita
    public  void registerButtonListener(ActionListener actionListener) {
        gameBoard.getBtnShow().addActionListener(actionListener);
    }
    public JComboBox<String> getCmbTimes() {
        return gameBoard.getCmbTimes();
    }

    public JButton getBtnShow() {
        return gameBoard.getBtnShow();
    }

    public JTextArea getTxtArea() {
        return gameBoard.getTxtArea();
    }

    public JRadioButton getRdoKmh() {
        return gameBoard.getRdoKmh();
    }

    public JRadioButton getRdoMph() {
        return gameBoard.getRdoMph();
    }
}
