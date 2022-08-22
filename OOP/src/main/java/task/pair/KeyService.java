package task.pair;

import java.math.BigInteger;
public class KeyService {

    private final char[] numbers = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /*
    В данной задаче нужно разобраться
    1. Как объединить две строки в одну.
    2. Как работает класс StringBuilder , он понадобиться для решения.
    3. Для чего понадобиться метод contains, его нужно переиспользовать.
    4. Как создать значение внутри BigInteger.
     */

    /**
     * Метод берет два ключа, отбирает из этих ключей только цифры, образуя из них значение
     * объединяет 1-ый ключ с 2-ым в огромное число и возвращает его.
     * @param pair пара ключей
     * @return значение
     */
    public BigInteger getHash(Pair pair) {
    	BigInteger firstBigInt = getOnlyIntegers(pair.getFirstKey());
		BigInteger secondBigInt = getOnlyIntegers(pair.getSecondKey());
		return new BigInteger(firstBigInt.toString() + secondBigInt.toString());
    }

    private boolean contains(char element) {
        for (char number : numbers) {
            if (number == element) {
                return true;
            }
        }
        return false;
    }

    private BigInteger getOnlyIntegers(String key) {
    	StringBuilder intString = new StringBuilder();
    	for (int i = 0; i < key.length(); i++) {
    		char currentChar = key.charAt(i);
			if (contains(currentChar)) {
				intString.append(currentChar);
			}
		}
    	if (intString.toString().equals("")) {
    		return BigInteger.ZERO;
		} else {
			return new BigInteger(intString.toString());
		}
	}
}
