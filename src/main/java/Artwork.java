public class Artwork {
    private String title;
    private String artist;
    private int nft;
    private double price;

    public Artwork(String title, String artist, double price, int nft){
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }

    public String getTitle(){
        return this.title;
    }

    public String getArtist(){
        return this.artist;
    }

    public double getPrice(){
        return this.price;
    }

    public int getNft(){
        return this.nft;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setNft(int nft){
        this.nft = nft;
    }


}
