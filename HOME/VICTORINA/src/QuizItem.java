
// Абстрактный класс, представляющий элемент викторины
public abstract  class QuizItem {


    private String text;
    private String[] options;
    protected int correctOption; // Изменим модификатор доступа на protected
    private int points;

    // Конструктор для инициализации атрибутов
    public QuizItem(String text, String[] options, int correctOption, int points) {
        this.text = text;
        this.options = options;
        this.correctOption = correctOption;
        this.points = points;
    }

    // Абстрактный метод для проверки правильности ответа
    public abstract boolean isCorrect(int answer);

    // Геттеры для доступа к атрибутам
    public String getText() {
        return text;
    }

    public String[] getOptions() {
        return options;
    }

    public int getPoints() {
        return points;
    }
}



