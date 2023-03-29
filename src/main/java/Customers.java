import java.util.ArrayList;

public class Customers {
    private String name;
    private double wallet;
    private ArrayList<Artwork> ArtworkPurchased;

    //    check wallet, set wallet = wallet incase; after String name put double wallet
    public Customers(String name) {
        this.name = name;
        this.wallet = 0;
        this.ArtworkPurchased = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public double getWallet() {
        return this.wallet;
    }

    public ArrayList<Artwork> getArtworkPurchased() {
        return ArtworkPurchased;
    }


    public void setWallet(double amount) {
        this.wallet = amount;
    }

    public void decreaseWallet(double price) {
        if (this.wallet > price) {
            this.wallet -= price; //forgot to add this.price
        }

//
//    public void buyArtwork(double price){
//        if (this.wallet >= artwork. )
//    }
//
//    public void purchaseArtwork(){
//            if (this.wallet > price){
//                this.wallet -= price;
//                amount = this
//            }
//        }

    }
}


