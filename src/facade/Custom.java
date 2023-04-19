package facade;

import org.junit.Test;

/**
 * 外观模式客户类
 *
 * @author 司松坡
 * @createTime 2023年04月19日
 */
public class Custom {
    Fund fund = new Fund();

    /**
     * 购买基金
     */
    @Test
    public void buy() {
        fund.buy();
    }

    /**
     * 售出基金
     */
    @Test
    public void sell() {
        fund.sell();
    }

}
