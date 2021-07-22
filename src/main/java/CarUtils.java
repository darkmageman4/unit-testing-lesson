public class CarUtils {

    public static String getCarDetails(Car obj) {
        Car car = new Car();
        String make = car.getMake();
        String model = car.getModel();
        String year = car.getYear();
        String color = car.getColor();

        //use (==) to compare when checking objects not Strings
        //String use .equals
        if (make == null || model == null || year == null
                || color == null) {
            return "Not able to provide details";
        }


        return make + model + year + color;
    }

    //TODO: In CarUtils, write a static void method called addToMileage.
    // This method takes in a car object and a double 'mileageToAdd'.
    // The method will set the car's mileage to be equal to the current
    // mileage + the mileageToAddThen, write a test, following
    // Arrange/Act/Assert which tests whether the new mileage was
    // correctly added. You will probably call car.getMileage in your
    // assertion and compare it to what you expect.
    public static void mileageToAdd(Car obj, Double millage) {
        Car frogMan = new Car();
        obj.setMillage(obj.getMillage() + millage);
    }
    //TODO:In CarUtils, write a static void method called
    // convertToElectric. It takes in a car object and a String
    // 'engineType.' If the string includes the word 'electric'
    // anywhere inside, then set the car's isElectric value to be true.
    // You will use setElectric() to do that.Then, write a test following
    // Arrange/Act/Assert which tests convertToElectric on whether the
    // car's isElectric field was set when 'electric' is present in the
    // engineType string.Then, write a test to make sure that
    // convertToElectric will set the car's isElectric field regardless
    // of how the string with 'electric' is capitalized.For BOTH of these
    // tests, you will use assertTrue or assertFalse to see if
    // car.isElectric is true or false. Be sure to look at the
    // curriculum on how to use those methods!
    public static void convertToElectric(Car car, String engineType) {

        if (engineType.contains("electric")){
            car.setElectric(true);
        }
    }
}
