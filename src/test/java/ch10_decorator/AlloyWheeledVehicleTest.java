package ch10_decorator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class AlloyWheeledVehicleTest {
    @Test
    void AlloyWheeledVehicleAdds250ToPrice() {
        // arrange
        Vehicle myCar = new Saloon(new StandardEngine(1300));
        myCar.paint(Vehicle.Colour.BLUE);
        int price = myCar.getPrice();

        // act
        myCar = new AlloyWheeledVehicle(myCar);

        // assert
        assertThat(myCar.getPrice()).isEqualTo(price + 250);
    }
}