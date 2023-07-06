package Interfaces;

import Classes.Actor;

/**
 * Интерфейс, определяющий поведение клиентов супермаркета.
 */
public interface iActorBehaviour {
    /**
     * Проверяет, может ли клиент принять заказ.
     *
     * @return true, если клиент может принять заказ, false в противном случае.
     */
    public boolean isTakeOrder();

    /**
     * Проверяет, может ли клиент создать заказ.
     *
     * @return true, если клиент может создать заказ, false в противном случае.
     */
    public boolean isMakeOrder();

    /**
     * Устанавливает возможность клиент принимать заказ.
     *
     * @param takeOrder true, чтобы разрешить клиенту принимать заказ, false в противном случае.
     */
    public void setTakeOrder(boolean takeOrder);

    /**
     * Устанавливает возможность клиент создавать заказ.
     *
     * @param makeOrder true, чтобы разрешить клиенту создавать заказ, false в противном случае.
     */
    public void setMakeOrder(boolean makeOrder);

    /**
     * Возвращает экземпляр класса Actor, связанного с данным поведением.
     *
     * @return экземпляр класса Actor.
     */
    Actor getActor();
}
