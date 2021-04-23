import java.awt.*;


public class Bullet 
{
    public Bullet( double x, double y, double vx, double vy )
    {
        
        this.vx = vx;
        this.vy = vy;
    }

    public void tick()
    {
        x += vx;
        y += vy;
    }

    public void draw(Graphics2D g)
    {
        g.setColor( Color.BLACK );
        g.fillOval( getX() - getWidth(), getY() - getWidth(), 2 * getWidth(), 2 * getWidth() );
    }


    protected double vx, vy;
}
