package edu.io.pack8.ex;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringBuilderService {

    public void saveBooks(){
        Path bookDir = Path.of("books");
        Path bookFile = Path.of("books", "book_list.txt");
        StringBuilder bookData = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        try {
            Files.createDirectories(bookDir);
            System.out.println("도서 정보를 입력하세요 (완료를 입력하면 저장됩니다)");
            while(true) {
                System.out.print("제목 : ");
                String title = scanner.nextLine();

                if(title.equals("완료")){
                    break;
                }
                System.out.print("저자 : ");
                String author = scanner.nextLine();
                System.out.print("출판년도 : ");
                String year = scanner.nextLine();

                bookData.append("제목 : "+ title +" , 저자 : "+author +", 출판년도 : "+year +"\n");
                System.out.println("입력 완료");
            }
            Files.writeString(bookFile,bookData.toString());
            //while 로 데이터를 추가하는 동안은
            // 파일 아래에 지속적으로 추가되지만,
            // saveBooks 을 다시 실행하면 초기화 된 상태로 데이터가 다시 저장됨
            // 이어쓰기인지 매번 새로운 파일을 만드는지 파일을 만드는 목표를 확인하고, 옵션 설정
            System.out.println("도서목록이 저장되었습니다. : " + bookFile.getFileName());
            System.out.println("저장된 내용");
            System.out.println(Files.readString(bookFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Files.createDirectories();
        //Files.writeString(), Files.readString()
    }

    public void manageGrades(){
        String today = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Path gradeDir = Path.of("grades");
        Path gradeFile = Path.of("grades", today + "_성적표.txt");
    }

    public void recordCount(){
        Path householdDir = Path.of("household");
        Path accountFile = Path.of("household", "account_book.txt");
       // String timestamp = getCurrentTime();
        StringBuilder accountData = new StringBuilder();
        // StandardOpenOption.CREATE, StandardOpenOption.APPEND
    }
}
