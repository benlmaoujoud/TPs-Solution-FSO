
public class Cercle {
	
private float x,y,r;

public void init(float x,float y)
{
this.x=x;
this.y=y;
}
public void init(float r)
{
this.r=r;	
}
public void setRayon(float r)
{
this.r=r;	
}

public float getRayon()
{
return r;	
}

public void  deplacerCenter(float x, float y)
{
this.x=x;
this.y=y;
}

public void afficher()
{
	
System.out.println("Le Cercle est De Rayon : "+r+",et De Center  (x,y) = ("+x+","+y+")");

}


}
