package class17_command;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:命令模式
 * @author zzs
 * @date 2022/4/2 12:37
 */
public class Main {
    public static void main(String[] args) {
        // 单纯的命令模式
        Content c = new Content();

        Command insertCommand = new InsertCommand(c);
        insertCommand.doit();
        System.out.println(c.msg);
        insertCommand.undo();
        System.out.println(c.msg);

        Command copyCommand = new CopyCommand(c);
        copyCommand.doit();
        System.out.println(c.msg);
        copyCommand.undo();
        System.out.println(c.msg);

        Command deleteCommand = new DeleteCommand(c);
        deleteCommand.doit();
        System.out.println(c.msg);
        deleteCommand.undo();
        System.out.println(c.msg);

        // 责任链模式和命令模式结合
        List<Command> commands = new ArrayList<>();
        commands.add(new InsertCommand(c));
        commands.add(new CopyCommand(c));
        commands.add(new DeleteCommand(c));
        for (Command comm : commands) {
            comm.doit();
            System.out.println(c.msg);
        }
        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
            System.out.println(c.msg);
        }
    }
}
