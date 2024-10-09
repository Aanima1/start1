package org.example.prac.var1;

import java.util.ArrayList;
import java.util.Scanner;

// Strategy interface
interface MenuAction {
    void execute();
}

// Concrete strategies for each menu option
class InputStudentCount implements MenuAction {
    private int[] studentCount;

    public InputStudentCount(int[] studentCount) {
        this.studentCount = studentCount;
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수를 입력하시오: ");
        studentCount[0] = Integer.parseInt(sc.nextLine());
    }
}

class InputMathScores implements MenuAction {
    private ArrayList<Integer> mathScores;
    private int[] studentCount;

    public InputMathScores(ArrayList<Integer> mathScores, int[] studentCount) {
        this.mathScores = mathScores;
        this.studentCount = studentCount;
    }

    @Override
    public void execute() {
        if (studentCount[0] <= 0) {
            System.out.println("먼저 학생 수를 입력하세요.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        mathScores.clear();
        for (int i = 0; i < studentCount[0]; i++) {
            System.out.print("수학 점수 입력 : ");
            mathScores.add(Integer.parseInt(sc.nextLine()));
        }
    }
}

class InputEnglishScores implements MenuAction {
    private ArrayList<Integer> englishScores;
    private int[] studentCount;

    public InputEnglishScores(ArrayList<Integer> englishScores, int[] studentCount) {
        this.englishScores = englishScores;
        this.studentCount = studentCount;
    }

    @Override
    public void execute() {
        if (studentCount[0] <= 0) {
            System.out.println("먼저 학생 수를 입력하세요.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        englishScores.clear();
        for (int i = 0; i < studentCount[0]; i++) {
            System.out.print("영어 점수 입력 : ");
            englishScores.add(Integer.parseInt(sc.nextLine()));
        }
    }
}

class PrintMathAverage implements MenuAction {
    private ArrayList<Integer> mathScores;

    public PrintMathAverage(ArrayList<Integer> mathScores) {
        this.mathScores = mathScores;
    }

    @Override
    public void execute() {
        if (mathScores.isEmpty()) {
            System.out.println("수학 점수를 먼저 입력하세요.");
            return;
        }
        double average = mathScores.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("수학 평균: " + average);
    }
}

class PrintEnglishAverage implements MenuAction {
    private ArrayList<Integer> englishScores;

    public PrintEnglishAverage(ArrayList<Integer> englishScores) {
        this.englishScores = englishScores;
    }

    @Override
    public void execute() {
        if (englishScores.isEmpty()) {
            System.out.println("영어 점수를 먼저 입력하세요.");
            return;
        }
        double average = englishScores.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("영어 평균: " + average);
    }
}

class PrintOverallAverage implements MenuAction {
    private ArrayList<Integer> mathScores;
    private ArrayList<Integer> englishScores;

    public PrintOverallAverage(ArrayList<Integer> mathScores, ArrayList<Integer> englishScores) {
        this.mathScores = mathScores;
        this.englishScores = englishScores;
    }

    @Override
    public void execute() {
        if (mathScores.isEmpty() || englishScores.isEmpty()) {
            System.out.println("모든 점수를 먼저 입력하세요.");
            return;
        }
        double totalAvg = (mathScores.stream().mapToInt(Integer::intValue).sum() +
                englishScores.stream().mapToInt(Integer::intValue).sum()) / (double)(mathScores.size() + englishScores.size());
        System.out.println("전체 평균: " + totalAvg);
    }
}

class ExitProgram implements MenuAction {

    @Override
    public void execute() {
        System.out.println("프로그램이 종료됩니다.");
        System.exit(0);
    }
}

// Context class that uses the strategy
class MenuContext {
    private MenuAction action;

    public void setMenuAction(MenuAction action) {
        this.action = action;
    }

    public void executeAction() {
        if (action != null) {
            action.execute();
        }
    }
}

public class Q3CliGptUp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] studentCount = new int[1];

        ArrayList<Integer> mathScores = new ArrayList<>();
        ArrayList<Integer> englishScores = new ArrayList<>();


        MenuContext context = new MenuContext();


        while (true) {

            System.out.println("+---------------------------------------------------------------------------+");
            System.out.println("| 메뉴) 1. 학생 수 입력\t| 2. 수학 점수 입력\t| 3. 영어 점수 입력" + "\t\t\t\t|\n" + "|\t 4. 수학 평균 확인\t| 5. 영어 평균 확인\t| 6. 모든 인원의 점수 평균 확인\t|");
            System.out.println("|\t 0. 종료\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
            System.out.println("+---------------------------------------------------------------------------+");
            System.out.print("메뉴를 선택하세요 : ");

            try {

                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        context.setMenuAction(new InputStudentCount(studentCount));
                        break;

                    case 2:
                        context.setMenuAction(new InputMathScores(mathScores, studentCount));
                        break;

                    case 3:
                        context.setMenuAction(new InputEnglishScores(englishScores, studentCount));
                        break;

                    case 4:
                        context.setMenuAction(new PrintMathAverage(mathScores));
                        break;

                    case 5:
                        context.setMenuAction(new PrintEnglishAverage(englishScores));
                        break;

                    case 6:
                        context.setMenuAction(new PrintOverallAverage(mathScores, englishScores));
                        break;

                    case 0:
                        context.setMenuAction(new ExitProgram());
                        break;

                    default:
                        System.out.println("잘못된 메뉴 선택입니다.");
                }

                context.executeAction();

            } catch (NumberFormatException e) {

                System.out.println("숫자로 입력하세요.");

            }

        }

    }

}