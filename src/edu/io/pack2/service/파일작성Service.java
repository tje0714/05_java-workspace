package edu.io.pack2.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class 파일작성Service {


    public void method1(){
        String filename = "파일1.txt";
        String 파일내용 = "파일 1 내부에 글자를 작성할 것입니다.";

        try {
            Files.writeString(Paths.get(filename),파일내용);
            System.out.println(filename + "파일 저장 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
