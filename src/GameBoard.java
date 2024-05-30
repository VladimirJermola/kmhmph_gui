import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {
    private JComboBox<String> cmbTimes;
    private JButton btnShow;
    private JTextArea txtArea;
    private JRadioButton rdoKmh;
    private JRadioButton rdoMph;

    public GameBoard() {
        setPreferredSize(new Dimension(325, 300));
        setLayout(new BorderLayout());

        createComponents();
    }

    private void createComponents() {
        //Loome taustavärvi
        Color background = new Color(177, 250, 239);
        //loome kolm paneeli
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel centerPanel = new JPanel(new BorderLayout());
        JPanel rightPanel = new JPanel(); //Default on FlowLayout

        centerPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5,5));
        //rightPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBackground(background);
        rightPanel.setPreferredSize(new Dimension(100,100));

        //topPaneli sisu
        JLabel lblTime = new JLabel("Mitu korda teeme?");
        topPanel.add(lblTime);

        cmbTimes = new JComboBox<>(new String[]{"1", "2", "3", "4", "5"});
        topPanel.add(cmbTimes);

        btnShow = new JButton("Näita");
        topPanel.add(btnShow);
        //centerPanel sisu
        txtArea = new JTextArea(10,15);
        txtArea.setFont(new Font("Courier", Font.PLAIN, 14));
        centerPanel.add(new JScrollPane(txtArea));

        ButtonGroup btnGroup = new ButtonGroup(); //Raadionuppude grupeerimiseks
        rdoKmh = new JRadioButton("Kmh");
        rdoKmh.setBackground(background);
        rdoMph = new JRadioButton("Mph");
        rdoMph.setBackground(background);
        rdoKmh.setSelected(true);
        btnGroup.add(rdoKmh);

        btnGroup.add(rdoMph);
        rightPanel.add(rdoKmh);
        rightPanel.add(rdoMph);




        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(rightPanel, BorderLayout.EAST);



    }//meetodi lõpp

    public JComboBox<String> getCmbTimes() {
        return cmbTimes;
    }

    public JButton getBtnShow() {
        return btnShow;
    }

    public JTextArea getTxtArea() {
        return txtArea;
    }

    public JRadioButton getRdoKmh() {
        return rdoKmh;
    }

    public JRadioButton getRdoMph() {
        return rdoMph;
    }
}//Klassi lõpp
