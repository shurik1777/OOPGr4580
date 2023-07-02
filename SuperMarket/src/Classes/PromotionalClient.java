package Classes;

import Interfaces.iActorBehaviour;

/**
 * Класс для описания акционного клиента.
 */
public class PromotionalClient extends Actor implements iActorBehaviour {

    private static int participantCount;
    private String promotionName;
    private int clientId;

    /**
     * Конструктор класса PromotionalClient.
     *
     * @param name          имя акционного клиента
     * @param promotionName название акции
     * @param clientId      идентификатор клиента
     */
    public PromotionalClient(String name, String promotionName, int clientId) {
        super(name);
        this.promotionName = promotionName;
        this.clientId = clientId;
        participantCount++;
    }

    /**
     * Получить количество участников акции.
     *
     * @return количество участников акции
     */
    public static int getParticipantCount() {
        return participantCount;
    }

    /**
     * Получить название акции.
     *
     * @return название акции
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * Получить идентификатор клиента.
     *
     * @return идентификатор клиента
     */
    public int getClientId() {
        return clientId;
    }


    /**
     * Получить имя акционного клиента.
     *
     * @return имя акционного клиента
     */
    public String getName() {
        return name;
    }

    /**
     * Проверить возможность заказа.
     *
     * @return true, если акционный клиент может делать заказы, в противном случае - false
     */
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Проверить возможность создания заказа.
     *
     * @return true, если акционный клиент может создавать заказы, в противном случае - false
     */
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Установить возможность заказа для акционного клиента.
     *
     * @param takeOrder значение возможности заказа (true - может делать заказы, false - не может)
     */
    @Override
    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }

    /**
     * Установить возможность создания заказа для акционного клиента.
     *
     * @param makeOrder значение возможности создания заказа (true - может создавать заказы, false - не может)
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    /**
     * Получить объект акционного клиента.
     *
     * @return объект акционного клиента
     */
    @Override
    public Actor getActor() {
        return this;
    }

    /**
     * Возврат заказа акционным клиентом.
     *
     * @param market рынок, на котором происходит возврат заказа
     */
    public void returnOrder(Market market) {
        // Логика возврата заказа клиентом
        market.acceptToMarket(this);
    }

}