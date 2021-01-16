package enums;

public class BeerTest {


        public static void main(String[] args) {
            Beer beer = new Beer(Beer.Brand.CORONA, Glass.JARRA);
            beer.serve();
        }


}
