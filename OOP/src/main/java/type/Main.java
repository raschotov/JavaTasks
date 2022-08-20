package type;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Bus bus = new Bus();
        Train train = new Train();

        /*
        Явное преобразование - это можно не делать
         */
        Vehicle airplaneVehicle = (Vehicle) airplane;
        Vehicle busVehicle = (Vehicle) bus;
        Vehicle trainVehicle = (Vehicle) train;

        Vehicle[] vehicles = {airplaneVehicle, busVehicle, trainVehicle};
        Vehicle[] vehiclesOther = {airplane, bus, train};

        System.out.println(Arrays.toString(vehicles));
        System.out.println(Arrays.toString(vehiclesOther));

        Vehicle vehicle = new Vehicle();
        Bus busOther = (Bus) vehicle; // ClassCastException
        System.out.println(busOther);

    }
}
