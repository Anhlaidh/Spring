package homework.Bean;



/**
 * @ClassName: person
 * @description: person
 * @author:Anhlaidh
 * @create: 2019/11/20 0020 10:58
 */
public class Person {
    private Cat cat;
    private Dog dog;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
    public void feed(Animal animal){
        animal.species();
    }
}
