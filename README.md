<h1>Кредитная заявка</h1>

<h4>В данном проекте были реализованы классы:
<br>
Applicationimpl - заявка клиента, имплементирует интерфейс Application реализуя геттеры и сеттеры для таких полей как:
 private String lastName - фамилия;<br>
    private String firstName - имя; <br>
    private String patronymic - отчество;<br>
    private float incomeLevel - уровень заработка;<br>
    private String citizenship - гражданство;<br>
    private boolean snils - наличие снилса;<br>
    private boolean inn - наличие инн;<br>
    private float desiredAmount - желаемая сумма;<br>
    private boolean decision - решение о выдаче кредита;<br>
    private int age - возраст;
Для инициализации объекта данного класса необходимо передать в конструктор значения для данных полей по порядку(кроме решения)
<br>
Класс LoanApplicationProcessor реализует конвеер проверки всех условий для выдачи кредита.
<br>
 Объект инициализируется при передачи в конструктор объекта интерфейса Application. При инициализации сразу запускается метод run()
<br>
запуск проверки осуществляется через метод run()

Инициализация объектов:<br>


Результат работы:


</h4>
 

