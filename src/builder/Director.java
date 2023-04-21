package builder;

/**
 * 指挥者类
 *
 * @author 司松坡
 * @createTime 2023年04月21日
 */
public class Director {
    /**
     * 指挥建造过程
     */
    public void Construct(Person person){
        person.feed();
        person.hand();
        person.head();
    }

}
