package geekbrains.seventhVebinar;

public class Plate {

    private int foodAmount;

    public Plate(int food) {
        this.foodAmount = food;
    }

    public void getInfo() {
        System.out.printf("Plate contains %d pieces of food.\n", foodAmount);
    }

    public boolean decreaseFood(int appetite) {
        if (foodAmount>=appetite) {
            foodAmount -= appetite;
            return true;
        }
        else {
            System.out.println("Not enough food in the plate.");
            return false;
        }

    }

    public void setFoodAmount(int foodAmount) {
        if (foodAmount >= 0)
            this.foodAmount = foodAmount;
        else
            System.out.println("It's not possible to hold negative amount of food in the plate.");
    }

    public void addFood(int foodAmount) {
        if (foodAmount >= 0) {
            this.foodAmount += foodAmount;
            System.out.printf("Yoy added %d pieces of food in the plate.\n", foodAmount);
        }
        else {
            this.foodAmount -= foodAmount;
            System.out.printf("Yoy took %d pieces of food from the plate.\n", foodAmount);}
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
