public class Frog {
    private String name;
    private int xPos;
    private int yPos;

    public Frog(String n,int x, int y)		// constructor
    {
        name = n;
        xPos=x;
        yPos=y;
        System.out.println(name);
    }
    public void setPos(int x, int y)	// accessor methods
    {
        xPos = x;
        yPos = y;
    }
    public int getXPos()
    {
        return xPos;
    }
    public int getYPos()
    {
        return yPos;
    }
    public void moveWest()		// change the pos of the frog
    {
        xPos = xPos-1;
    }
    public void moveEast()
    {
        xPos = xPos + 1;
    }
    public void moveNorth()
    {
        yPos=yPos+1;
    }
    //TODO jump method move up and to the right
    //This method should take an integer argument.  This argument controls how many spaces
    // the frog will move both up and right.  Returns no value.
    public void jump(int x){

        xPos+=x;
        yPos+=x;

    }


    //TODO visit method moves frog to the location of the friend frog
    // This method will take an argument of type Frog.  It will find the position of the
    // frog and move to this position.
    public void visit(Frog other) {

        this.xPos=other.xPos;
        this.yPos=other.yPos;

    }

    public void eatFly()
    {
        System.out.println("Yum");
    }
    public String toString()
    {
        String s = "Hi I am "+ name +" the frog and I live at "+ xPos + " " + yPos;
        return s;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Frog f1 = new Frog("Freddy",3,4);	// create an instance of Frog
        f1.eatFly();						// call Frog methods
        f1.moveNorth();
        System.out.println(f1);

        Frog f2 = new Frog("Francine", -2,0);
        f2.eatFly();
        // TODO uncomment these to test new code.
        f2.jump(2);
        f1.visit(f2);
        System.out.println(f1);
        System.out.println(f2);

        // make a new frog named Frank.  have him jump twice and then go visit Freddy.
        Frog f3 = new Frog("Frank", 0,0); // frank lives in the origin. the housing market there is pretty neutral.
        System.out.println(f3);
        f3.jump(5);
        System.out.println(f3);
        f3.jump(2);
        System.out.println(f3);
        f3.visit(f1);
        System.out.println(f3);

    }

}

/*  Output
Freddy
Yum
Hi I am Freddy the frog and I live at 3 5
Francine
Yum
Hi I am Freddy the frog and I live at 0 2
Hi I am Francine the frog and I live at 0 2
Frank
Hi I am Frank the frog and I live at 5 5
Hi I am Frank the frog and I live at 7 7
Hi I am Frank the frog and I live at 0 2
*/