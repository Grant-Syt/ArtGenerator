package art_generator;

public class OriginPointImpl {
	private int x;
	private int y;
	private int strength;
	private int colorR;
	private int colorG;
	private int colorB;
	private double colorAlpha;
	private double alphaFade;
	
	public OriginPointImpl(int x, int y, int strength) {
		this.x = x;
		this.y = y;
		this.strength = strength;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getStrength() {
		return strength;
	}
	
	public void setColorR(int colorR) {
		this.colorR = colorR;
	}
	
	public void setColorG(int colorG) {
		this.colorG = colorG;
	}
	
	public void setColorB(int colorB) {
		this.colorB = colorB;
	}
	
	public void setColorAlpha(double colorAlpha) {
		this.colorAlpha = colorAlpha;
	}
	
	public int getColorR() {
		return colorR;
	}
	
	public int getColorG() {
		return colorG;
	}
	
	public int getColorB() {
		return colorB;
	}
	
	public double getColorAlpha() {
		return colorAlpha;
	}

	public double getAlphaFade() {
		return alphaFade;
	}

	public void setAlphaFade(double alphaFade) {
		this.alphaFade = alphaFade;
		
	}
}
