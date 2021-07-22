import org.junit.Assert;
import org.junit.Test;

public class CarDetailsTest {

    @Test
    public void getCarDetails_givenValidCarReturnsExpectedString() {

        //Arrange
        Car newCar = new Car();
        newCar.setMake("Ford");
        newCar.setModel("Mustang");
        newCar.setYear("2019");


        //Act
        String details = CarUtils.getCarDetails(newCar);

        //Assert
        Assert.assertEquals("FordMustang2019", details);

    }

//    @Test
//    public void getCarDetails_givenValidCarReturnsExpectedString(){
//
//        //Arrange
//        Car newCar = new Car();
////        newCar.setMake("Ford");
////        newCar.setModel("Mustang");
////        newCar.setYear("2019");
//
//
//        //Act
//        String details = CarUtils.getCarDetails(newCar);
//
//        //Assert
//        Assert.assertEquals("FordMustang2019",details);
//
//    }

//    @Test
//    public void getCarDetails_givenTwoNullValues(){
//
//        //Arrange
//        Car newCar = new Car();
//        newCar.setMake("Ford");
////        newCar.setModel("Mustang");
////        newCar.setYear("2019");
//
//
//        //Act
//        String details = CarUtils.getCarDetails(newCar);
//
//        //Assert
//        Assert.assertEquals("FordMustang2019",details);
//
//    }

    //Update the CarUtils.getCarDetails method to now include the color of
    // the car in its returned string. Then run your tests again and
    // update the tests as needed
    @Test
    public void getCarDetails_gettingCarMillage() {

        //Arrange
        Car lastDay = new Car();
        lastDay.setMillage(4000.1);


        //Act
        CarUtils.mileageToAdd(lastDay, 5000.1);

        //Assert
        Assert.assertEquals(9000.2, lastDay.getMillage(), 0);

    }

    @Test
    public void electricMakeItTurnFalse() {

        //Arrange
        Car elonMoose = new Car();

        //Act
        CarUtils.convertToElectric(elonMoose, "juiceman");

        //Assert
        Assert.assertTrue("This is false",elonMoose.isElectric());

    }
}
