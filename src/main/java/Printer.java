public class Printer {

    private int paperSheetsLeft;
    private int printerInk;

    public Printer(int paperSheetsLeft, int printerInk) {
        this.paperSheetsLeft = paperSheetsLeft;
        this.printerInk = printerInk;
    }

    public int print(int numberOfPaper, int numberOfCopies){
        int numberOfSheetsToUse = numberOfPaper*numberOfCopies;
        if(this.paperSheetsLeft > numberOfSheetsToUse){
            int newPaperSheetsLeft = this.paperSheetsLeft - numberOfSheetsToUse;
            return this.paperSheetsLeft = newPaperSheetsLeft;
        } else {
            return  this.paperSheetsLeft;
        }
    }



}
