package ro.mirodone;

class First {
    int i = 10;

    public First(){
        System.out.println("a");
    }

    public First( int j){
        System.out.println("First : " +i);
        this.i = j*10;
        System.out.println("First : " +i);
    }
}

class Second extends First {

    public Second() {
        System.out.println("b");
    }

    public Second(int j){
        super(j);
        System.out.println("Second : " +i);
        this.i = j*20;
        System.out.println("Second : " +i);
    }
}

class Third extends Second {
    public Third(){
        System.out.println("c");
    }
}

public class Main {

    public static void main(String[] args) {

        Second n = new Second(20);
        System.out.println("Main : " + n.i);

        Third c = new Third();


    }
}
