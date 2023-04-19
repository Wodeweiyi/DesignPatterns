package facade;

/**
 * 外观模式基金类
 *
 * @author 司松坡
 * @createTime 2023年04月19日
 */
public class Fund {
    Shares1 shares1;
    Shares2 shares2;
    Shares3 shares3;

    public Fund(){
        shares1 = new Shares1();
        shares2 = new Shares2();
        shares3 = new Shares3();
    }

    public void buy(){
        shares1.buy();
        shares2.buy();
        shares3.buy();
    }

    public void sell(){
        shares1.sell();
        shares2.sell();
        shares3.sell();
    }

}
