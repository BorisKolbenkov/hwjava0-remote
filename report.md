# Отчёт о тестировании Credit Card Number Validator

## Краткое описание

17.06.2021 было проведено тестирование приложения Credit Card Number Validator.

На тестирование затрачено: 2 часа

В результате тестирования выявлены следующие дефекты:
1) [Не проходит валидация карт VISA с номером из 19-ти знаков](https://github.com/BorisKolbenkov/hwjava0-remote/issues/1#issue-924166626)
2) [Не проходит валидация карт Discover с номером из 19-ти знаков](https://github.com/BorisKolbenkov/hwjava0-remote/issues/2#issue-924174869)
3) [Не проходит валидация карт American Express](https://github.com/BorisKolbenkov/hwjava0-remote/issues/3#issue-924186343)
4) [Не проходит валидация карт JCB с номером из 19-ти знаков](https://github.com/BorisKolbenkov/hwjava0-remote/issues/4#issue-924189569) 

## Описание процесса тестирования

В процессе тестирования использовались следующие артефакты*:
* [Входные данные в Задаче №1](https://github.com/netology-code/javaqa-homeworks/tree/master/intro#%D0%B7%D0%B0%D0%B4%D0%B0%D1%87%D0%B0-1---credit-card-number-validator)
В качестве тестовых данных использовался код программы: 
```public class Main {
    public static void main(String[] args) {
        String number = "3541673939751610";
        System.out.println(String.format("Result is %s", isValidCardNumber(number) ? "OK" : "FAIL"));
    }

    public static boolean isValidCardNumber(String number) {
        if (number == null) {
            return false;
        }

        if (number.length() != 16) {
            return false;
        }
```

        

* [Скрин с номерами используемых карт](https://drive.google.com/file/d/1YRzmu-9V9OoXHvhnWLZ9DgNjAW2VdQy3/view?usp=sharing)


В качестве тестовых данных использовались данные карт с  сайта https://www.freeformatter.com/credit-card-number-generator-validator.html:

## Тестирование работы приложения:

 * Запустить установленную программу IntelliJ IDEA
* В Project нажать Alt+Insert и выбрать Java Class
 * В поле окна New Java Class ввести Main
 * Скопировать код из тестовых данных
 * Ввести в переменной "String number" номер карты
* Нажать Ctrl+Shift+F10
* Ожидаемый результат: IS OK


Тестирование производилось в следующем окружении:
* Windows 10 x64
* Java 11
* Git Bash 
* IntelliJ IDEA  