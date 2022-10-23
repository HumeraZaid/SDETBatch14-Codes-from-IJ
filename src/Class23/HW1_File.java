package Class23;

public class HW1_File {

    /* Create a class File that will have the following behaviors: open, edit, close.
       Edit and close are implemented method while open is an abstract.
       Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
       Example: to open .java file we need notepad++ or sublime text,
       to open .doc file we need Microsoft Word to be installed etc.
     */

    public static void main(String[] args) {
        File[] files = {new JavaFile(), new WordFile(), new PDFFile()};
        for(File file : files)
        {
            file.open();
        }
    }
}

abstract class File{

    abstract void open();

    void edit()
    {
        System.out.println("Edits the file.");
    }

    void close()
    {
        System.out.println("Closes the file.");
    }
}

class JavaFile extends File{

    @Override
    void open()
    {
        System.out.println("To open a .java file, we need Notepad++ or Sublime Text.");
    }
}

class WordFile extends File{

    @Override
    void open()
    {
        System.out.println("To open a .doc file, we need Microsoft Word.");
    }
}

class PDFFile extends File{

    @Override
    void open()
    {
        System.out.println("To open a .pdf file, we need Adobe Acrobat DC.");
    }
}


