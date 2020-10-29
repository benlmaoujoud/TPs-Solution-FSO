
public class Cercle {
private double r,diametre,surface;

public Cercle(double r)
{
this.r=r;
this.diametre=2*Math.PI*r;
this.surface=Math.PI*Math.pow(r,2);
}

public void setRayon(double r)
{
	this.r=r;
}

public double getRayon() {
	return r;
}

public double getDiametre() {
	return diametre;
}

public void setDiametre(double diametre) {
	this.diametre = diametre;
}

public double getSurface() {
	return surface;
}

public void setSurface(double surface) {
	this.surface = surface;
}


}