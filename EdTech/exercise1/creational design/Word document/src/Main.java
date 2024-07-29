public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        wordFactory.openDocument();
        wordFactory.closeDocument();
        pdfFactory.openDocument();
        pdfFactory.closeDocument();
    }
}
