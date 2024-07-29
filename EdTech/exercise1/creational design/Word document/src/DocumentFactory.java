public abstract class DocumentFactory {
    public abstract Document createDocument();

    public void openDocument() {
        Document document = createDocument();
        document.open();
    }

    public void closeDocument() {
        Document document = createDocument();
        document.close();
    }
}
