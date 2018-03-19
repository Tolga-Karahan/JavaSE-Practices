// Demonstrates JFileChooser
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.DirectoryStream;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class JFileChooserDemo extends JFrame
{
       private final JTextArea outputArea;

       // set up GUI
       public JFileChooserDemo() throws IOException
       {
              super("JFileChooserDemo");
              outputArea = new JTextArea();
              add(new JScrollPane(outputArea));
              analyzePath();
       }

       // display info about file or directory user specifies
       public void analyzePath() throws IOException
       {
              // get path of user-selected file or directory
              Path path = getFileOrDirectoryPath();

              if(path != null && Files.exists(path))
              {
                    // gathering file info
                    StringBuilder builder = new StringBuilder();
                    builder.append(String.format("%s:%n", path.getFileName()));
                    builder.append(String.format("%s a directory%n",
                          Files.isDirectory(path) ? "Is" : "Is not"));
                    builder.append(String.format("%s a absolute path%n",
                          path.isAbsolute() ? "Is" : "Is not"));
                    builder.append(String.format("Last modified: %s%n",
                          Files.getLastModifiedTime(path)));
                    builder.append(String.format("Size: %s%n",
                          Files.size(path)));
                    builder.append(String.format("Path: %s%n", path));
                    builder.append(String.format("Absolute path: %s%n",
                          path.toAbsolutePath()));

                    if(Files.isDirectory(path))
                    {
                          builder.append(String.format(
                               "%nDirectory contents:%n"));

                          // objects for iterating through directory contents
                          DirectoryStream<Path> dirStream =
                               Files.newDirectoryStream(path);

                          for(Path p : dirStream)
                               builder.append(String.format("%s%n", p));
                    }

                    outputArea.setText(builder.toString());
              }
              else
              {
                    JOptionPane.showMessageDialog(this, path.getFileName() +
                         "does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
              }
       }

       // allow user to specify file or directory
       private Path getFileOrDirectoryPath()
       {
              // configuring dialog allowing user to select a file or directory
              JFileChooser fileChooser = new JFileChooser();
              fileChooser.setFileSelectionMode(
                  JFileChooser.FILES_AND_DIRECTORIES);
              int result = fileChooser.showOpenDialog(this);

              // if user clicked cancel button, terminate
              if(result == JFileChooser.CANCEL_OPTION)
                  System.exit(1);

              // return path representing the selected file
              return fileChooser.getSelectedFile().toPath();
       }
}
