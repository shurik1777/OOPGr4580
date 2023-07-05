package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Абстрактный базовый класс для клиентов.
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder {

    /**
     * Имя клиента.
     */
    protected String name;

    /**
     * Флаг, указывающий, может ли клиент принимать заказы.
     */
    protected boolean isTakeOrder;

    /**
     * Флаг, указывающий, может ли клиент осуществлять заказы.
     */
    protected boolean isMakeOrder;
    /**
     * Флаг, указывающий, может ли клиент осуществлять возврат заказов.
     */
    protected boolean isMakeReturnOrder;
    /**
     * Флаг, указывающий на возможность вернуть оплату заказа.
     */
    protected boolean isMakePaid;

    /**
     * Конструктор класса Клиент.
     *
     * @param name Имя клиента.
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Абстрактный метод для получения имени Клиента.
     *
     * @return Имя клиента.
     */
    abstract public String getName();
}