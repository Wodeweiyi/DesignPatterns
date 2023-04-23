package strategy;

/**
 * 上下文
 *
 * @author 司松坡
 * @createTime 2023年04月23日
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //上下文接口
    public void ContextInterface(){
        strategy.Aigorithm();
    }

}
