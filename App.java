class Character {
    private String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move(){
        System.out.println(" telah berpindah ");
    }
}

class Hero extends Character{
    private String direction;

    public Hero(String name){
        super(name);
    }
    public Hero(String name, String direction){
        super(name);
        this.direction = direction;
    }
    @Override
    public void move (){
        System.out.println(getName() + " telah berpindah ");
    }
    
    public void move (String direction){
        System.out.println( getName() + " telah berpindah " + direction + ".");
    }
}

class Enemy extends Character{
    protected int step;

    public Enemy (String name){
        super(name);
    }
    public Enemy(String name, int step){
        super(name);
        this.step = step;
    }

    @Override
    public void move(){
        System.out.println(getName() + " telah berpindah ");
    }
    public void move (int step){
        if (step <2 ){
        System.out.println( getName() + " telah berpindah " + step + " langkah ");
        }else {
            System.out.println( getName() + " telah berpindah " + step + " langkah ");
        }
    }
}

class Fighter extends Hero{

    public Fighter(String name){
        super(name);
    }
    @Override
    public void move(){
        System.out.println(getName() + " telah berpindah ");
    }  
}

class Witch extends Enemy{

    public Witch(String name){
        super(name);
    }

    @Override
    public void move(){
        System.out.println( getName() + " telah berpindah ");
    }  
}

public class App {
    public static void main(String[] args) {
        // Static polymorphism
        Hero hero = new Hero("niluh"," ke depan ");
        Enemy enemy = new Enemy("kevin", 5);
        hero.move("ke depan"); 
        enemy.move(5);

        // Dynamic polymorphism - reference of Character to Hero, Enemy, Witch, and Fighter objects
        Character niluh = new Hero("niluh");
        Character kevin = new Enemy("kevin");
        Character ocha = new Witch("ocha");
        Character medan = new Fighter("medan");

        niluh.move();
        niluh.move();
        kevin.move();
        ocha.move();
        medan.move();

        // Dynamic polymorphism - reference of Character to Witch object casted to Fighter object
        Character Author = new Witch("Author");
        Fighter fighter = (Fighter) Author;
        fighter.move();
    }
}

