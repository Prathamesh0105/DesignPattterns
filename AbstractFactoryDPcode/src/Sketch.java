class Sketch extends Pen{
	
        public void write(){
            System.out.println("Sketch Pen writing with=====> "+t.getClass().getName()+" Tube  "+r.getClass().getName()+" Refill");
        }
        @Override
        public String toString(){
            return "Sketch Pen with  "+t.getClass().getName()+" Tube  "+r.getClass().getName()+" Refill";
    }
}
