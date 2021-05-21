import javax.swing.*;
import java.awt.*;

public class TossApp extends JFrame {

    // create coin object
    Coin coin;

    // create panel
    JPanel coinFlipApp = new JPanel();
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

        // quit program on window closure
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // assign layout to panel
        coinFlipApp.setLayout(new BoxLayout(coinFlipApp, BoxLayout.Y_AXIS));

        // set title-frame
        setTitle("Heads or Tails");
        // set size
        setSize(250, 200);

        // create and add the buttons
        coinTossButton = new JButton("50 | 50");
        resetButton = new JButton("Reset the counters");
        coinFlipApp.add(coinTossButton);

        // set labels
        instruction = new JLabel("Press the button to toss a coin!");
        outputLabel = new JLabel("Try your luck!");
        headsCounter = new JLabel("# of heads-rolls: " + coin.headCounter);
        tailsCounter = new JLabel("# of tails-rolls: " + coin.tailsCounter);

        // add labels to layout
        coinFlipApp.add(instruction);
        coinFlipApp.add(outputLabel);
        coinFlipApp.add(headsCounter);
        coinFlipApp.add(tailsCounter);

        // add reset-button for counter
        coinFlipApp.add(resetButton);

        // Controllers
        TossController controller = new TossController(outputLabel, coin, headsCounter, tailsCounter);
        // extra - resets
        ResetController rcontroller = new ResetController(coin, headsCounter, tailsCounter, outputLabel);

        // event triggers
        coinTossButton.addActionListener(controller);
        resetButton.addActionListener((rcontroller));

        add(coinFlipApp);
    }
}
