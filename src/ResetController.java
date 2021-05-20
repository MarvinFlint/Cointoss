import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetController implements ActionListener {
    Coin coin;
    JLabel hCounter;
    JLabel tCounter;
    JLabel result;

    public ResetController(Coin coin, JLabel hCounter, JLabel tCounter, JLabel result){
        this.coin = coin;
        this.hCounter = hCounter;
        this.tCounter = tCounter;
        this.result = result;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        coin.headCounter = 0;
        coin.tailsCounter = 0;
        result.setText("Try your luck!");
        hCounter.setText("# of heads rolled: " + coin.headCounter);
        tCounter.setText("# of tails rolled: " + coin.tailsCounter);
    }
}
