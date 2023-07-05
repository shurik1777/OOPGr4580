package Interfaces;

import Classes.Actor;

/**
 * Интерфейс для возврата товара.
 */
public interface iReturnOrder {

    /**
     * Устанавливает флаг, указывающий на возможность осуществления возврата заказа.
     *
     * @param makeReturnOrder Флаг наличия возможности возврата заказа.
     */
    void setMakeReturnOrder(boolean makeReturnOrder);

    /**
     * Устанавливает флаг, указывающий на возможность вернуть оплату заказа.
     *
     * @param makePaid Флаг наличия возможности вернуть оплату заказа.
     */
    void setMakePaid(boolean makePaid);

    /**
     * Проверяет, может ли заказ быть возвращен.
     *
     * @return true, если заказ может быть возвращен, в противном случае false.
     */
    boolean isMakeReturnOrder();

    /**
     * Проверяет, был ли заказ оплачен.
     *
     * @return true, если заказ был оплачен, в противном случае false.
     */
    boolean isMakePaid();

    /**
     * Возвращает клиента, связанного с заказом.
     *
     * @return клиент, связанный с заказом.
     */
    Actor getActor();
}
