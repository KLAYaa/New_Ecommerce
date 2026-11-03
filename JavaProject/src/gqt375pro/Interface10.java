package gqt375pro;
interface PrinterTask10 {
    void print();
}

interface ScannerTask10 {
    void scan();
}

class OfficePrinter10 implements PrinterTask10 {
    public void print() {
        System.out.println("Printing office report");
    }
}
class OfficeScanner10 implements ScannerTask10 {
    public void scan() {
        System.out.println("Scanning office report");
    }
}
public class Interface10 {
    public static void main(String[] args) {
        OfficePrinter10 p = new OfficePrinter10();
        OfficeScanner10 s = new OfficeScanner10();

        p.print();
        s.scan();
    }
}