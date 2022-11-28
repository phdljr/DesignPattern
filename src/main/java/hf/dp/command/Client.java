package hf.dp.command;

import hf.dp.command.reveiver.Alarm;
import hf.dp.command.command.AlarmOnCommand;
import hf.dp.command.reveiver.Lamp;
import hf.dp.command.command.LampOnCommand;
import hf.dp.command.invoker.Button;
import info.MyHWInfo;

public class Client {
    public static void main(String[] args) {
        MyHWInfo.printInfo();

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
