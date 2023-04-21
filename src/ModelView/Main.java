package ModelView;

/**
 * 客户端类
 *
 * @author 司松坡
 * @createTime 2023年04月21日
 */
public class Main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.setSubjectState("出差");
        concreteSubject.add(new ConcreteObserver("小明",concreteSubject));
        concreteSubject.add(new ConcreteObserver("小王",concreteSubject));
        concreteSubject.add(new ConcreteObserver("小张",concreteSubject));
        concreteSubject.notifySub();
    }
}
