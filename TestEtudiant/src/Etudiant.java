
class Etudiant {
	
private String nom,prenom,cne;
private float note1,note2,note3;

public void init(String nom,String prenom,String cne)
{
this.nom=nom;
this.prenom=prenom;
this.cne=cne;
}

public void affiche()
{
System.out.println("Nom : "+nom+" & Prenom : "+prenom+"  CNE  : "+cne);	

}
public float getMoyenne() {
	
	return (note1+note2+note3)/3;
}	
public String getNom() {
	return nom;
	}
public String getPrenom() {
	return prenom;
	}	
public String getCne() {
	return cne;
	}	
public void setNom(String nom) {
	this.nom=nom;
    }
public void setPrenom(String prenom ) {  
	this.prenom=prenom;
    }
public void setCne(String cne ) {
	this.cne=cne;
    }
public float getNote1()
{
	return note1;
	}
public float getNote2()
{
    return note2;	
}
public float getNote3()
{
	return note3;
}

public void setNote1(float note1) {
	this.note1=note1;
    }
public void setNote2(float note2 ) {  
	this.note2=note2;
    }
public void setNote3(float note3 ) {
	this.note3=note3;
    }
public void init(String nom,String prenom,String cne,float note1,float note2,float note3)
{
this.nom=nom;
this.prenom=prenom;
this.cne=cne;
this.note1=note1;
this.note2=note2;
this.note3=note3;

}

}
