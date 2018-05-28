package domaine;

public class PaireAvecGenericite<T> {

	T premier;
	T second;
	
	public PaireAvecGenericite (T a, T b) {
		super();
		this.premier = a;
		this.second = b;
	}

	public T getPremier() {
		return premier;
	}

	public T getSecond() {
		return second;
	}
	
}
