import java.util.ArrayList;
import java.util.List;

public class Bowl {

    public List<Fruit> fruits;

    public  Bowl(){
        fruits=new ArrayList<>();
    }

    public void addFruitsToBowl(Fruit fruitType) {
        fruits.add(fruitType);

    }

    public Bowl getAllApplesBowl() {

        Bowl bowlOfApple=new Bowl();
        for (Fruit fruit:fruits)
        {
            if(fruit instanceof Apple)
                bowlOfApple.addFruitsToBowl(fruit);
        }
        return bowlOfApple;
    }

    public Bowl getAllOrangesBowl() {
        Bowl bowlOfOrang=new Bowl();
        for (Fruit fruit:fruits)
        {
            if(fruit instanceof Orange)
                bowlOfOrang.addFruitsToBowl(fruit);
        }
        return bowlOfOrang;

    }

    public Bowl getAllBananaBowl() {
        Bowl bowlOfBanana=new Bowl();
        for (Fruit fruit:fruits)
        {
            if(fruit instanceof Banana)
                bowlOfBanana.addFruitsToBowl(fruit);
        }
        return bowlOfBanana;

    }


    public int getCount() {
        return fruits.size();
    }
}
