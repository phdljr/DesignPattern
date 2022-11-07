package hf.dp.command;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        LampOnCommand lampOnCommand = new LampOnCommand(lamp);

        Alarm alarm = new Alarm();
        AlarmOnCommand alarmOnCommand = new AlarmOnCommand(alarm);

        Button button = new Button(lampOnCommand);
        button.pressed();

        button.setCommand(alarmOnCommand);
        button.pressed();
    }
}
