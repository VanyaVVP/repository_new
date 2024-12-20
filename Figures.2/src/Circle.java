class Circle implements Shape {
		  private double radius;
		  private String fillColor;
		  private String borderColor;

		  public Circle(double radius, String fillColor, String borderColor) {
		    this.radius = radius;
		    this.fillColor = fillColor;
		    this.borderColor = borderColor;
		  }

		  public double calculatePerimeter() {
		    return 2 * Math.PI * radius;
		  }

		  public double calculateArea() {
		    return Math.PI * radius * radius;
		  }

		  public String getFillColor() {
		    return fillColor;
		  }

		  public String getBorderColor() {
		    return borderColor;
		  }
		  public void print() {
			  System.out.println("Периметр: " + calculatePerimeter());
				System.out.println("Площадь: " + calculateArea());
				System.out.println("Цвет заливки: " + getFillColor());
				System.out.println("Цвет границы: " + getBorderColor());  
		  }
		}