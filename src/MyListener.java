import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
    private  Model model;
    private  View view;
    public MyListener(Model model, View view) {
        this.model = model;
        this.view = view;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("Keegi klikkis nuppu :)");
        //System.out.println(view.getCmbTimes().getSelectedItem());
        int counter = Integer.parseInt(view.getCmbTimes().getSelectedItem().toString());
        model.setTimes(counter);//Muudab mudelis rippmenüüst saadud väärtuse
        view.getTxtArea().setText("");//Teeb textarea tühjaks
        if(view.getRdoKmh().isSelected()) {
            //Kmh on valitud
            showKmhMph();
        }
        else {
            showMphKmh();
        }

    }

    private void showKmhMph() {
        for(int x = 0; x < model.getTimes(); x++) {
            String result = model.getKmhResult();
            view.getTxtArea().append(result);
        }
    }

    private void showMphKmh() {
        for(int x = 0; x < model.getTimes(); x++) {
            String result = model.getMphResult();
            view.getTxtArea().append(result);
        }
    }


}
