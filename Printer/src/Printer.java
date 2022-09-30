public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(this.tonerLevel>-1 && this.tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = isDuplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount> 0 && tonerAmount<=100){
            if(this.tonerLevel + tonerAmount >100) {
                return -1;
            }
            this.tonerLevel+=tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex == true){
            pagesToPrint =(pages/2)+(pages%2);
            System.out.println("Printing in Duplex Mode");
        }
        this.pagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
