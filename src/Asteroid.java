import GLOOP.*;
public class Asteroid{ 
    private GLKugel kugel;
    //[...]

    public Asteroid(){
        kugel = new GLKugel(0,1000,0, 50, "src/Krater.jpg");
        //[...]
    }

    public void bewegeDich(){
        kugel.verschiebe(0,-0.5,0);  
        //[...]
    }

    //[...]
}