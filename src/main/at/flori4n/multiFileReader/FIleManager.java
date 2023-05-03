package main.at.flori4n.multiFileReader;

import java.io.File;
import java.util.List;

public class FIleManager {
    private String path;
    private String[] readFiles;
    private String[] writeFiles;

    public FIleManager(String path, String[] readFiles, String[] writeFiles) {
        this.path = path;
        this.readFiles = readFiles;
        this.writeFiles = writeFiles;
    }

    public void runnAll(FileRunnerInterface fileRunnerInterface){
        for (int i = 0;i<readFiles.length;i++){
            List<String> input = new Filereader(path+ File.separator+readFiles[i]).readAll();
            List<String> output = fileRunnerInterface.runForEveryFile(input);//mainForEveryFile(input);
            System.gc(); // call gc cuz of using the same file in short time
            new Filewriter(path+ File.separator+writeFiles[i]).writeListContent(output);
        }
    }
}
