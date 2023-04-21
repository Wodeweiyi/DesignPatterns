package builder;

/**
 * TODO
 *
 * @author 司松坡
 * @createTime 2023年04月20日
 */
public class WomanPerson extends Person{

    PersonEntity personEntity = new PersonEntity();
    @Override
    void hand() {
        personEntity.add("这是女人的手~~~");
    }

    @Override
    void head() {
        personEntity.add("这是女人的头~~~");
    }

    @Override
    void feed() {
        personEntity.add("这是女人的脚~~~");
    }

    @Override
    PersonEntity getPersonEntity() {
        return personEntity;
    }
}
