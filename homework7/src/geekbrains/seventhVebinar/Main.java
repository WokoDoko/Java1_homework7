package geekbrains.seventhVebinar;


public class Main {

    public static void main(String[] args) {

        Cat [] cats = new Cat[5];
        cats[0] = new Cat ("Bertrand Russell", 15);
        cats[1] = new Cat ("Ludwig Wittgenstein", 15);
        cats[2] = new Cat ("Gertrude Elizabeth Margaret Anscombe", 15);


        Plate plateOne = new Plate (44);

        cats[0].eat(plateOne);
        cats[1].eat(plateOne);
        plateOne.addFood(1);
        cats[2].eat(plateOne);




    }

    }

