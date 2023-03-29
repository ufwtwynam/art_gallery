import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artwork artwork;
    Customers customer1 = new Customers("Umar");

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Louvre");
        Artwork monaLisa = new Artwork("Mona Lisa", "Da Vinci", 10, 12345);
        Artwork art2 = new Artwork("Art2", "Banksy", 11, 123456);
        Artwork artartart = new Artwork("303", "Anonymous", 3, 333);
        gallery.addArtwork(monaLisa);
        gallery.addArtwork(art2);
        gallery.addArtwork(artartart);


    }


    @Test
    public void galleryHasName(){
        assertThat(gallery.getName()).isEqualTo("Louvre");
    }

//    @Test
//    public void galleryHasStock(){
//        assertThat(gallery.getStock()).isEqualTo()
//    }

    @Test
    public void galleryHasTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canCountStock(){
        assertThat(gallery.getStockCount()).isEqualTo(3);
    }

    @Test
    public void canAddArtwork(){
        Artwork scream = new Artwork("Scream", "Google", 0.10, 111);
        gallery.addArtwork(scream);
        assertThat(gallery.getStockCount()).isEqualTo(4);
    }

    @Test
    public void canSellArtwork(){
        Artwork scream = new Artwork("Scream", "Google", 0.10, 111);
        gallery.addArtwork(scream);
        gallery.sellArtwork(scream, customer1);
        assertThat(gallery.getStockCount()).isEqualTo(3);
    } //still to check till etc
}
