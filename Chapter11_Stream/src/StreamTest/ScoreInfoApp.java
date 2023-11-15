package StreamTest;

import java.util.Arrays;

public class ScoreInfoApp {

    public static void main(String[] args) {

        Student student1 = new Student("Max", "F.");
        ScoreInfo scoreInfo1 = new ScoreInfo(87,student1);
        Student student2 = new Student("Deepika", "A.");
        ScoreInfo scoreInfo2 = new ScoreInfo(95,student2);
        Student student3 = new Student("Mausam", "T.");
        ScoreInfo scoreInfo3 = new ScoreInfo(90,student3);
        Student student4 = new Student("Elmaz", "D.");
        ScoreInfo scoreInfo4 = new ScoreInfo(92,student4);
        Student student5 = new Student("Abdulrazak", "D.");
        ScoreInfo scoreInfo5 = new ScoreInfo(89,student5);
        Student student6 = new Student("Adrien", "R.");
        ScoreInfo scoreInfo6 = new ScoreInfo(55,student6);
        Student student7 = new Student("Valentine", "Z.");
        ScoreInfo scoreInfo7 = new ScoreInfo(50,student7);

        ScoreInfoService scoreInfoService = new ScoreInfoService();

        scoreInfoService.addScoreInfo(scoreInfo1);
        scoreInfoService.addScoreInfo(scoreInfo2);
        scoreInfoService.addScoreInfo(scoreInfo3);
        scoreInfoService.addScoreInfo(scoreInfo4);
        scoreInfoService.addScoreInfo(scoreInfo5);
        scoreInfoService.addScoreInfo(scoreInfo6);
        scoreInfoService.addScoreInfo(scoreInfo7);

        System.out.println("There is " + scoreInfoService.getNumberOfStudents() + "students in this list");
        System.out.println();
        scoreInfoService.calculateAverageScore();
        System.out.println();
        System.out.println("There is " + scoreInfoService.filterScore() + " students with more than 90");
        System.out.println();
        scoreInfoService.printFailingStudents();
        System.out.println();
        scoreInfoService.getDataSortedByLastName();
        System.out.println();
        scoreInfoService.getDataSortedByScore();

    }
}
