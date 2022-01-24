import org.testng.Assert;
import org.testng.annotations.Test;

public class FruitTest {

    @Test
    public void shouldSeggerateApples(){
        //Arrange
        Apple apple1=new Apple();
        Apple apple2=new Apple();
        Orange orange1=new Orange();
        Orange orange2=new Orange();
        Banana banana1=new Banana();

        Bowl mixedFruitBowl = new Bowl();
        mixedFruitBowl.addFruitsToBowl(apple1);
        mixedFruitBowl.addFruitsToBowl(apple2);
        mixedFruitBowl.addFruitsToBowl(orange1);
        mixedFruitBowl.addFruitsToBowl(orange2);
        mixedFruitBowl.addFruitsToBowl(banana1);

        //Act
        Bowl bowlFullOfApple=mixedFruitBowl.getAllApplesBowl();

        //Assert
        Assert.assertEquals(bowlFullOfApple.getCount(),2);

    }

    @Test
    public void shouldSeggerateOranges(){
        //Arrange
        Apple apple1=new Apple();
        Apple apple2=new Apple();
        Orange orange1=new Orange();
        Orange orange2=new Orange();
        Orange orange3=new Orange();
        Banana banana1=new Banana();

        Bowl mixedFruitBowl = new Bowl();
        mixedFruitBowl.addFruitsToBowl(apple1);
        mixedFruitBowl.addFruitsToBowl(apple2);
        mixedFruitBowl.addFruitsToBowl(orange1);
        mixedFruitBowl.addFruitsToBowl(orange2);
        mixedFruitBowl.addFruitsToBowl(orange3);
        mixedFruitBowl.addFruitsToBowl(banana1);

        //Act
        Bowl bowlFullOfOrange=mixedFruitBowl.getAllOrangesBowl();

        //Assert
        Assert.assertEquals(bowlFullOfOrange.getCount(),3);

    }

    @Test
    public void shouldSeggerateBanana(){
        //Arrange
        Apple apple1=new Apple();
        Apple apple2=new Apple();
        Orange orange1=new Orange();
        Orange orange2=new Orange();
        Orange orange3=new Orange();
        Banana banana1=new Banana();

        Bowl mixedFruitBowl = new Bowl();
        mixedFruitBowl.addFruitsToBowl(apple1);
        mixedFruitBowl.addFruitsToBowl(apple2);
        mixedFruitBowl.addFruitsToBowl(orange1);
        mixedFruitBowl.addFruitsToBowl(orange2);
        mixedFruitBowl.addFruitsToBowl(orange3);
        mixedFruitBowl.addFruitsToBowl(banana1);

        //Act
        Bowl bowlFullOfBanana=mixedFruitBowl.getAllBananaBowl();

        //Assert
        Assert.assertEquals(bowlFullOfBanana.getCount(),1);

    }
}
