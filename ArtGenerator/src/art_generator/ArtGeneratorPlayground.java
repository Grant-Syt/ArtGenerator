package art_generator;

public class ArtGeneratorPlayground {
	public static void main(String[] args) {
		ArtGeneratorImpl x = new ArtGeneratorImpl(720, 480);
		x.drawLightGradient();
		System.out.println(x.saveCurrentImage("testImage"));
	}
}
