public class Context {
    SortStrategy strategy; 
    public Context(SortStrategy strategy) { 
        this.strategy = strategy; 
    } 
    public void arrange(int[] input) { 
        strategy.sort(input); }
    
    public void setStrategy(SortStrategy strategy){
        this.strategy = strategy; 
    }

}
