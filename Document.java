abstract class Document {
    public abstract void create();
}

class PDFDocument extends Document{
    @Override
    public void create(){
        System.out.println("pdf document is created");
    }
}

class WordDocument extends Document{
    @Override
    public void create(){
        System.out.println("word document is created");
    }
}

abstract class DocumentFactory{
    public abstract Document createDocument();
}

class PDFDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new PDFDocument();
    }
}

class WordDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new WordDocument();
    }
}

