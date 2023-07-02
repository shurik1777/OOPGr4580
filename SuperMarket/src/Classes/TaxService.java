package Classes;

import Interfaces.iActorBehaviour;

/**
 * Класс TaxService представляет услугу по налогового аудита, который реализует интерфейс iActorBehaviuor.
 */
public class TaxService implements iActorBehaviour {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    /**
     * Конструктор класса TaxService по умолчанию. Устанавливает имя "Налоговый аудит".
     */
    public TaxService() {
        this.name = "Tax audit";
    }

    /**
     * Получает имя TaxService.
     *
     * @return Имя TaxService.
     */

    public String getName() {
        return name;
    }

    /**
     * Проверяет, может ли TaxService делать заказы.
     *
     * @return true, если TaxService может делать заказы, false в противном случае.
     */
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Проверяет, может ли TaxService принимать заказы.
     *
     * @return true, если TaxService может принимать заказы, false в противном случае.
     */
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Устанавливает возможность TaxService делать заказы.
     *
     * @param makeOrder true, если TaxService может делать заказы, false в противном случае.
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    /**
     * Устанавливает возможность TaxService принимать заказы.
     *
     * @param pickUpOrder true, если TaxService может принимать заказы, false в противном случае.
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        isTakeOrder = pickUpOrder;
    }

    /**
     * Получает объект Actor, связанный с TaxService.
     *
     * @return Объект Actor, связанный с TaxService.
     */
    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }
}
