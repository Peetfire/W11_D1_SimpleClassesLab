public class Printer {

    private int sheetsLeft;
    private int toner;

    public Printer(int loadPaper, int loadToner){
        this.sheetsLeft = loadPaper;
        this.toner = loadToner;
    }

    public int getSheetsLeft() {
        return this.sheetsLeft;
    }

    public void setSheetsLeft(int value){
        this.sheetsLeft = value;
    }

    public int getToner(){
        return this.toner;
    }

    public void setToner(int toner) {
        this.toner += toner;
    }

    public boolean print(int pages, int copies) {
        if((pages * copies) <= this.sheetsLeft && (pages * copies) <= this.toner){
            sheetsLeft = sheetsLeft - (pages * copies);
            toner = toner - (pages * copies);
            return true;
        }
        return false;
    }


    public void addPaper(int loadPaper) {
        this.sheetsLeft += loadPaper;
    }

    public void addToner(int loadToner){
        this.toner += loadToner;
    }
}
