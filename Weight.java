public class Weight {
    private int kg;
    private int grams;

    public Weight(int kg, int grams) {
        this.kg = kg;
        this.grams = grams;

        if (grams > 999) {
            this.kg++;
            this.grams = this.grams - 1000;
        }
    }
    public String toString(){
        return this.kg+" kg and "+this.grams+" grams.";
    }

}
