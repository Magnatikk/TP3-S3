import java.util.ArrayList;


public class EtatCivil {

	private ArrayList<Personne> registre;

	public EtatCivil(ArrayList<Personne> l) {
		registre = l;
	}


	public int nombreDeVivant() {
		int a = 0;
		for (Personne p : this.registre) {
			try {
				p.getAnneeMort();
			} catch (PasMort pasMort) {
				a++;
			}
		}
		return a;
	}

	public int nombreDeMortApres1960() {
		int a = 0;
		for (Personne p : this.registre) {
			try {
				if(p.getAnneeMort() > 1960) {
					a++;
				}
			} catch (PasMort pasMort) {
			}
		}
		return a;
	}

	public boolean tousMort() {
		boolean a = true;
		try {
			for (Personne p : this.registre) {
				p.getAnneeMort();

			}
		} catch (PasMort pasMort) {
			a = false;
		}
		return a;
	}


	public boolean auMoinsUnVivant() {
		return true;
	}

	@Override
	public String toString() {
		return "EtatCivil [registre=" + registre + "]";
	}
	
	
	

}
