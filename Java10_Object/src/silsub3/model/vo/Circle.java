package silsub3.model.vo;

public class Circle {

		private final double PI = 3.14;
		private int radius;
		
		public Circle() {}

		
		
		public int getRadius() {
			return radius;
		}



		public void setRadius(int radius) {
			this.radius = radius;
		}



		public double getPI() {
			return PI;
		}



		public double incrementRadius() {
			return PI + radius;
		}
		
		
		
}
