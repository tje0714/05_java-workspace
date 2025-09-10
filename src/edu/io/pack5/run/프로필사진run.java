package edu.io.pack5.run;

import edu.io.pack5.service.프로필사진service;

import java.util.Scanner;

public class 프로필사진run {
    public static void main(String[] args) {
        프로필사진service service = new 프로필사진service();

     //   service.createProfileFolder("member03","프로필사진2.png");
    //    service.createProfileFolder("member04","프로필사진2.png");

        String imgurl = "https://cdn.dailysecu.com/news/photo/202104/123449_145665_1147.png";

      //  service.saveImg(imgurl);


        // 인터넷에서 이미지 주소를 복사한 후
        // 원하는 이미지를
        String imgUrl2 = "https://img.freepik.com/free-vector/cute-shiba-inu-dog-sitting-heaven-with-cloud-cartoon-vector-icon-illustrationanimal-holiday-flat_138676-9999.jpg?semt=ais_hybrid&w=740&q=80";
        //service.saveImg2(imgUrl2);

        Scanner sc = new Scanner(System.in);
        System.out.println("저장할 사진의 주소를 작성하세요 : ");
        String imgUrl3 = sc.nextLine();

        System.out.println("저장할 사진의 폴더를 작성하세요 : ");
        String folder = sc.nextLine();


        System.out.println("저장할 사진의 명칭을 작성하세요 : ");
        String name = sc.nextLine();

        String imgName = name + ".png";
       // service.saveImg3(imgName);
        service.saveImg4(folder,imgName, imgUrl3);

    }
}
