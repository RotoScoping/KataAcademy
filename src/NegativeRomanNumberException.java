

class NegativeRomanNumberException extends RuntimeException{
    public NegativeRomanNumberException() {
        System.out.println("Ошибка в рассчетах с помощью римских чисел! \n" +
                "Результат вычисления оказался отрицательным или меньше единицы.");
    }
}
