/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;

public class DrivableTrader extends Trader<Drivable> {

    /**
     * Construct a Trader, giving them the given inventory,
     * wishlist, and money.
     *
     * @param inventory Objects in this Trader's inventory
     * @param wishlist  Objects in this Trader's wishlist
     * @param money     The Trader's money
     */
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money) {
        super(inventory, wishlist, money);
    }

    public DrivableTrader(int m) {
        super(m);
    }

    @Override
    public void addToWishlist(Drivable d) {
        super.addToWishlist(d);
    }

    @Override
    public int getSellingPrice(Drivable d) {
        int super_price = super.getSellingPrice(d);

        if(super_price == Tradable.MISSING_PRICE) {
            return super_price;
        }
        return d.getMaxSpeed() + super_price;
    }

    /**
     * Exchange money from other to this DrivableTrader according to the price of item,
     * if other has enough money. Otherwise, returns False.
     *
     * @return True if the exchange was completed.
     */
    public boolean exchangeMoney(DrivableTrader o, Drivable d) {
        return super.exchangeMoney(o, d);
    }

    /**
     * Attempt to sell all items that are in both this Trader's inventory
     * and in other's wishlist.
     *
     * @return True iff at least one item was sold from this Trader to other
     */
    public boolean sellTo(DrivableTrader o) {
        return super.sellTo(o);
    }

    /**
     * Buy items from other.
     *
     * @return True iff at least one item was bought from other.
     */
    public boolean buyFrom(DrivableTrader o) {
        return super.buyFrom(o);
    }

    public String toString() {
        return super.toString();
    }

    public List<Drivable> getWishlist(){
        return super.getWishlist();
    }

    public List<Drivable> getInventory(){
        return super.getInventory();
    }
}