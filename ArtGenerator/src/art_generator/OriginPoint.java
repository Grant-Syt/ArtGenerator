package art_generator;

public interface OriginPoint {
	public int getX();
	public int getY();
	public int getStrength();
	public void setColorR(int colorR);
	public void setColorG(int colorG);
	public void setColorB(int colorB);
	public void setColorAlpha(double colorAlpha);
	public int getColorR();
	public int getColorG();
	public int getColorB();
	public double getColorAlpha();
	public double getAlphaFade();
	public void setAlphaFade(double alphaFade);
}
