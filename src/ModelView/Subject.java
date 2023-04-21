package ModelView;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象通知者
 *
 * @author 司松坡
 * @createTime 2023年04月21日
 */
abstract class Subject {
    List<Observer> observerList = new ArrayList<>();

    /**
     * @author 司松坡
     * @description 增加观察者
     * @date 2023/4/21
     * @param observer 要增加的观察着
     * @return 无返回
     */
    void add(Observer observer){
        observerList.add(observer);
    }

    /**
     * @author 司松坡
     * @description 移除观察者
     * @date 2023/4/21
     * @param observer 要删除的观察着
     * @return 无返回
     */
    void delete(Observer observer){
        observerList.remove(observer);
    }

    /**
     * @author 司松坡
     * @description 通知观察者
     * @date 2023/4/21
     */
    void notifySub(){
        for (Observer observer : observerList){
            observer.Update();
        }
    }



}
