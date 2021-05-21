import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TossController implements ActionListener {
    // text-label to store the result
    JLabel result;
    // Empty Coin object
    Coin coin;
    // counter labels
    JLabel hCounter, tCounter;

    // constructor, takes a coin object (which will be the coin object generated in TossApp) and a JLabel to store
    // the result in (which will be the JLabel generated in TossApp)
    public TossController(JLabel result, Coin coin, JLabel hCounter, JLabel tCounter){
        this.result = result;
        this.coin = coin;
        this.hCounter = hCounter;
        this.tCounter = tCounter;
    }

    // gets called when an event gets registered
    @Override
    public void actionPerformed(ActionEvent e){
        // flip the coin, aka generate a 1 or a 2
        coin.flip();
        // check if the result is even
        if(coin.decider){
            result.setText("Head");
            coin.headCounter++;
        }
        // if it's odd
        else{
            result.setText("Tails");
            coin.tailsCounter++;
        }
        // update the counter labels
        hCounter.setText("# of heads rolled: " + coin.headCounter);
        tCounter.setText("# of tails rolled: " + coin.tailsCounter);
    }
}
