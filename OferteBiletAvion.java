// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package tema2_ISP;

/************************************************************/
/**
 * 
 */
public class OferteBiletAvion extends tema2_ISP.Oferte {
	OferteBiletAvion(tema2_ISP.Categorie_Oferta categorie, String detalii_oferta) {
		super(categorie, detalii_oferta);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private String clasa_zbor;
	private int nrEscale;
	private String unitate_pret = "None";
	private float pret_total;

	public String getUnitate_pret() {
		return unitate_pret;
	}

	public void setUnitate_pret(String unitate_pret) {
		this.unitate_pret = unitate_pret;
	}

	public float getPret_unitar() {
		return pret_total;
	}

	public void setPret_unitar(float pret_total) {
		this.pret_total = pret_total;
	}

	public int getNrEscale() {
		return nrEscale;
	}

	public void setNrEscale(int nrEscale) {
		this.nrEscale = nrEscale;
	}

	public String getClasa_zbor() {
		return clasa_zbor;
	}

	public void setClasa_zbor(String clasa_zbor) {
		this.clasa_zbor = clasa_zbor;
	}
};
