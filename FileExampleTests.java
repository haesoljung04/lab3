
import static org.junit.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FileExampleTests {
  
  @Test
  public void testFile() throws IOException {
    List<File> realOutput = FileExample.getFiles(new File("FileExamples/"));
    List<File> expectedOutput = new ArrayList<>();
    expectedOutput.add(new File("FileExamples/CrazyFiles/fragile.java"));
    expectedOutput.add(new File("FileExamples/CrazyFiles/ok.txt"));
    expectedOutput.add(new File("FileExamples/ExtraFiles/love.java"));
    expectedOutput.add(new File("FileExamples/ExtraFiles/yesterday.txt"));
    expectedOutput.add(new File("FileExample/tomorrow.text"));
    assertEquals(expectedOutput, realOutput);
  }
}
