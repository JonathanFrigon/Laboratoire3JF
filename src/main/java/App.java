

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static int Monnaie = 20;
	
    public static void main( String[] args )
    {
        System.out.println("Doubler votre argent aujourdhui!");
        Monnaie = hasard(Monnaie);
        System.out.println("Bravo vous avez : " + Monnaie);
    }
    
    public static int hasard(int monnaie){	
    	return monnaie*2;
    }
}
