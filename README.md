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
<br>
Заявка будет одобрена только в том случае если:<br>
клиенту есть 18 лет; <br>
гражданство РФ(RUS);<br>
Уровень дохода превышает запрашиваемую сумму в банке;<br>
Есть СНИЛС и ИНН.<br>

Для того чтобы проверить новую заявку на кредит необходимо передать реализацию Application в LoanApplicationProcessor через метод  setApplication()<br>
и запустить проверку через метод run()<br>

При реализации проекта были использованы паттерны стратегия и цепочка обязанностей.
<br>
Инициализация объектов:<br>
![image](https://github.com/user-attachments/assets/87631385-fb37-47ba-8e2d-0bf0c1773b59)



Результат работы:<br>
![image](https://github.com/user-attachments/assets/4e51bf0d-0ac8-4961-b2c2-77288b52c8a8)



</h4>
 

