import javax.swing.text.Document;

public class App {
    
        //define document classes
        interface Document{
           void type();
        }

        //create concrete document classes
        static class WordDocument implements Document{
            public void type(){
                System.out.println(" This is a word type document");
            }
        }
         static class PDFDocument implements Document{
            public void type(){
                System.out.println(" This is a PDF type document");
            }
        }
         static class ExcelDocument implements Document{
            public void type(){
                System.out.println(" This is a excel type document");
            }
        }

        abstract static class DocumentFactory{
        public abstract Document createDocument();
        }

        //concrete factory classes
        static class WordDocumentFactory extends DocumentFactory{
            public Document createDocument(){
                return new WordDocument();
            }
        }
        static class PDFDocumentFactory extends DocumentFactory{
            public Document createDocument(){
                return new PDFDocument();
            }
        }
        static class ExcelDocumentFactory extends DocumentFactory{
            public Document createDocument(){
                return new ExcelDocument();
            }
        }
        
        public static void main(String[] args) {
            DocumentFactory wordFactory = new WordDocumentFactory();
            Document word = wordFactory.createDocument();
            word.type();

            DocumentFactory pdfFactory = new PDFDocumentFactory();
            Document pdf = pdfFactory.createDocument();
            pdf.type();

            DocumentFactory excelFactory = new ExcelDocumentFactory();
            Document excel = excelFactory.createDocument();
            excel.type();
        }

    }

