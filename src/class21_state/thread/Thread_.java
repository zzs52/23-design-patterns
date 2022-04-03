package class21_state.thread;

/**
 * Desc:有限状态机(FSM)和状态模式有区别
 * @author zzs
 * @date 2022/4/3 22:25
 */
public class Thread_ {

    ThreadState_ state = new NewState(this);

    void move(Action input) {
        state.move(input);
    }

    void run() {
        state.run();
    }
}
