package art_generator;

public interface ArtGenerator {
	public void newImage(int x,int y);
	public void drawGradient();
	public void drawCircleWaterColor();
	public boolean saveCurrentImage(String name);
	public void clear();
	public void test();
}
