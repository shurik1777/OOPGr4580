package Interfaces;

import Classes.Actor;

import java.util.List;
/**
 * Интерфейс, определяющий поведение клиентов супермаркета.
 */
public interface iMarketBehaviour {
    /**
     * Метод для принятия клиента в супермаркет.
     *
     * @param actor Клиент, который будет принят в супермаркет.
     */
    void acceptToMarket(iActorBehaviour actor);
    /**
     * Метод для ухода клиентов из супермаркета.
     *
     * @param actor Список клиентов, которые уйдут из супермаркета.
     */
    void releaseFromMarket(List<Actor> actor);
    /**
     * Метод для обновления состояния супермаркета.
     */
    void update();
}
