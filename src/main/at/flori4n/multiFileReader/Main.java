package main.at.flori4n.multiFileReader;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String path = System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator+"resources";

        String[] readFiles = {"test.txt","test2.txt"};
        String[] writeFiles = {"test.txt","test2.txt"};


        new MultiFIleReader(path,readFiles,writeFiles,new FileRunnerInterface() {
            @Override
            public List<String> runForEveryFile(List<String> list) {
                System.out.println(list);
                return list;
            }
        }).runAll();
    }
}