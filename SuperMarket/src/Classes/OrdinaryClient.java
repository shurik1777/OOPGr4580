package Classes;

public class OrdinaryClient extends Actor {
    /**
     * Конструктор класса Клиент.
     *
     * @param name Имя клиента.
     */
    public OrdinaryClient(String name) {
        super(name);
    }
    /**
     * Возвращает имя клиента.
     *
     * @return Имя клиента.
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * Проверяет, делает ли клиент заказ.
     *
     * @return true, если клиент делает заказ, в противном случае - false.
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /**
     * Проверяет, берет ли клиент заказ.
     *
     * @return true, если клиент берет заказ, в противном случае - false.
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    /**
     * Устанавливает информацию о том, делает ли клиент заказ.
     *
     * @param makeOrder true, если клиент делает заказ, в противном случае - false.
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }
    /**
     * Устанавливает информацию о том, берет ли клиент заказ.
     *
     * @param takeOrder true, если клиент берет заказ, в противном случае - false.
     */
    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }
    /**
     * Проверяет, делает ли клиент возврат заказа.
     *
     * @return true, если клиент делает возврат заказа, в противном случае - false.
     */
    @Override
    public boolean isMakeReturnOrder() {
        return super.isMakeReturnOrder;
    }
    /**
     * Проверяет, производят ли клиенту возврат оплаты.
     *
     * @return true, если клиенту производят возврат оплаты, в противном случае - false.
     */
    @Override
    public boolean isMakePaid() {
        return super.isMakePaid;
    }
    /**
     * Устанавливает информацию о том, делает ли клиент возврат заказа.
     *
     * @param makeReturnOrder true, если клиент делает возврат заказа, в противном случае - false.
     */
    @Override
    public void setMakeReturnOrder(boolean makeReturnOrder) {
        super.isMakeReturnOrder = makeReturnOrder;
    }
    /**
     * Устанавливает информацию о том, производят ли клиенту возврат оплаты.
     *
     * @param makePaid true, если клиенту производят возврат оплаты, в противном случае - false.
     */
    @Override
    public void setMakePaid(boolean makePaid) {
        super.isMakePaid = makePaid;
    }
    /**
     * Возвращает экземпляр класса Actor, который является родительским классом для OrdinaryClient
     *
     * @return экземпляр класса Actor.
     */
    public Actor getActor() {
        return this;
    }
}
