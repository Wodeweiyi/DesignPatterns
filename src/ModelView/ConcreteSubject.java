package ModelView;

/**
 * 具体通知者
 *
 * @author 司松坡
 * @createTime 2023年04月21日
 *
 */
public class ConcreteSubject extends Subject{
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }


}
