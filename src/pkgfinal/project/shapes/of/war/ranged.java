
package pkgfinal.project.shapes.of.war;


import java.awt.*;
import java.util.ArrayList;


public class Ranged extends Minion
{
    public Ranged( int x, int y )
    {
        super( x, y, 100, 50 );
    }

    public void shoot( ArrayList<Bullet> bullets, Minion target )
    {
        double dx = target.x - x;
        double dy = target.y - y;
        double dz = Math.sqrt( dx*dx + dy*dy );
        bullets.add( new Bullet( x, y, 8 * dx / dz, 8 * dy / dz ) );
    }

    public void draw( Graphics2D g )
    {
        g.setColor( Color.BLUE );
        g.fillRect( getX() - getWidth(), getY() - getWidth(), 2 * getWidth(), 2 * getWidth() );
        g.setColor( Color.RED );
        g.fillOval( getX() - getWidth() / 2, getY() - getWidth() / 2, getWidth(), getWidth());
    }
}

