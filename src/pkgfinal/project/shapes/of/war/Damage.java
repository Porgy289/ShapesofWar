
package pkgfinal.project.shapes.of.war;



public class Damage{

    protected String name;
    protected double HP;
    protected double CurrentHP;
    protected double ATK;
    protected double DEF;

  
    public Damage(String createName, int createMaxHP, int createSTR, int createDEF) {

        name = createName;
        HP = createMaxHP;
        CurrentHP = createMaxHP;
        ATK = createSTR;
        DEF = createDEF;
    }

  
    public String getName() {
        return name;
    }

    public double getHP() {
        return CurrentHP;
    }

    public void setHP(int hp) {
        CurrentHP = hp;
    }

    public double HP() {
        return HP;
    }

    public void setMaxHP(int newMaxHp) {
        HP = newMaxHp;
    }

    public double getATK() {
        return ATK;
    }

    public void setSTR(int newSTR)
    {
        ATK = newSTR;
    }

    public double getDEF() {
        return DEF;
    }

    public void setDEF(int newDEF){
        DEF = newDEF;
    }
    
    public void takeDamage(int atk){
        if (DEF>0) 
            CurrentHP=CurrentHP-(atk*(1-DEF));
        else
            CurrentHP = CurrentHP-atk;
    }
    
    public void startHP(){
        CurrentHP=HP;
    }

    //Return ALL values
    public void getInfo() {
        System.out.println("");
        System.out.println("\t-=|STATS|=-");
        System.out.println("-------------------");
        System.out.println("Name: \t" + name);
        System.out.println("HP: \t" + CurrentHP + "/" + HP);
        System.out.println("STR: \t" + ATK);
        System.out.println("DEF: \t" + DEF);
    }

}
  

