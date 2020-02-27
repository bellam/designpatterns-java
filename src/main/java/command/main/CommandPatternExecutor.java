package command.main;

import command.*;
import strategy.*;

import java.util.ArrayList;
import java.util.List;

public class CommandPatternExecutor {

    public static void main(String[] args) {

        System.out.println("*** COMMAND PATTERN *** \n");

        LightReceiver phillips = new LightReceiver();

        List<IButtonCommand> commands = new ArrayList<IButtonCommand>();

        RemoteInvoker invoker = new RemoteInvoker(
                new OnButtonCommand(phillips),
                new OffButtonCommand(phillips),
                new UpperButtonCommand(phillips),
                new DimmerButtonCommand(phillips)
        );

//        Iterator<IButtonCommand> commandIterator = commands.iterator();
//        while (commandIterator.hasNext()) {
//            IButtonCommand command = commandIterator.next();
//            command.execute();
//        }

        invoker.clickOn();
        invoker.clickOff();
        invoker.clickOn();
        invoker.clickDimmer();
        invoker.clickUpper();
        invoker.clickOff();
    }

}
