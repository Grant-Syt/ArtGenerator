package art_generator;

public class ArtGeneratorPlayground {
	public static void main(String[] args) {
		
		ArtGenerator x = new ArtGeneratorImpl(500, 500);
		x.clear();
		x.drawGradient();
		System.out.println(x.saveCurrentImage("testImage"));
	}
}
