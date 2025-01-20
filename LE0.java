
public class LE0
{
    int speed;
    String name;
    void setName(String name){
        this.name = name;
    }
    void setSpeed( int speed){
        this.speed = speed;
    }
    String getName(){
        return this.name;
    }
    int getSpeed(){
        return this.speed;
    }
    
	public static void main(String[] args) {
	    Main m1 = new Main();
	    m1.setName("TATA");
	    m1.setSpeed(200);
		System.out.println(m1.getName() + " " + m1.getSpeed());
	}
}