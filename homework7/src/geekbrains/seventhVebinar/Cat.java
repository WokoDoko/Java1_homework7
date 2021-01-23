package geekbrains.seventhVebinar;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety = false;


    public Cat(String name, int appetite) {

        this.name = name;
        this.appetite = appetite;

    }

    public void eat(Plate plate) {

        if (plate.decreaseFood(appetite)){
            decreaseAppetite();}
        else
            System.out.println("Add some food, don't be greedy.");

        if (appetite==0)
            {
            this.satiety = true;
            System.out.printf("Cat %s is no longer hungry(%b).\n", this.name, satiety);
            }
    }

    public void decreaseAppetite () {
        appetite = 0;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

}

