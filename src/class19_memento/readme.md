备忘录模式主要的作用是保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。

类似于：后悔药、打游戏时的存档、Windows 里的 ctr + z、浏览器中的后退、数据库的事务管理。

类上或者接口上继承Serializable接口，这样就可以对这个对象进行存档和读档操作，具体使用ObjectInputStream和ObjectOutputStream