public class Audiobook extends Title  {

    private int durationInMinutes;

    public Audiobook(String title, String literatureType, int copies, int durationInMinutes){
        this.durationInMinutes=durationInMinutes;
    }

    protected double calculatePoints(){
        durationInMinutes * literaturType * copies;
    }

    protected double calculateLiteraturePoints(){

    }
}
