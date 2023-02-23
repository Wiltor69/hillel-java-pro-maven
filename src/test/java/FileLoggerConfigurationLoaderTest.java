import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileLoggerConfigurationLoaderTest {
    
@BeforeEach
    public void setUp(){
    System.out.println("Start test");

    }
    @Test
    public void loadTest() throws IOException {
        File filename = new File("test.txt");
    if(filename.length()>50){
        filename.createNewFile();
    }
    }
    @AfterEach
    public void finish(){
        System.out.println("Test end");
    }
}
