public class Coin {
    // create a deciding variable
    // I chose to use a random number. even is heads, odd is tails
    int decider;

    // create counters for either result
    int headCounter = 0;
    int tailsCounter = 0;

    // method to flip the coin
    public void flip(){
        // set the decider to a random number between 1 and 2, aka 50% for either;
        decider = (int)Math.floor(Math.random()*(2-1+1)+1);
    }
}
