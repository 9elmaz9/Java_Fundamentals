package Quiz;

import Quiz.QuizItem;

// Класс, представляющий вопрос викторины
class Question extends QuizItem {
    // Конструктор, вызывающий конструктор базового класса
    public Question(String text, String[] options, int correctOption, int points) {
        super(text, options, correctOption, points);
    }

    // Реализация абстрактного метода для проверки правильности ответа
    @Override
    public boolean isCorrect(int answer) {
        return answer == getCorrectOption();
    }

    public int getCorrectOption() {
        return super.correctOption;
    }
}