package builder;

/**
 * 客户端
 *
 * @author 司松坡
 * @createTime 2023年04月21日
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Person man = new ManPerson();
        Person woman = new WomanPerson();
        director.Construct(man);
        PersonEntity personEntity = man.getPersonEntity();
        personEntity.show();

        director.Construct(woman);
        PersonEntity womanPersonEntity = woman.getPersonEntity();
        womanPersonEntity.show();
    }
}
