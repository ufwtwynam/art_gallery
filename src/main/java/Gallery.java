import java.util.ArrayList;

public class Gallery {

    private String name;
    private ArrayList<Artwork> stock;
    private double till;

//    check back here
    public Gallery(String name){
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = 0;
    }

    public String getName(){
        return this.name;
    }

    public double getTill(){
        return this.till;
    }

    public ArrayList<Artwork> getStock(){
        return stock;
    }

    public void addArtwork(Artwork artwork){
        this.stock.add(artwork);
    }

    public void sellArtwork(Artwork artwork, Customers customer){
        if (this.stock.contains(artwork)){
            this.till += artwork.getPrice();
            customer.decreaseWallet(artwork.getPrice());
            this.stock.remove(artwork);
        }
    }

    public int getStockCount(){
        return this.stock.size();
    }

//    check back here
//     public void setTill(double amount){
//         this.till = amount;
//     }
}
