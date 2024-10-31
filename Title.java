public abstract class Title {
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate;

    public Title(String title, String literatureType, int copies, double rate) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
        this.rate = rate;

        }

        public double calculateRoyalty(){
        return calculatePoints() * rate;
        }

        protected double calculatePoints(){
            return pages * literatureType * copies;
        }

        protected double calculateLiteraturePoints(){
            int BI = 3;
            int TE = 3;
            int LYRIK = 3;
            int SKØN = 1.7;
            int FAG = 1;
        }

    }

}
