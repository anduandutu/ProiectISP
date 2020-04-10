// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package tema2_ISP;

/************************************************************/
/**
 * 
 */
public class OferteSejurHotel extends tema2_ISP.Oferte {
	OferteSejurHotel(tema2_ISP.Categorie_Oferta categorie, String detalii_oferta) {
		super(categorie, detalii_oferta);
		// TODO Auto-generated constructor stub
	}

	public String getUnitate_pret() {
		return unitate_pret;
	}

	public void setUnitate_pret(String unitate_pret) {
		this.unitate_pret = unitate_pret;
	}

	public String getTipCamera() {
		return TipCamera;
	}

	public void setTipCamera(String tipCamera) {
		TipCamera = tipCamera;
	}

	public String getFacilitati() {
		return Facilitati;
	}

	public void setFacilitati(String facilitati) {
		Facilitati = facilitati;
	}

	public int getNrZile() {
		return nrZile;
	}

	public void setNrZile(int nrZile) {
		this.nrZile = nrZile;
	}

	public float getPret_total() {
		return pret_total;
	}

	public void setPret_total() {
		this.pret_total = super.Pret*this.getNrZile();
	}

	/**
	 * 
	 */
	private String unitate_pret = "Zi";
	private String TipCamera;
	private String Facilitati;
	private int nrZile;
	private float pret_total;
};