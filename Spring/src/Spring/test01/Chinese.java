package Spring.test01;

/**
 * @ClassName Chinese
 * @Description TODO
 * @Author Anhlaidh
 * @DATE 2019/11/18 0018 18:22
 * @Version
 */
public class Chinese implements Person {
    private StoneAxe axe;

    public Chinese() {
    }

    public Chinese(StoneAxe axe) {
        this.axe = axe;
    }

    public StoneAxe getAxe() {
        return axe;
    }

    public void setAxe(StoneAxe axe) {
        this.axe = axe;
    }

    @Override
    public void useAxe() {
        axe.chop();
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "axe=" + axe +
                '}';
    }
}
