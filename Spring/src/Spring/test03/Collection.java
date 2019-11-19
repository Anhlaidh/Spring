package Spring.test03;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName Collection
 * @Description TODO
 * @Author Anhlaidh
 * @DATE 2019/11/19 0019 11:09
 * @Version
 */
public class Collection {
    List listE;
    Map mapE;
    Set setE;
    String[] arrayE;

    public List getListE() {
        return listE;
    }

    public void setListE(List listE) {
        this.listE = listE;
    }

    public Map getMapE() {
        return mapE;
    }

    public void setMapE(Map mapE) {
        this.mapE = mapE;
    }

    public Set getSetE() {
        return setE;
    }

    public void setSetE(Set setE) {
        this.setE = setE;
    }

    public String[] getArrayE() {
        return arrayE;
    }

    public void setArrayE(String[] arrayE) {
        this.arrayE = arrayE;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "listE=" + listE +
                ", mapE=" + mapE +
                ", setE=" + setE +
                ", arrayE=" + Arrays.toString(arrayE) +
                '}';
    }
}
