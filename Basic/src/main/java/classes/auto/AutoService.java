package classes.auto;

/**
 * Сервис по работе с автомобилями
 */
public class AutoService {

    /**
     * Данный метод возвращает автомобили марки BMW
     * @param autos все автомобили
     * @return массив автомобилей БМВ.
     */
    public Auto[] getOnlyMercedesCars(Auto[] autos) {
        //Определяем размер нового массива
        int mercedesesCount = 0;
        for (Auto auto: autos) {
            if (auto.getManufacturer().equals("Mercedes")) {
                mercedesesCount++;
            }
        }
        //Объявляем новый массив
        Auto[] mercedesCars = new Auto[mercedesesCount];
        //Заполняем его элементами
        for (int i = 0; i < autos.length; i++) {
            int mercedesCarIndex = 0;
            if (autos[i].getManufacturer().equals("Mercedes")) {
                mercedesCars[mercedesCarIndex] = autos[i];
                mercedesCarIndex++;
            }
        }
        return mercedesCars;
    }

    /**
     * Принято считать что если автомобиль двух-местный, то он из спорт-класса
     * Данный метод возвращает автомобили спорт-класса
     * @param autos все автомобили
     * @return автомобили спорт-класса
     */
    public Auto[] getSportCars(Auto[] autos) {
        int sportcarsCount = 0;
        for (Auto auto: autos) {
            if (auto.getSeats() == 2) {
                sportcarsCount++;
            }
        }
        //Объявляем новый массив
        Auto[] sportcars = new Auto[sportcarsCount];
        //Заполняем его элементами
        for (int i = 0; i < autos.length; i++) {
            int sportcarsIndex = 0;
            if (autos[i].getSeats() == 2) {
                sportcars[sportcarsIndex] = autos[i];
                sportcarsIndex++;
            }
        }
        return sportcars;
    }

    /**
     * Данный метод возвращает автомобили только с автоматической коробкой передач
     * @param autos все автомобили
     * @return автомобили с автоматической коробкой передач.
     */
    public Auto[] getOnlyAutomaticTypeCars(Auto[] autos) {
        int automaticCarsCount = 0;
        for (Auto auto: autos) {
            if (auto.getGearbox().equals("automatic")) {
                automaticCarsCount++;
            }
        }
        //Объявляем новый массив
        Auto[] automaticCars = new Auto[automaticCarsCount];
        //Заполняем его элементами
        for (int i = 0; i < autos.length; i++) {
            int automaticCarsIndex = 0;
            if (autos[i].getSeats() == 2) {
                automaticCars[automaticCarsIndex] = autos[i];
                automaticCarsIndex++;
            }
        }
        return automaticCars;
    }
}
