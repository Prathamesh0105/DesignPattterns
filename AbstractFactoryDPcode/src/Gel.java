class Gel extends Pen{
        public void write(){
            System.out.println("Gel Pen writing with=====>"+t.getClass().getName()+" Tube  "+r.getClass().getName()+" Refill");
        }
        @Override
        public String toString(){
            return "Pen with  "+t.getClass().getName()+" Tube  "+r.getClass().getName()+" Refill";
    }
}
