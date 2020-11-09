
public class onRoadPrice {
	// 10) WAP to print On-road price of the car, where it has 18.5% of road tax and 12.9% insurance of
	//ex-showroom price of the car
	public double CalculateOnRoadPrice(double showRoomPrice) {
		double roadTaxPercent = 18.5;
		double insuranceCostPercent = 12.9;
		double onRoadPrice = showRoomPrice + ((showRoomPrice*roadTaxPercent/100.0)+(showRoomPrice*insuranceCostPercent/100.0));
		return onRoadPrice;
	}
}
