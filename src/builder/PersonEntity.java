package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author 司松坡
 * @createTime 2023年04月21日
 */
public class PersonEntity {
    List<String> parts = new ArrayList<>();
    public void add(String part){
        parts.add(part);
        System.out.println(part);
    }

    public void show(){
        for (String part : parts){
            System.out.println(part);
        }
    }


}
