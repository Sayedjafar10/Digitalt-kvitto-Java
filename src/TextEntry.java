class TextEntry extends Entry {
    private String name;

    public TextEntry(String name, double price, int count) { //konstruktor
        super(price, count);
        setName(name);
    }

    public void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Namn kan inte vara tomt");

        }
    }

    @Override
    public void printEntry() {

        String shortName= name;
        if(shortName.length()>18){
            shortName=shortName.substring(0,18);  // använder substring för att visa max 18 tecken av namnet på produkten
        }
        String proName=String.format("%-20s", shortName);
        double antal=getCount();
        double priset=getPrice();
        double total = antal*priset;


        String antalet= String.format("%2d x ", getCount());

        String pris=String.format("%8.2f = ", getPrice());
        String totallet= String.format("%8.2f kr",total);


        System.out.println(proName+antalet+pris+totallet);
    }
}