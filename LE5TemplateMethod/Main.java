class Main{
    public static void main(String args[]){
        Beverage b = new Whisky();
        b.templateMethod(100);
        b = new Rum();
        b.templateMethod(150);
    }
}