package edu.io.pack4.run;

import edu.io.pack4.service.FileWrtieService;

public class FileWriteRun {
    public static void main(String[] args) {
        FileWrtieService fws = new FileWrtieService();
    //   fws.고전방식();
        fws.현대방식();
    }
}
