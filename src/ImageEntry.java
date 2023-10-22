
class ImageEntry extends Entry {
    private String imagePath;

    public ImageEntry(String imagePath, double price, int count) {
        super(price, count);
        if (imagePath != null && imagePath.length()>0) {
            this.imagePath = imagePath;
        } else {
            throw new IllegalArgumentException("Imagepath kan inte vara tomt");
        }
    }

    @Override
    public void printEntry() {
        String shortName = "<IMAGE>";

        if(shortName.length()>18){
            shortName=shortName.substring(0,18);
        }
        String produktnamn=String.format("%-20s", shortName);


        double antal=getCount();
        double priset=getPrice();
        double total = antal*priset;


        String antalet= String.format("%2d x ", getCount());

        String pris=String.format("%8.2f = ", getPrice());
        String totalet= String.format("%8.2f kr",total);


        System.out.println(produktnamn+antalet+pris+totalet);




    }
}