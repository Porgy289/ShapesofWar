
package pkgfinal.project.shapes.of.war;


public class Minion extends Damage {
    protected int hp;
    protected int maxhp;
    protected int damage;
    
}

public void act(){
    move();
}

public void move(){
    if (forward){
        if (position==maxpos)
            Attack();
        else{
            position++;
        }
    }
    
}
