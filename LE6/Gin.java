class Gin extends Decorate {
    Gin(Offering offering){
        this.offering = offering;
    }
    String getName(){
        return offering.getName() + "with Gin";
    }
    int getprice(){
        return offering.getprice() + 65;
    }
}