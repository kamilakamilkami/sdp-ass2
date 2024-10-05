public class Main {
    public static void main(String[] args) {
        DocumentFactory PDFFactory = new PDFDocumentFactory();
        Document PDF = PDFFactory.createDocument();
        PDF.create();

        DocumentFactory WORDFactory = new WordDocumentFactory();
        Document WORD = WORDFactory.createDocument();
        WORD.create();
    }
}
