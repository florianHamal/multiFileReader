# multiFileReader

This is a file reader who can read multible files in a row .
(my usecase was the catalyst coding contest)

# how does it work?

You have three important variables

- tha path to your files
- an array files to read as input
- an array files to read as output

`` String path = System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator+"resources"; ``

`` String[] readFiles = {"test.txt","test2.txt"}; ``

`` String[] writeFiles = {"test.txt","test2.txt"}; `` 


The index of the input file = the index of the output file.
The file with the index 0 in the readFiles array is the input file and the index 0 of the writeFiles array.
In this case they have the same name so the output gets writtein in the same file as it gets the input.

to wrie logic you can use the fileRunnerInterface

    new FileRunnerInterface() {
      @Override
      public List<String> runForEveryFile(List<String> list) {
        System.out.println(list);
        return list;
    }
as input you will get a string list (every line in the file is a string)
the return value gets written into the output file
 
The interface gets run for every file.



example of a completa assembly:

      new MultiFIleReader(path,readFiles,writeFiles,new FileRunnerInterface() {
            @Override
            public List<String> runForEveryFile(List<String> list) {
                System.out.println(list);
                return list;
            }
        }).runAll();


To execute it you have to call runAll().

Have fun coding!



