package string;

public class StringUtils {

    /**
     * Данный метод находит саммую длинную строку в массиве и возвращает объект представленный из
     * размера данной строки и её значении
     * @param strings массив строк
     * @return самая большая строка в верхнем регистре
     */
    public static BigString getTheBiggestStringFromArray(String[] strings) {
        String biggestString = null;
        int biggestStringSize = 0;
        for (int i = 0; i < strings.length; i++) {
            if (biggestStringSize < strings[i].length()) {
                biggestStringSize = strings[i].length();
                biggestString = strings[i];
            }
        }
        return new BigString(biggestString, biggestStringSize);
    }
}
