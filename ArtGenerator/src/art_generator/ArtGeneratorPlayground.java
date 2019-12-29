package art_generator;

public class ArtGeneratorPlayground {
	public static void main(String[] args) {
		ArtGeneratorImpl x = new ArtGeneratorImpl(6016, 3384);
		x.drawGradient();
		System.out.println(x.saveCurrentImage("testImage"));
	}
}
