package Lesson21DAO.logic;

import Lesson21DAO.logic.impl.NotebookLogicImpl;

public class ProviderLogic {
    private static final ProviderLogic INSTANCE = new ProviderLogic(); // создается объект, который будет только в одном экземпляре, затем будет по ссылке к нему обращаться

    private ProviderLogic() {}

    private NotebookLogic logic = new NotebookLogicImpl();

    public NotebookLogic getNoteBookLogic() {
        return logic;
    }

    public static ProviderLogic getInstance() {
        return INSTANCE;
    }


}
