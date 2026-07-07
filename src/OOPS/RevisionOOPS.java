package OOPS;


public class RevisionOOPS {
    public static void main(String[] args){
        Pokemon pikachu = new Pokemon("Electric",70);
        pikachu.type = "Fire";
        pikachu.power = 34;
        Pokemon jiggly = new Pokemon("Fairy",50);

        pikachu.print();
        jiggly.print();
    }
}
