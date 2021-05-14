import java.util.ArrayList;

// A Purse holds a collection of Coins
public class Purse {
    private ArrayList<Coin> coins;

    public Purse() {
        coins = new ArrayList<>();
    }

    // adds aCoin to the purse
    public void add(Coin aCoin) {
        coins.add(aCoin);
    }

    // returns total value of all coins in purse
    public double getTotal() {
        double sum = 0;
        for (int i = 0; i < coins.size(); i++) {
            sum += coins.get(i).getValue();
        }
        return sum;
    }

    // returns the number of coins in the Purse that matches aCoin
// (both myName & myValue)
    public int count(Coin aCoin) {
        int total = 0;
        for (int i = 0; i < coins.size(); i++) {
            if (aCoin.equals(coins.get(i))) {
                total += 1;
            }
        }
        return total;
    }

    // returns the name of the Coin in the Purse that has the smallest value
    public String findSmallest() {
        double min = 1;
        int minCoin =0;
        for (int i = 0; i < coins.size(); i++) {
            if (coins.get(i).getValue() < min) {
                min = coins.get(i).getValue();
                minCoin = i;
            }
        }
        return coins.get(minCoin).getName();
    }

}

