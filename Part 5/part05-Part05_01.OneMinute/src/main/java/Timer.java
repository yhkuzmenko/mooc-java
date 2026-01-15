public class Timer {
    private ClockHand seconds;
    private ClockHand hundredthOfASecond;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredthOfASecond = new ClockHand(100);
    }

    public void advance() {
        this.hundredthOfASecond.advance();

        if (this.hundredthOfASecond.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + hundredthOfASecond;
    }
}