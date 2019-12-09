import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList <Hero> heroes = new ArrayList<>();
        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
        Hero Black_Widow = new Hero("Black Widow", 34);
        Hero Captain_America = new Hero("Captain America", 100);
        Hero Vision = new Hero("Vision", 3);
        Hero Iron_Man = new Hero("Iron Man", 48);
        Hero Scarlet_Witch = new Hero("Scarlet Witch", 29);
        Hero Thor = new Hero("Thor", 1500);
        Hero Hulk = new Hero("Hulk", 49);
        Hero Doctor_Strange = new Hero("Doctor Strange", 42);
        heroes.add(Black_Widow);
        heroes.add(Captain_America);
        heroes.add(Vision);
        heroes.add(Iron_Man);
        heroes.add(Scarlet_Witch);
        heroes.add(Thor);
        heroes.add(Hulk);
        heroes.add(Doctor_Strange);
        for (int h=0; h<heroes.size(); h++)
        {
        System.out.println(heroes.get(h));
        }
        System.out.println("");
        // TODO 3 : It's Thor birthday, now he's 1501
        heroes.get(5).setAge(1501);
        for (int h=0; h<heroes.size(); h++)
        {
        System.out.println(heroes.get(h));
        }
        System.out.println("");
        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);
        for (int h=0; h<heroes.size(); h++)
        {
        System.out.println(heroes.get(h));
        }
        System.out.println("");
        // TODO 5 : Keep only the half of the list
        heroes.subList(0, heroes.size()/2).clear();
        for (int h=0; h<heroes.size(); h++)
        {
        System.out.println(heroes.get(h));
        }
        System.out.println("");
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
    }
}
