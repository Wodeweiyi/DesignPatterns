package ModelView;

/**
 * 具体观察者
 *
 * @author 司松坡
 * @createTime 2023年04月21日
 */
public class ConcreteObserver extends Observer {

    private String name;

    private String observerStatus;

    private ConcreteSubject concreteSubject;

    public ConcreteObserver(String name, ConcreteSubject concreteSubject) {
        this.name = name;
        this.concreteSubject = concreteSubject;
    }

    @Override
    void Update() {
        observerStatus = concreteSubject.getSubjectState();
        System.out.println("观察者" + name + "的状态是" + observerStatus);

    }

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }
}
