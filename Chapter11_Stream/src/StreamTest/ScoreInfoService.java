package StreamTest;

import java.util.*;
import java.util.stream.Collectors;

public class ScoreInfoService {

    long numberOfStudents;

    private List<ScoreInfo> scoreData = new ArrayList<>();

    public ScoreInfoService(){}



    public long getNumberOfStudents() {
        return numberOfStudents = scoreData.stream().count();

    }
    public void addScoreInfo(ScoreInfo i){
        scoreData.add(i);
    }
    public void calculateAverageScore(){
       long result = (scoreData.stream()
                .map(s -> s.score)
                .reduce(0,(c,e)->c+e))
                /getNumberOfStudents();
        System.out.println("The average score is " + result);
    }
    public long filterScore(){
        return scoreData.stream()
                .filter(s -> s.score>=90)
                .count();
    }

    private String[] getFailedStudents(){
        return scoreData.stream()
                .filter(n -> n.score<=60)
                .map(n -> n.student.name + " " + n.student.lastName)
                .toArray(String[]::new);
    }

    public void printFailingStudents(){
        System.out.println("Here are de students with a score of less than 60: ");
        Arrays.stream(getFailedStudents())
                .forEach(System.out::println);
    }

    public void getDataSortedByLastName(){
        scoreData.stream()
                .sorted(Comparator.comparing(n -> n.student.lastName))
                .map(n -> n.student.name + " " + n.student.lastName + ": " + n.score)
                .forEach(System.out::println);
    }

    public void getDataSortedByScore(){
        scoreData.stream()
                .sorted(Comparator.comparing(s -> s.score))
                .map(n -> n.student.name + " " + n.student.lastName + ": " + n.score)
                .forEach(System.out::println);
    }


}
