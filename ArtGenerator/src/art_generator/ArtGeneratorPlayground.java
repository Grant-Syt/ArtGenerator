package art_generator;

public class ArtGeneratorPlayground {
	public static void main(String[] args) {
		ArtGeneratorImpl x = new ArtGeneratorImpl(500, 500);
		x.drawBoxArt();
		System.out.println(x.saveCurrentImage("boxArt"));
		x.drawCircleArt();
		System.out.println(x.saveCurrentImage("circleArt"));
		x.drawGradientBoxArt();
		System.out.println(x.saveCurrentImage("gradientBoxArt"));
		x.drawDarkGradient();
		System.out.println(x.saveCurrentImage("darkGradient"));
		x.drawLightGradient();
		System.out.println(x.saveCurrentImage("lightGradient"));
	}
}
