package Interfaces;

import Classes.Actor;

/**
 * Интерфейс, определяющий поведение очереди клиентов в супермаркете.
 */
public interface iQueueBehaviour {

    /**
     * Метод для добавления клиента в очередь.
     *
     * @param actor Клиент, который будет добавлен в очередь.
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * Метод для освобождения клиента из очереди.
     */
    void releaseFromQueue();

    /**
     * Метод для принятия заказа клиентом.
     */
    void takeOrder();

    /**
     * Метод для передачи заказа клиентом.
     */
    void giveOrder();
}
