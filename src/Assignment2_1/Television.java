public class Television {
    private boolean on;
    private int channel;

    public Television() {
        on = false;
        channel = 1;
    }

    public boolean isOn() {
        return on;
    }

    public void pressOnOff() {
        on = !on;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (on) {
            if (channel > 10) {
                this.channel = 1;
            } else if (channel >= 1) {
                this.channel = channel;
            }
        }
    }
}