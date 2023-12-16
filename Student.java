import java.util.Random;
import java.util.Scanner;

public class Student extends Human {
    private String institut;
    private int score;
    Scanner scan = new Scanner(System.in);
    public void setInfo() {

        System.out.println("Введите имя студента: ");
        String name = scan.next();
        setName(name);
        System.out.println("Введите возраст студента: ");
        int age = scan.nextInt();
        setAge(age);
        System.out.println("Какой пол студента: ");
        String gender = scan.next();
        setGender(gender);
        System.out.println("Какой институт студента: ");
        String institut = scan.next();
        setInstitut(institut);
    }

    public void returnInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Пол: " + gender + ", Институт: " + institut + ".");

    }

    public void setInstitut(String institut) {
        this.institut = institut;
    }

    public void makeProgramming0() {
        Random random = new Random();
        if (institut.equalsIgnoreCase("ИТИС")) {
            score += random.nextInt(4,5) ;
        } else {
            score += random.nextInt(3,4) ;
        }
    }

    public void makeElecEngineering() {
        Random random = new Random();
        if (institut.equalsIgnoreCase("ИТИС")) {
            score += random.nextInt(3,4);
        } else {
            score += random.nextInt(4,5);
        }
    }

    public int getScore() {
        System.out.println(score);
        return score;
    }
}
