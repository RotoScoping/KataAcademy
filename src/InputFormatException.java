
class InputFormatException extends RuntimeException {
    public InputFormatException() {
        System.out.println("Невалидный ввод данных в консоль!  \n " +
                "Проверьте правильность выполнения условий ввода \n" +
                "1. Нельзя смешивать арабские и римские цифры в вводимом выражении\n" +
                "2. Использовать только доступные арифметические операции (+,-,*,/) \n" +
                "3. Доступно использование калькулятора с арабскими числами в интервале [1;10]\n" +
                "4. Доступно использование калькулятора с римскими числами в интервале [I;X]");
    }
}
