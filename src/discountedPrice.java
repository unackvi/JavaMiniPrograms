
public class discountedPrice {
	// 8) WAP to calculate the discount price
	public double discountPrice(double price, double discount) {
		double discountAmount = (price*discount/100.0);
		return (price - discountAmount);
	}
}
