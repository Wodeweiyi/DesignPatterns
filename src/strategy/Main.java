package strategy;

/**
 * 策略模式客户类
 *
 * @author 司松坡
 * @createTime 2023年04月23日
 */
public class Main {
    public static void main(String[] args) {
        Context context;
        context = new Context(new StrategyA());
        context.ContextInterface();

        context = new Context(new StrategyB());
        context.ContextInterface();

        context = new Context(new StrategyC());
        context.ContextInterface();

    }


}
