package com.tanaphon.zoo;

import com.tanaphon.zoo.animal.Animal;
import com.tanaphon.zoo.animal.bird.Parrot;
import com.tanaphon.zoo.animal.mammal.Tiger;
import com.tanaphon.zoo.animal.reptile.BloodPython;
import com.tanaphon.zoo.cage.Cage;
import com.tanaphon.zoo.staff.Cleaner;
import com.tanaphon.zoo.staff.Doctor;
import com.tanaphon.zoo.staff.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Tanaphon on 7/13/2016.
 */
public class ManageZoo {
    Scanner scanner = new Scanner(System.in);
    public static int inCage = 0;
    public static int outCage = 0;
    public static int staffNumber = 0;
    private List<Cage> cages = new ArrayList<>();
    private List<Animal> animals = new ArrayList<>();
    private List<Staff> staffs = new ArrayList<>();
    public List<Cage> getCages() {
        return cages;
    }

    public ManageZoo() {

    }

    public void cageManager(int choice){
        // 1 add 2 drop 3 exit
        switch (choice) {
            case 1:
                this.createCage();
                break;
            case 2:
                this.destroyCage();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Incorrect value");
        }
    }

    public void staffManager(int choice){
        // 1 add 2 drop 3 exit
        switch (choice) {
            case 1:
                this.addNewStaff();
                break;
            case 2:
                this.removeStaff();
            case 3:
                System.exit(0);
            default:
                System.out.println("Incorrect value");
        }
    }

    public void animalManager(int choice){
        // 1 add 2 drop 3 exit
        switch (choice) {
            case 1:
                this.addNewAnimal();
                break;
            case 2:
                this.removeAimal();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Incorrect value");
        }
    }

    public void addNewStaff() {
        System.out.println("Insert name, gender, dateOfBirth, telephoneNumber and salary");
        String name = scanner.next();
        String gender = scanner.next();
        String dateOfBirth = scanner.next();
        String telephoneNumber = scanner.next();
        int salary = scanner.nextInt();
        staffNumber++;
    }

    public void createCage() {
        System.out.println("Insert total area, land area, water area and cage name");
        float totalArea = scanner.nextFloat();
        float landArea = scanner.nextFloat();
        float waterArea = scanner.nextFloat();
        String cageName = scanner.next();
        Cage newCage = new Cage(totalArea, landArea, waterArea, cageName);
        if (newCage.isCreateSuccess()) {
            cages.add(newCage);
            showCages();
        }
    }


    public void removeStaff(){
        // ยังไม่เสร็จ
        // Staff id # int

        int idToRemove = scanner.nextInt();
        for (Staff staff : staffs){
            if (staff.getId() == idToRemove){
                // do something ...
                staffs.remove(staffs.indexOf(staff.getId()));
            }
        }
        staffNumber--;

        for(Staff staff : staffs){
            staff.toString();
        }
    }

    public void addNewAnimal(){
        //
    }

    public void removeAimal(){

    }

    public void zooManagementSystem() {
        int choice;
        do {
            //System.out.println("1: Create Cage 2: Delete Cage 3: Add Animal 4: Remove Animal 5: About the Zoo 6: Exit");
            System.out.println("1: Staff Manager 2: Animal Manager 3: Cage Manager 4: About the Zoo 5: Exit Program");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1: Add new staff 2: Remove staff 3: Previous menu");
                    choice = scanner.nextInt();
                    this.staffManager(choice);
                    break;
                case 2:
                    System.out.println("1: Add new cage 2: Destroy cage 3: Previous menu");
                    choice = scanner.nextInt();
                    this.cageManager(choice);
                    break;
                case 3:
                    System.out.println("1: Add new animal 2: Remove animal 3: Previous menu");
                    choice = scanner.nextInt();
                    this.animalManager(choice);
                    break;
                case 4:
                    new ZooInformation().about();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Incorrect value");
            }
        } while (choice != 6);
    }

    public void showCages() {
        for (Cage c : cages) {
            System.out.println(c.toString());
        }
    }

    public void destroyCage(){

    }

    public void initializeZoo() {
        Cage tigerCage = new Cage(10, 6, 4, "Tiger Cage");
        Cage parrotCage = new Cage(12, 10, 2, "Parrot Cage");
        Cage bloodPythonCage = new Cage(2, 1.6f, 0.4f, "Blood Python Cage");
        cages.add(tigerCage);
        cages.add(parrotCage);
        cages.add(bloodPythonCage);

        Animal tiger1 = new Tiger("John", "04-04-1992", "male", "T01");
        Animal tiger2 = new Tiger("Noah", "12-03-1995", "male", "T02");
        Animal tiger3 = new Tiger("Emma", "04-12-1993", "female", "T03");
        Animal parrot1 = new Parrot("Ava", "22-11-20014", "female", "P01");
        Animal parrot2 = new Parrot("Mia", "06-12-2010", "female", "P02");
        Animal bloodPython = new BloodPython("Sofia", "31-01-2013", "female", "BP01");

        animals.add(tiger1);
        animals.add(tiger2);
        animals.add(tiger3);
        animals.add(parrot1);
        animals.add(parrot2);
        animals.add(bloodPython);

        tigerCage.importAnimal(tiger1);
        tigerCage.importAnimal(tiger2);
        tigerCage.importAnimal(tiger3);
        tigerCage.importAnimal(tiger3);
        parrotCage.importAnimal(parrot1);
        parrotCage.importAnimal(parrot2);
        bloodPythonCage.importAnimal(bloodPython);
        bloodPythonCage.importAnimal(bloodPython);

        for (Cage c : cages) {
            System.out.println(c.toString());
        }

        Staff staff1 = new Doctor("Olivia", "male", "01-01-1000", "08234",100000);
        Staff staff2 = new Cleaner("Alfie", "female", "02-02-2000", "08223", 123445);

    }
}
