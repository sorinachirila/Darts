public class Darts<sout> {
    //branch DARTS_INITIAL
    public  enum Multiplier {
        DOUBLE, TRIPLE, XX;
    }

    private int score = 301;
    private int dartsLeft = 3; //dupa fiecare turn se decrementeaza
    private boolean isFinished = false;
    private int turn = 1;//maxim 20 de turnuri
    private int lastTurnScore = score;//cum se reseteaza scorul curent

   //Darts class in MASTER
    //
    // New Comment

    public int score() {
        return score;
    }

    public int dartsLeft() {
        return dartsLeft;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public int turn() {
        return turn;
    }

    public void darts(int throwScore) {
        updateDartBoard(throwScore, null);
    }

}
