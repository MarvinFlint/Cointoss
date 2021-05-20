import javax.swing.*;
import java.awt.*;

public class TossApp extends JFrame {

    // create coin object
    Coin coin;

    // create buttons
    // buttons to flip a coin
    JButton coinTossButton;
    // button to reset counters
    JButton resetButton;

    // create text-labels
    JLabel instruction;
    JLabel headsCounter;
    JLabel tailsCounter;

    // create output-label
    JLabel outputLabel;

    public TossApp(){
        // generate coin object
        coin = new Coin();
        // set title-frame
        setTitle("Heads or Tails");
        // set size
        setSize(200, 400);
        // set Layout
        setLayout(new FlowLayout());

        // create and add the button
        coinTossButton = new JButton("50 | 50");
        add(coinTossButton);

        // set labels
        instruction = new JLabel("Press the button to toss a coin!");
        outputLabel = new JLabel("Try your luck!");
        headsCounter = new JLabel("# of heads-rolls: " + coin.headCounter);
        tailsCounter = new JLabel("# of tails-rolls: " + coin.tailsCounter);

        // add labels to layout
        add(instruction);
        add(outputLabel);
        add(headsCounter);
        add(tailsCounter);

        // Controller
        TossController controller = new TossController(outputLabel, coin, headsCounter, tailsCounter);
        // event trigger
        coinTossButton.addActionListener(controller);
    }

}
