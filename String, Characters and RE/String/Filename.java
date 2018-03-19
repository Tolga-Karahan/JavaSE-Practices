// Extracts file name, extension and path
public class Filename
{
       private String fullPath;

       public Filename(String fullPath)
       {
            this.fullPath = fullPath;
       }

       public String getExtension()
       {
            int index = fullPath.lastIndexOf('.');
            return fullPath.substring(index + 1);
       }

       public String getPath()
       {
            int index = fullPath.lastIndexOf('/');
            return fullPath.substring(0, index);
       }

       public String getFilename()
       {
            int index1 = fullPath.lastIndexOf('/');
            int index2 = fullPath.lastIndexOf('.');
            return fullPath.substring(index1 + 1, index2);
       }

       public static void main(String[] args)
       {
            String fullpath = "C:/Users/Tolga/Desktop/Java Codes" +
                 "/Deitel/Chapter 14/String/Filename.java";
            Filename myFile = new Filename(fullpath);
            System.out.printf("Full path: %s%nExtension: %s%nPath: %s%n" +
                 "Filename: %s%n", fullpath, myFile.getExtension(),
                 myFile.getPath(), myFile.getFilename());
       }

}
