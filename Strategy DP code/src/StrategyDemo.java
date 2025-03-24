public class StrategyDemo {
    public static void main(String[] args) {
    int[] var = {1, 2, 3, 4, 5 }; 
    Context ctx = new Context(new BubbleSort());    
    
    ctx.arrange(var); // we can change the strategy without changing Context class 
    
    ctx.setStrategy(new QuickSort()); 
    ctx.arrange(var);
    }
    
}
